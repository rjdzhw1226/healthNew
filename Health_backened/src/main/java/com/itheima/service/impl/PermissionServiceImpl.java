package com.itheima.service.impl;

import com.itheima.entity.PageResult;
import com.itheima.entity.QueryPageBean;
import com.itheima.pojo.Permission;
import com.itheima.pojo.Role;
import com.itheima.service.PermissionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {
    @Override
    public PageResult findPage(QueryPageBean queryPageBean) {
        return null;
    }

    @Override
    public void add(Permission permission) {

    }

    @Override
    public Permission findByPmName2KeyWord(String name, String keyword) {
        return null;
    }

    @Override
    public void edit(Permission permission) {

    }

    @Override
    public List<Role> findRolesByPmId(Integer id) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<Permission> findAllPermissionZF() {
        return null;
    }
}
