package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Dept;

import java.util.List;

/**
 * 请填写类的描述
 *
 * @author GuofanLee
 * @date 2019-12-23 01:25
 */
public interface DeptService {

    Dept get(Long id);

    List<Dept> list();

    boolean add(Dept dept);

}
