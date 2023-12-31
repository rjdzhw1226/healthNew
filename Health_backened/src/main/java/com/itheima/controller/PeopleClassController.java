package com.itheima.controller;


import com.itheima.entity.PageResult;
import com.itheima.entity.QueryPageBean;
import com.itheima.service.PeopleClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 人群分类
 */
@RestController
@RequestMapping("/peopleclass")
public class PeopleClassController {
    @Autowired
    private PeopleClassService peopleClassService;


    /**
     * 分页查询
     * @param queryPageBean
     * @return
     */
    @RequestMapping("/findPage")
    public PageResult PeopleClass(@RequestBody QueryPageBean queryPageBean) {

        return peopleClassService.findPage(queryPageBean);
    }

}
