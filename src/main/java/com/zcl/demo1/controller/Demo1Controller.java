package com.zcl.demo1.controller;

import com.zcl.demo1.service.Demo1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class Demo1Controller {

    @Autowired
    Demo1Service demo1Service;

    @PostMapping("lst")
    public List<Map> list(@RequestBody Map inParams){
        List<Map> list =  demo1Service.list(inParams);
        return list;
    }



}
