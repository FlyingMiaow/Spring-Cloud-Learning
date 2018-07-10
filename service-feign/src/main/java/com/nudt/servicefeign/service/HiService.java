package com.nudt.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created with IntelliJ IDEA.
 * Project: service-feign
 * File: HiService.java
 * Description:
 * Time: 2018/7/1 8:56
 *
 * @author ljz
 */
@FeignClient(value = "service-Hi", fallback = HiServiceHystric.class)
public interface HiService {
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClient(@RequestParam(value = "name") String name);
}
