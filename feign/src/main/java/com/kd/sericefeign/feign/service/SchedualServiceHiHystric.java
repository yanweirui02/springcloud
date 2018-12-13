package com.kd.sericefeign.feign.service;

import org.springframework.stereotype.Component;

/**
 * @author wryan
 * @version 1.0
 * @create 2018-12-13 15:27
 * @desc 断路由处理
 **/
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
