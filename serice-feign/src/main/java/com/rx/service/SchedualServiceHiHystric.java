package com.rx.service;

import org.springframework.stereotype.Component;

/**
 * Created by youjin on 2017/9/13.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi  {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
