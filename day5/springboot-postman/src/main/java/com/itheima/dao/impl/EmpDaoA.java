package com.itheima.dao.impl;

import com.itheima.dao.EmpDao;
import com.itheima.pojo.Emp;
import com.itheima.utils.XmlParserUtils;
import org.springframework.stereotype.Repository;

import java.util.List;

// 将当前类声明为Spring的Bean组件，交给Spring管理
//@Component
@Repository
public class EmpDaoA implements EmpDao {

    @Override
    public List<Emp> listEmp() {
        // 加载并解析 emp.xml
        String file = this.getClass().getResource("/emp.xml").getFile();
        System.out.println("emp.xml 文件路径：" + file);
        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);
        return empList;
    }
}
