package com.dk.controller;

import com.dk.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName workController
 * @Description TODO
 * @Author BinGo
 * @Date 2020/12/3 19:37
 * @Version 1.0
 **/
@Controller
@RequestMapping("work")
public class workController {

    @Autowired private Student student;

    @RequestMapping("json")
    @ResponseBody
    public Student json(){
        return student;
    }
}
