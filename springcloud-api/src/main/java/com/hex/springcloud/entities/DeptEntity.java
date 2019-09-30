package com.hex.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class DeptEntity implements Serializable {

    private  Long deptno; //主键
    private String deptName; //部门名称
    private String dbsource; //来自哪个数据库,因为微服务架构可以一个服务对应一个数据库

}
