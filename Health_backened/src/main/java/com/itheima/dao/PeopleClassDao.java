package com.itheima.dao;

import com.github.pagehelper.Page;
import com.itheima.pojo.PeopleClass;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PeopleClassDao {
    Page<PeopleClass> selectByCondition(String queryString);
}
