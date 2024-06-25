package com.itheima.controller;

import com.itheima.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
public class RequestController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @RequestMapping("/arrayParam")
    public String arrayParam(String[] hobby) {
        System.out.println(Arrays.toString(hobby));
        return "arrayParam success";
    }

    // 数组参数需要添加 @RequestParam 注解才能成功封装
    @RequestMapping("/listParam")
    public String listParam(@RequestParam List<String> hobby) {
        System.out.println(hobby);
        return "listParam success";
    }

    // 日期参数需要添加 @DateTimeFormat 注解，并指定日期格式才能成功封装
    @RequestMapping("/dateParam")
    public String dateParam(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime updateTime) {
        System.out.println(updateTime);
        return "dateParam success";
    }

    // JSON参数需要添加 @RequestBody 注解才能成功封装
    @RequestMapping("/jsonParam")
    public String jsonParam(@RequestBody User user) {
        System.out.println(user);
        return "jsonParam success";
    }

    // 路径参数需要添加 @PathVariable 注解才能成功封装
    @RequestMapping("/path/{id}")
    public String pathParam_single(@PathVariable("id") Integer id) {
        System.out.println(id);
        return "pathParam_single success";
    }
    // 多个路径参数也一样
    @RequestMapping("/path/{id}/{name}")
    public String pathParam_multi(@PathVariable("id") Integer id, @PathVariable("name") String name) {
        System.out.println(id + " " + name);
        return "pathParam_multi success";
    }
}
