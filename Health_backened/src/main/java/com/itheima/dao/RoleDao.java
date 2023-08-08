package com.itheima.dao;

import com.itheima.pojo.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.Set;
@Mapper
public interface RoleDao {
    public Set<Role> findByUserId(Integer userId);
}
