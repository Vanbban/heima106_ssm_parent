package com.itheima.dao;

import com.itheima.pojo.Items;

import java.util.List;

/**
 * @author: Vanbban
 * @create 2020-12-31 16:29
 */
public interface ItemsDao {
    /**
     *
     * @return
     */
   List<Items> findAll();

    /**
     *
     * @param items
     * @return
     */
   int save(Items items);
}
