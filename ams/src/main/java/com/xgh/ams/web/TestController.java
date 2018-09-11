package com.xgh.ams.web;

import com.xgh.service.PAUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by DELL on 2018/9/11.
 */
@RestController
public class TestController {

    @Autowired
    private PAUserService paUserService;

    @RequestMapping("/test")
    public String test(){
        return paUserService.getTel();
    }
}
