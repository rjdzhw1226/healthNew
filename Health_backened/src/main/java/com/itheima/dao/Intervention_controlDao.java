package com.itheima.dao;

import com.github.pagehelper.Page;
import com.itheima.pojo.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Intervention_controlDao {
    //分页查询
    Page<Member> selectIntervenByCondition(String queryString);
}
