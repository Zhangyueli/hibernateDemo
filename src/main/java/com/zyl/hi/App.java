package com.zyl.hi;

import com.zyl.hi.entities.Stock;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import java.util.Iterator;
import java.util.List;

/**
 * Hello world!
 * 0.通过类创建表 : <property name="hbm2ddl.auto">update</property>
 *1.获取存入的id并查出
 * 2.crud
 * 3.解决字段名与实体类属性名不相同的冲突
 * 4.实现关联表查询
 * 5.调用存储过程
 * 6.缓存
 */

public class App 
{
    public static void main( String[] args )
    {
        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Stock stock = new Stock();

        stock.setStockCode("4715");
        stock.setStockName("GENM");
        session.save(stock);
        transaction.commit();
        Object o = session.get(Stock.class, stock.getStockId());
        System.out.println(o);
        Transaction transaction1 = session.beginTransaction();
        session.update(stock);
        transaction1.commit();
        Object o1 = session.get(Stock.class, stock.getStockId());
        System.out.println(o1);
        String hql="from Stock";
        List list = session.createQuery(hql).list();

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        session.clear();
        sessionFactory.close();
    }
}
