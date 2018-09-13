package com.xgh.ams.web;

import com.xgh.service.PAUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by DELL on 2018/9/11.
 */
@Controller
public class TestController {

    @Autowired
    private PAUserService paUserService;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return paUserService.getTel();
    }

    @RequestMapping("/test1")
    public String test1(){
        return "main";
    }

    /**
     * 查询banner信息
     */
    public String bannerPage(){

    }

}
