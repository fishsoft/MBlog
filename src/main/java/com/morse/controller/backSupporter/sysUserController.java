package com.morse.controller.backSupporter;

import com.morse.entites.ResponseObj;
import com.morse.entites.User;
import com.morse.service.userService.UserService;
import com.morse.utils.EncryptUtils;
import com.morse.utils.GsonUtils;
import com.morse.utils.PublicUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;


/**
 * Created by mac on 2016/12/17.
 */
@Controller
@RequestMapping(value = "/user")
@Api(value = "/user", description = "用户相关")
public class sysUserController {

    @Autowired
    public UserService userService;

    @RequestMapping(value = "/login", produces = {APPLICATION_JSON_UTF8_VALUE}, method = RequestMethod.POST)
    @ApiOperation(value = "用户登录", notes = "用户登录的接口，输入用户名和密码进行登录", response = User.class)
    @ResponseBody
    public Object userLogin(HttpServletRequest request, @ApiParam(value = "用户名不能为空，否则不允许登录"
                                    , required = true) @RequestParam("userLogin") String userLogin,
                            @ApiParam(value = "用户密码不能为空且必须为16位小写MD5，否则不允许登录"
                                    , required = true) @RequestParam("userPass") String userPass) {
        ResponseObj<User> responseObj = new ResponseObj<>();
        User user;
        if (PublicUtil.isJsonRequest(request)) {    //确认是否是post的json提交
            try {
                user = new GsonUtils().jsonRequest2Bean(request.getInputStream(), User.class);  //转换为指定类型的对象
                userLogin = user.getUserLogin();
                userPass = user.getUserPass();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (StringUtils.isEmpty(userLogin) || StringUtils.isEmpty(userPass)) {
            responseObj.setCode(ResponseObj.FAILED);
            responseObj.setMsg("用户名和密码不能为空！请检查！");
            return new GsonUtils().toJson(responseObj);
        }

        user = userService.findOneById(userLogin);

        if (null == user) {
            responseObj.setCode(ResponseObj.EMPUTY);
            responseObj.setMsg("用户不存在！请检查!");
            return new GsonUtils().toJson(responseObj);
        }

        userPass = userPass.toLowerCase();  //将大写md5转换为小写md5

        if (userPass.length() > 16 && userPass.length() == 32) {    //32位小写转换为16位小写
            userPass = userPass.substring(8, 24).toLowerCase();
        } else if (userPass.length() > 32) {
            responseObj.setCode(ResponseObj.FAILED);
            responseObj.setMsg("密码不规范！请检查！");
            return new GsonUtils().toJson(responseObj);
        }

        String encryptPassword = EncryptUtils.encryptPassword(userPass, user.getUserActivationKey());

        if (!encryptPassword.equals(user.getUserPass())) {
            responseObj.setCode(ResponseObj.FAILED);
            responseObj.setMsg("用户名和密码不匹配！请检查！");
            return new GsonUtils().toJson(responseObj);
        }

        user.setUserPass(request.getSession().getId()); //将sessionId放入用户信息中
        user.setUserActivationKey("");  //将用户注册的salt清空
        user.setUserUrl("/user/endSupport/index");

        responseObj.setData(user);
        responseObj.setCode(ResponseObj.OK);
        responseObj.setMsg("登录成功");

        return new GsonUtils().toJson(responseObj);
    }

    @RequestMapping(value = "/endSupport/index", method = RequestMethod.GET)
    @ApiOperation(value = "用户后端入口", notes = "后端入口页面，自动检查用户信息是否存在，不存在则去登录")
    public String endSupportIndex() {
        return "endSupport/index";
    }

}
