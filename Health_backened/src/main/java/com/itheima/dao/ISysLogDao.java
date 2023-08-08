package com.itheima.dao;

import com.github.pagehelper.Page;
import com.itheima.pojo.Syslog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ISysLogDao {

    void insert(Syslog syslog);

    Page<Syslog> selectAll(String queryString);

    void deleteById(String id);
}
