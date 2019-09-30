package com.hex.springcloud.service;

import com.hex.springcloud.entities.DeptEntity;

import java.util.List;

public interface DeptService {

    //添加
    public boolean add(DeptEntity dept);
    //根据id查询
    public DeptEntity get(Long id);
    //查询所有
    public List<DeptEntity> list();
}
