package com.neusoft.core.controller;

import com.neusoft.common.util.ResultOV;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/asd")
    @ResponseBody
    public String asd(){
        ResultOV asd = new ResultOV();
        return "fuhongwei";
    }
}
