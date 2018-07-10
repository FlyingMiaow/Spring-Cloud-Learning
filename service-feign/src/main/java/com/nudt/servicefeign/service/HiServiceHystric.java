package com.nudt.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * Project: service-feign
 * File: HiServiceHystric.java
 * Description:
 * Time: 2018/7/5 10:53
 *
 * @author ljz
 */
@Component
public class HiServiceHystric implements HiService {
    @Override
    public String sayHiFromClient(String name) {
        return "Sorry " + name + ", the service has been shut down!";
    }
}
