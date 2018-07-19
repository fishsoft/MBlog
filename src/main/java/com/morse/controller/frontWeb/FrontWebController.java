package com.morse.controller.frontWeb;

import com.morse.entites.*;
import com.morse.entites.Response.HomeBean;
import com.morse.service.postService.PostService;
import com.morse.service.userService.UserService;
import com.morse.utils.GsonUtils;
import com.morse.utils.PublicUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

/**
 * 前端页面的控制器，博客系统前端页面相对较少，所以都扔在这里了
 * Created by 程 on 2016/11/25.
 */
@Controller
@RequestMapping("/front")
@Api(value = "/front", description = "前台页面")
public class FrontWebController {

    @Autowired
    private PostService postService;
    @Autowired
    private UserService userService;

    /**
     * 返回主页面
     *
     * @return
     */
    @RequestMapping(value = "/main", method = RequestMethod.GET)
    @ApiOperation(value = "打开首页界面", notes = "首页web界面，js模板加载网页数据")
    public ModelAndView frontMain(HttpServletRequest request) throws Exception {
        ModelAndView view = new ModelAndView("frontMain");
        view.addObject("framJson", getFramJson());
        view.addObject("postsJson", findPublishPost(request, 1, 10));
        return view;
    }

    /**
     * 获取文章分页列表
     *
     * @param request  用户请求
     * @param pageNum  当前页码
     * @param pageSize 每一页的长度
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/findPublishPost", produces = {APPLICATION_JSON_UTF8_VALUE}, method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    @ApiOperation(value = "获取文章分页列表", notes = "返回文章列表，分页加载", response = PostBean.class, responseContainer = "List")
    public Object findPublishPost(HttpServletRequest request,
                                  @ApiParam(value = "当前页码,默认不能为空，否则为1", required = true,//参数是否必传
                                          defaultValue = "1" //参数默认值为1
                                  ) @RequestParam("pageNum") int pageNum, @ApiParam(value = "每一页的长度,默认不能为空，否则列表条目数量为10",
            required = true,    //参数是否必传
            defaultValue = "10" //参数默认值为1
    ) @RequestParam("pageSize") int pageSize) throws Exception {
        PageSplit page;
        ResponseList<PostBean> list = new ResponseList<>();

        if (PublicUtil.isJsonRequest(request)) {    //确认是否是post的json提交
            page = new GsonUtils().jsonRequest2Bean(request.getInputStream(), PageSplit.class);  //转换为指定类型的对象
            pageNum = page.getPageNum();
            pageSize = page.getPageSize();
        }
        if (pageNum <= 0) {
            pageNum = 1;
        }
        if (pageSize == 0) {
            pageSize = 10;
        }

        try {
            int toalNum; //总页码
            toalNum = postService.getAllCount();    //先把总条数赋值给总页数，作为缓存变量，减少下面算法的查找次数

            toalNum = toalNum % pageSize > 0 ? toalNum / pageSize + 1 : toalNum / pageSize;     //在每页固定条数下能不能分页完成，有余则加一页码

            List<PostBean> tmp = postService.findAllPublish(pageNum, pageSize);
            if (null == tmp || tmp.size() == 0) {
                list.setCode(ResponseList.EMPUTY);
                list.setMsg(ResponseList.EMPUTY_STR);
                return new GsonUtils().toJson(list);
            }
            list.setCode(ResponseList.OK);
            list.setMsg(ResponseList.OK_STR);
            list.setPageNum(pageNum);
            list.setTotalNum(toalNum);
            list.setPageSize(pageSize);
            list.setData(tmp);
            return new GsonUtils().toJson(list);
        } catch (Exception e) {
            e.printStackTrace();
            //查询失败
            list.setCode(ResponseObj.FAILED);
            list.setMsg(ResponseList.FAILED_STR);
            return new GsonUtils().toJson(list);
        }

    }

    /**
     * 查找最近的文章
     *
     * @return
     */
    @RequestMapping(value = "/findNewPost", produces = {APPLICATION_JSON_UTF8_VALUE}, method = {RequestMethod.GET, RequestMethod.POST})
    @ApiOperation(value = "获取最近文章", notes = "获取最近文章的json，具体字段请参照输出的json数据", response = PostBean.class)
    @ResponseBody
    public Object findNewPost() {
        ResponseObj<Object> responseObj = new ResponseObj<>();
        try {
            List<PostBean> allNew = postService.findAllNew();
            if (null == allNew || allNew.isEmpty()) {
                responseObj.setCode(ResponseObj.EMPUTY);
                responseObj.setMsg(ResponseObj.EMPUTY_STR);
            } else {
                responseObj.setCode(ResponseObj.OK);
                responseObj.setMsg(ResponseObj.OK_STR);
                responseObj.setData(allNew);
            }
            return new GsonUtils().toJson(responseObj);
        } catch (Exception e) {
            e.printStackTrace();
            responseObj.setCode(ResponseObj.FAILED);
            responseObj.setMsg(ResponseObj.FAILED_STR);
            return new GsonUtils().toJson(responseObj);
        }
    }

