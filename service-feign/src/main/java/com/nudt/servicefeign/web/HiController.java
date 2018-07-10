package com.nudt.servicefeign.web;

import com.nudt.servicefeign.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created with IntelliJ IDEA.
 * Project: service-feign
 * File: HiController.java
 * Description:
 * Time: 2018/7/1 9:00
 *
 * @author ljz
 */
@RestController
public class HiController {
    @Autowired
    HiService hiService;
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name) {
        return hiService.sayHiFromClient(name);
    }
}
