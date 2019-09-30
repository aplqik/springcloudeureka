package com.hex.springcloud.controller;

import com.hex.springcloud.entities.DeptEntity;
import com.hex.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;


    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public boolean add(@RequestBody DeptEntity dept){
        return deptService.add(dept);
    }

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    public DeptEntity add(@PathVariable("id")Long id){
        return deptService.get(id);
    }
    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<DeptEntity> list(){
        return deptService.list();
    }
}
