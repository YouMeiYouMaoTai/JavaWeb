package com.itheima.service.impl;

import com.itheima.dao.EmpDao;
import com.itheima.pojo.Emp;
import com.itheima.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// 将当前类声明为Spring的Bean组件，交给Spring管理
//@Component
@Service
public class EmpServiceA implements EmpService {

    // 运行时从spring容器中获取实现了 EmpDao 接口的的实例--依赖注入
    @Autowired
    private EmpDao empDao;

    @Override
    public List<Emp> listEmp() {
        List<Emp> empList = empDao.listEmp();

        for (Emp emp : empList) {
            String gender = emp.getGender();
            if ("1".equals(gender)){
                emp.setGender("男");
            }else if ("2".equals(gender)){
                emp.setGender("女");
            }

            String job = emp.getJob();
            if ("1".equals(job)){
                emp.setJob("讲师");
            }else if ("2".equals(job)){
                emp.setJob("班主任");
            }else if ("3".equals(job)){
                emp.setJob("就业指导");
            }
        }
        return empList;
    }
}
