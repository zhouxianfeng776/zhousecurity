package com.zhou.test.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import com.zhou.test.mapper.MenuMapper;
import com.zhou.test.mapper.MenuOfResourceMapper;
import com.zhou.test.mapper.ResourcePathMapper;
import com.zhou.test.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 01384526
 * @title: RoleController
 * @projectName zhousecurity
 * @description: TODO
 * @date 2019/7/519:00
 */
@RestController
public class RoleController {

    @Autowired
    MenuMapper menuMapper;

    @Autowired
    ResourcePathMapper resourcePathMapper;

    @Autowired
    MenuOfResourceMapper menuOfResourceMapper;

    @RequestMapping("/role")
    public PageInfo getRoleList(@RequestParam(required = false,defaultValue = "1") Integer pageNum, @RequestParam(required = false,defaultValue = "10")Integer pageSize){
        MenuExample example=new MenuExample();
        example.setOrderByClause("menu_id asc");
        PageHelper.startPage(pageNum,pageSize);
        List<Menu> menus = menuMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo<>(menus);
        return pageInfo;
    }
    @RequestMapping("/role/{id}")
    public List<ResourcePath> getRoleList(@PathVariable("id") String id){
        MenuOfResourceExample example=new MenuOfResourceExample();
        example.createCriteria().andMenuIdEqualTo(id);
        List<MenuOfResource> menuOfResources = menuOfResourceMapper.selectByExample(example);
        ResourcePathExample pathExample=new ResourcePathExample();
        ResourcePathExample.Criteria criteria = pathExample.createCriteria();
        List<String> ids= Lists.newArrayList();
        List<ResourcePath> paths =Lists.newArrayList();
        for (MenuOfResource m :menuOfResources) {
            ids.add(m.getResourceId());
        }
        if (ids.size()>0){
            criteria.andResourceIdIn(ids);
            paths = resourcePathMapper.selectByExample(pathExample);
        }
        return paths;
    }

    @RequestMapping("/resource")
    public PageInfo getResourceList(@RequestParam(required = false,defaultValue = "1")Integer pageNum,@RequestParam(required = false,defaultValue = "10")Integer pageSize){
        ResourcePathExample example=new ResourcePathExample();
        PageHelper.startPage(pageNum,pageSize);
        List<ResourcePath> paths = resourcePathMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo<>(paths);
        return pageInfo;
    }
}