    /**
     * 获取热点文章信息
     *
     * @return
     */
    @RequestMapping(value = "/findHotPost", produces = {APPLICATION_JSON_UTF8_VALUE}, method = {RequestMethod.GET, RequestMethod.POST})
    @ApiOperation(value = "获取最热文章", notes = "获取最热文章的json，具体字段请参照输出的json数据", response = PostBean.class)
    @ResponseBody
    public Object findHotPost() {
        return findNewPost();
    }

    /**
     * 获取随机文章信息
     *
     * @return 返回json
     */
    @RequestMapping(value = "/findRandomPost", produces = {APPLICATION_JSON_UTF8_VALUE}, method = {RequestMethod.GET, RequestMethod.POST})
    @ApiOperation(value = "随机获取文章", notes = "随机获取文章的json，具体字段请参照输出的json数据", response = PostBean.class)
    @ResponseBody
    public Object findRandomPost() {
        return findNewPost();
    }

    /**
     * 获取主页的json数据，按照道理讲这里应该根据页面结构拆分组合的
     *
     * @param user 用户信息
     * @return 返回首页json
     */
    @RequestMapping(value = "/home", produces = {APPLICATION_JSON_UTF8_VALUE}, method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    @Deprecated
    public Object getHomeJson(User user) {
        if (null != user) {
            //埋点，AOP日志记录
        }
        HomeBean homeBean = new HomeBean(); //首页内容
        HomeBean.DataBean dataBean = new HomeBean.DataBean();   //首页下面的Data内容对象
        try {
            int toalNum; //总页码

            toalNum = postService.getAllCount();    //先把总条数赋值给总页数，作为缓存变量，减少下面算法的查找次数

            toalNum = toalNum % 10 > 0 ? toalNum / 10 + 1 : toalNum / 10;     //在每页固定条数下能不能分页完成，有余则加一页码

            List<PostBean> postsData = postService.findAllPublish(1, 10);   //首页下面的文章内容
            List<PostBean> newData = postService.findAllNew();   //首页下面的文章内容
            if (null == postsData || postsData.isEmpty()) {
                dataBean.setPosts(null);
            } else {
                dataBean.setPosts(postsData);   //首页文章列表信息设定
            }
            if (null == newData || newData.isEmpty()) {
                dataBean.setNewPosts(null);
                dataBean.setHotPosts(null);
                dataBean.setRandomPosts(null);
            } else {
                dataBean.setNewPosts(newData);   //首页文章列表信息设定
                dataBean.setHotPosts(newData);
                dataBean.setRandomPosts(newData);
            }
            List<DateCountBean> allPostDateCount = postService.getAllPostDateCount();
            if (null != allPostDateCount && !allPostDateCount.isEmpty()) {
                dataBean.setDate(allPostDateCount);
            } else {
                dataBean.setDate(null);
            }
            //设置作者信息
            List<HashMap<String, String>> userMeta = userService.getUserMeta(1);
            dataBean.setAuthor(userMeta);

            dataBean.setPageNum(1);
            dataBean.setPageSize(10);
            dataBean.setTotalNum(toalNum);
            homeBean.setData(dataBean);
            homeBean.setCode(ResponseObj.OK);
            homeBean.setMsg(ResponseList.OK_STR);
            return new GsonUtils().toJson(homeBean);
        } catch (Exception e) {
            e.printStackTrace();
            //查询失败
            homeBean.setCode(ResponseObj.FAILED);
            homeBean.setMsg(ResponseList.FAILED_STR);
            return new GsonUtils().toJson(homeBean);
        }
    }

    /**
     * 页面框架的变化信息
     * 1、个人信息
     * 2、最新热点随机文章信息
     * 3、标签信息
     *
     * @return
     */
    @RequestMapping(value = "/getFramJson", produces = {APPLICATION_JSON_UTF8_VALUE}, method = {RequestMethod.GET, RequestMethod.POST})
    @ApiOperation(value = "获取主题框架的json", notes = "整个页面的主体框架的json数据")
    @ResponseBody
    public Object getFramJson() {
        HomeBean homeBean = new HomeBean(); //首页内容
        HomeBean.DataBean dataBean = new HomeBean.DataBean();   //首页下面的Data内容对象
        try {
            List<PostBean> newData = postService.findAllNew();
            if (null == newData || newData.isEmpty()) {
                //页面上面推荐的文章信息不为空
                dataBean.setNewPosts(null);
                dataBean.setHotPosts(null);
                dataBean.setRandomPosts(null);
            } else {
                //首页文章列表信息设定
                dataBean.setNewPosts(newData);
                dataBean.setHotPosts(newData);
                dataBean.setRandomPosts(newData);
            }

            //日期归档
            List<DateCountBean> allPostDateCount = postService.getAllPostDateCount();
            if (null != allPostDateCount && !allPostDateCount.isEmpty()) {
                dataBean.setDate(allPostDateCount);
            } else {
                dataBean.setDate(null);
            }
            //设置作者信息
            List<HashMap<String, String>> userMeta = userService.getUserMeta(1);
            dataBean.setAuthor(userMeta);

            homeBean.setData(dataBean);
            homeBean.setCode(ResponseObj.OK);
            homeBean.setMsg(ResponseList.OK_STR);
            return new GsonUtils().toJson(homeBean);
        } catch (Exception e) {
            e.printStackTrace();
            //查询失败
            homeBean.setCode(ResponseObj.FAILED);
            homeBean.setMsg(ResponseList.FAILED_STR);
            return new GsonUtils().toJson(homeBean);
        }
    }

    /**
     * 根据作者的ID获取作者的信息
     *
     * @param userId 作者ID
     * @return 返回作者的json信息
     */
    @RequestMapping(value = "/getAuthorInfo", produces = {APPLICATION_JSON_UTF8_VALUE}, method = {RequestMethod.GET, RequestMethod.POST})
    @ApiOperation(value = "获取作者信息", notes = "获取作者基本信息的json，具体字段请参照输出的json数据", response = PostBean.class)
    @ResponseBody
    public Object getAuthorJson(int userId) {
        ResponseObj<Object> responseObj = new ResponseObj<>();
        try {
            List<HashMap<String, String>> userMeta = userService.getUserMeta(userId);
            if (null == userMeta || userMeta.isEmpty()) {
                responseObj.setCode(ResponseObj.EMPUTY);
                responseObj.setMsg(ResponseObj.EMPUTY_STR);
            } else {
                responseObj.setCode(ResponseObj.OK);
                responseObj.setMsg(ResponseObj.OK_STR);
                responseObj.setData(userMeta);
            }
            return new GsonUtils().toJson(responseObj);
        } catch (Exception e) {
            e.printStackTrace();
            responseObj.setCode(ResponseObj.FAILED);
            responseObj.setMsg(ResponseObj.FAILED_STR);
            return new GsonUtils().toJson(responseObj);
        }
    }

    /**
     * RESTful风格的文章页面
     *
     * @param postId 文章ID
     * @return 返回文章页面
     */
    @RequestMapping(path = "/post/{postId}", method = RequestMethod.GET)
    @ApiOperation(value = "打开文章详情web界面", notes = "文章详情web界面，js模板加载网页数据")
    public ModelAndView getPostView(@PathVariable int postId) {
        ModelAndView resultView = new ModelAndView("frontPost");
        resultView.addObject("framJson", getFramJson());
        resultView.addObject("postJson", getPostById(postId));
        return resultView;
    }

    /**
     * 根据文章ID获取文章内容
     *
     * @param postId 文章ID
     * @return 返回文章ID对应的文章内容
     */
    @RequestMapping(value = "/getPost"
            , produces = {APPLICATION_JSON_UTF8_VALUE}
            , method = {RequestMethod.GET, RequestMethod.POST})
    @ApiOperation(value = "根据id获取文章json", notes = "根据文章的ID获取文章的详情json", response = PostBean.class)
    @ResponseBody
    public Object getPostById(@ApiParam(value = "文章ID", required = true) @RequestParam("postId") int postId) {
        ResponseObj<Object> responseObj = new ResponseObj<>();
        try {
            PostBean postBean = postService.findPostById(postId);
            if (null == postBean) {
                responseObj.setCode(ResponseObj.EMPUTY);
                responseObj.setMsg(ResponseObj.EMPUTY_STR);
            } else {
                responseObj.setCode(ResponseObj.OK);
                responseObj.setMsg(ResponseObj.OK_STR);
                responseObj.setData(postBean);
            }
            return new GsonUtils().toJson(responseObj);
        } catch (Exception e) {
            e.printStackTrace();
            responseObj.setCode(ResponseObj.FAILED);
            responseObj.setMsg(ResponseObj.FAILED_STR);
            return new GsonUtils().toJson(responseObj);
        }
    }

}
