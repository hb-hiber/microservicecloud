package com.blaine.springcloud.dao;

import com.blaine.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DeptDao {
    boolean addDept(Dept dept);

    Dept findById(Long id);

    List<Dept> findAll();
}
