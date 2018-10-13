package com.blaine.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@Accessors(chain=true)方法链调用，eg:dept.setDeptno(1).setDname("sell")
public class Dept implements Serializable {
    private Long deptno;//部门编号
    private String dname;//部门名称
    private String db_source;//数据库编号
}

