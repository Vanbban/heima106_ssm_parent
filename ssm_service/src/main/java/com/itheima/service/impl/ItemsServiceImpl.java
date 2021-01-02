package com.itheima.service.impl;

import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Vanbban
 * @create 2020-12-31 17:04
 */
@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private  ItemsDao itemsDao;



    /**
     * 
     * @return
     */
    @Override
    public List<Items> findAll() {
        return itemsDao.findAll();
    }

    /**
     *
     *增加商品测试事务
     * @param items
     * @return
     */
    @Override
    public int save(Items items) {
        int acount = itemsDao.save(items);

        System.out.println("acount:"+acount);

        //测试事务，如果出错，是否回滚
        //int q=10/0;

        return acount;
    }
}
