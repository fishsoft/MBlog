package com.morse.service.postService;

import com.morse.dao.PostDao;
import com.morse.entites.DateCountBean;
import com.morse.entites.PostBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by 程 on 2016/11/27.
 */
@Service("postService")
public class PostServiceImpl implements PostService {

    @Autowired
    private PostDao dao;

    @Override
    public void add(PostBean postBean) throws Exception {

    }

    @Override
    public List<PostBean> findAll(int pageNum, int pageSize) {
        return null;
    }

    @Override
    public PostBean findOneById(Serializable id) {
        return dao.findOneById(id);
    }

    @Override
    public List<PostBean> findAllPublish(int pageNum, int pageSize) {
        //因为数据库内容是从第一条出的数据，所以我们查询的 起始位置 = 页码 * 条数 + 1；
        pageNum -= 1;
        return dao.findAllPublish(pageNum * pageSize + 1, pageSize);
    }

    @Override
    public int getAllCount() {
        return dao.getAllCount();
    }

    @Override
    public List<PostBean> findAllNew() {
        return dao.findAllNew();
    }

    @Override
    public List<DateCountBean> getAllPostDateCount() {
        /*
         * 这里存入的json数据为：
         *  [ {"date": "2015-11-16", "idList": [ "75", "73"] } ]
         *  解释一下：日期归档本身应该是个下拉列表。下拉列表中的某个item包含了这个日期有：文章数量，文章ID
         */
        List<PostBean> tmpList = new ArrayList<>(); //创建日期归档的数据集合
        if (null != dao.getAllPostDateCount()
                && !dao.getAllPostDateCount().isEmpty()) {  //从dao层获取的文章日期和ID的集合不为空
            tmpList.addAll(dao.getAllPostDateCount());  //先将获取的数据存入缓存变量中，避免多次读取数据库
            List<DateCountBean> myDateCount = new ArrayList<>();    //创建一个日期归档的集合格式和上面所诉的json数据格式相同
            //也就是外层是一个集合，里面是多个对象
            for (PostBean tmpBean : tmpList) {  //遍历获取文章信息数据
                DateCountBean dateCountBean = new DateCountBean();  //创建文章信息缓存的对象
                if (!myDateCount.isEmpty() &&
                        DateFormat.getDateInstance().format(tmpBean.getPostDate().getTime()).equals(myDateCount.get(myDateCount.size() - 1).getDate())) {
                    //上一个日期和当前日期的相同，则只需存入ID
                    myDateCount.get(myDateCount.size() - 1).getIdList().add(tmpBean.getId());
                } else {    //集合为或者上一条的日期和当前的日期不相同，添加一条数据
                    //把文章缓存信息添加到集合中
                    dateCountBean.setDate(DateFormat.getDateInstance().format(tmpBean.getPostDate().getTime()));    //日期格式化，把date格式化为String，也就是2015-09-28 00:01:07 ==> 2015-09-28
                    List<String> idList = new ArrayList<>();
                    idList.add(tmpBean.getId());
                    dateCountBean.setIdList(idList);
                    myDateCount.add(dateCountBean);
                }
            }
            return myDateCount;
        } else return null;
    }

    @Override
    public PostBean findPostById(Serializable postId) {
        return dao.findOneById(postId);
    }
}
