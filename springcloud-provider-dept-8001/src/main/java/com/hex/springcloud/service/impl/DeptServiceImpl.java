package com.hex.springcloud.service.impl;

import com.hex.springcloud.entities.DeptEntity;
import com.hex.springcloud.mapper.DeptMapper;
import com.hex.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    public boolean add(DeptEntity dept) {
        return deptMapper.addDept(dept);
    }

    public DeptEntity get(Long id) {
        return deptMapper.findById(id);
    }

    public List<DeptEntity> list() {
        return deptMapper.findAll();
    }
}
