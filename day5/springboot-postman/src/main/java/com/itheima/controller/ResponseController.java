package com.itheima.controller;

import com.itheima.pojo.Result;
import com.itheima.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
public class ResponseController {

    @RequestMapping("/hello1")
    public Result hello() {
        System.out.println("Hello World");
        return Result.success("Hello World");
    }

    @RequestMapping("/jsonParam1")
    public Result jsonParam(@RequestBody User user) {
        System.out.println(user);
        return Result.success(user);
    }

    // 数组参数需要添加 @RequestParam 注解才能成功封装
    @RequestMapping("/listParam1")
    public Result listParam(@RequestParam List<String> hobby) {
        System.out.println(hobby);
        return Result.success(hobby);
    }
}
