package com.itheima.controller;

import com.itheima.pojo.Emp;
import com.itheima.pojo.Result;
import com.itheima.service.EmpService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {
//    // 运行时从spring容器中获取实现了 EmpService 接口的实例--依赖注入
//    @Autowired
//    // 有多个 bean 符合时，可以用 @Qualifier 指定 bean 的名称
//    @Qualifier("empServiceA")
//    private EmpService empService;

    // jdk提供的注解，可以直接从spring容器中获取实现了 EmpService 接口的实例--依赖注入
    @Resource(name = "empServiceB")
    private EmpService empService;

    // Autowired 根据类型进行 bean 注入
    // Qualifier 根据名称进行 bean 注入
    // Resource 根据名称进行 bean 注入

    @RequestMapping("/listEmp")
    public Result list() {
        List<Emp> empList = empService.listEmp();

        // 返回结果
        return Result.success(empList);
    }
}
