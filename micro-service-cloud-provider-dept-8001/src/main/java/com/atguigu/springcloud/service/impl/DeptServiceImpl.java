package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.DeptDao;
import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 请填写类的描述
 *
 * @author GuofanLee
 * @date 2019-12-23 01:26
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }

    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

}
