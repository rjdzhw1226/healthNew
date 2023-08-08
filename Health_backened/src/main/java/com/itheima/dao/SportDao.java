package com.itheima.dao;

import com.github.pagehelper.Page;
import com.itheima.pojo.Sport;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface SportDao {
    Page<Sport> selectByCondition(String queryString);

    void add(Sport sport);

    Sport findById(Integer id);

    void edit(Sport sport);

    void delete(Integer id);

    List<Sport> findAll();

    int findCountSportName(Sport sport);
}
