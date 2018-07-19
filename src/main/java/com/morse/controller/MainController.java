package com.morse.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 程 on 2016/11/25.
 */
@Controller
@RequestMapping("/main")
//@Api(value = "/main", description = "主要入口控制器")
public class MainController {
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    @ApiOperation(value = "打开用户登录界面", notes = "返回用户登录界面")
    public String userLogin() {
        return "userLogin";
    }
}
