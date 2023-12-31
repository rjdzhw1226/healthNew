package com.itheima.dao;

import com.github.pagehelper.Page;
import com.itheima.pojo.Address;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AddressDao {

    Page<Address> findPage();

    void add(Address address);

    long findByAddressId(Integer id);

    void edit(Address address);

    void delete(Integer id);

    Address findUpdate(Integer id);

    List<Address> findAll();

    Address findById(Integer addressId);

    Address getByMemberId(Integer id);

    Page<Address> findByCondition(String queryString);
}
