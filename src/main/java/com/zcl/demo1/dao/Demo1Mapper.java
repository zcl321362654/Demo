package com.zcl.demo1.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface Demo1Mapper {

    List<Map> list(Map inParams);
}
