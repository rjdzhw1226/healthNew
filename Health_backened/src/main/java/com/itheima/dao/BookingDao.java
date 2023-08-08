package com.itheima.dao;

import com.github.pagehelper.Page;
import com.itheima.pojo.Booking;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookingDao {
    //分页查询预约信息
    Page<Booking> findPage(String queryString);
}
