package com.itheima.service;


import com.itheima.pojo.Permission;
import com.itheima.pojo.Role;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


@Component
public class SpringSecurityUserService implements UserDetailsService {

    private static Logger logger=Logger.getLogger(SpringSecurityUserService.class);

    @Autowired
    private UserService userService;
    //根据用户名来查询用户
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        com.itheima.pojo.User user = userService.findByUserName(userName);
        logger.info("查到的用户" + user.getUsername());
        if(user == null){

            return null;
        }
        List<GrantedAuthority> list = new ArrayList<>();
        //动态为当前角色授权
        Set<Role> roles = user.getRoles();
        for (Role role : roles) {
            //授予角色
            list.add(new SimpleGrantedAuthority(role.getKeyword()));
            Set<Permission> permissions = role.getPermissions();
            for(Permission permission : permissions){
                //授权
                list.add(new SimpleGrantedAuthority(permission.getKeyword()));
            }
        }
        User userDe = new User(userName,user.getPassword(),list);
        return userDe;
    }
}
