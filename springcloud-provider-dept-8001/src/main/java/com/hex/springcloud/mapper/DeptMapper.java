package com.hex.springcloud.mapper;

import com.hex.springcloud.entities.DeptEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {
    //添加
    public boolean addDept(DeptEntity dept);
    //根据id查询
    public DeptEntity findById(Long id);
    //查询所有
    public List<DeptEntity> findAll();
}
