package com.zcl.demo1.service.impl;

import com.zcl.demo1.dao.Demo1Mapper;
import com.zcl.demo1.service.Demo1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class Demo1ServiceImpl implements Demo1Service {

    @Autowired
    Demo1Mapper demo1Mapper;

    @Override
    public List<Map> list(Map inParams) {
        return demo1Mapper.list(inParams);
    }
}
