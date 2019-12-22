package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 请填写类的描述
 *
 * @author GuofanLee
 * @date 2019-12-23 01:01
 */
@Mapper
public interface DeptDao {

    Dept findById(Long id);

    List<Dept> findAll();

    boolean addDept(Dept dept);

}
