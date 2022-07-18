package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

//让Spring扫描这个Bean， 与数据库相关的一般使用Repository  括号里面是Bean的名字，不加默认为类名首字母小写
@Repository("alphaHibernate")
public class AlphaDaoHibernateImpl implements AlphaDao{
    @Override
    public String select() {
        return "Hibernate";
    }
}
