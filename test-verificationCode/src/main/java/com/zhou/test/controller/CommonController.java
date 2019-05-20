package com.zhou.test.controller;

import com.zhou.test.util.VerifyCodeUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 01384526
 * @title: CommonController
 * @projectName zhousecurity
 * @description: TODO
 * @date 2019/5/2017:23
 */
@Controller
public class CommonController {

    @RequestMapping(value = "/image", method = RequestMethod.GET)
    protected void imagesanpeng(HttpServletRequest req, HttpServletResponse resp)
            throws Exception {
        VerifyCodeUtil.getImage(new String[]{},resp);
//        request.getSession().setAttribute("verifyCode", randomText);
    }

}
