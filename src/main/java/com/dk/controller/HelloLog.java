package com.dk.controller;

import com.dk.mapper.UserMapper;
import com.dk.pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName HelloLog
 * @Description TODO
 * @Author BinGo
 * @Date 2020/12/4 10:32
 * @Version 1.0
 **/
@Controller
@RequestMapping("hello")
public class HelloLog {


    @Resource private UserMapper userMapper;

    @RequestMapping("user")
    @ResponseBody
    public List<User> user(){
        return userMapper.selectByExample(null);
    }



    @RequestMapping("index")
    public String index(Model model){
        List<Object> list = new ArrayList<>();
        list.add('春');
        list.add('夏');
        list.add('秋');
        list.add('冬');
        model.addAttribute("list",list);

        return "index";
    }

    @RequestMapping("test")
    @ResponseBody
    public String test(String name){
        return name;
    }

    @RequestMapping("model")
    @ResponseBody
    public String model(){
        return "yes";
    }


}
