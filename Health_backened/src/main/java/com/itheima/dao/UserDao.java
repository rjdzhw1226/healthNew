package com.itheima.dao;

import com.itheima.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    public User findByUserName(String userName);

    public void save(User user);

    public void add(User userDTO);

}
