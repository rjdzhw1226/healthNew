package com.itheima.dao;

import com.itheima.pojo.Permission;
import org.apache.ibatis.annotations.Mapper;

import java.util.Set;
@Mapper
public interface PermissionDao {
    public Set<Permission> findByRoleId(Integer roleId);

}
