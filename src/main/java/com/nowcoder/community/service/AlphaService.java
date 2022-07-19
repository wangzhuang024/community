package com.nowcoder.community.service;

import com.nowcoder.community.dao.AlphaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//业务组件的注解，让Spring管理这个组件
@Service
public class AlphaService {

    @Autowired
    private AlphaDao alphaDao;

    //构造器
    public AlphaService() {
        System.out.println("实例化AlphaService");
    }

    // 在构造之后调用
    @PostConstruct
    public void init() {
        System.out.println("初始化AlphaService");
    }

    //在销毁对象之前销毁他
    @PreDestroy
    public void destroy() {
        System.out.println("销毁AlphaService");
    }

    public String find() {
        return alphaDao.select();
    }
}
