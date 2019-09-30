package com.hex.springcloud.controller;

import com.hex.springcloud.entities.DeptEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * 消费端
 */
@RestController
public class DeptConsumerController {
    private static final String REST_URL_PREFIX="http://localhost:8001";
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping(value="/consumer/dept/add")
    public boolean add(DeptEntity dept){
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept,Boolean.class);
    }
    @RequestMapping(value="/consumer/dept/get/{id}")
    public DeptEntity get(@PathVariable("id")Long id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id,DeptEntity.class);
    }
    @RequestMapping(value="/consumer/dept/list")
    public List<DeptEntity> list(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
    }
}
