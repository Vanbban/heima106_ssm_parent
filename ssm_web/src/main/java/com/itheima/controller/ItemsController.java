package com.itheima.controller;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author: Vanbban
 * @create 2020-12-31 17:35
 */
@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;

    /**
     * 查询所有
     * @param model
     * @return
     */

    @RequestMapping("/list")
    public String list(Model model){
        //集合查询
        List<Items> items = itemsService.findAll();
        //存入回显
        model.addAttribute("items",items);
        return "items";
    }

    /***
     * 事务测试
     * 增加商品
     * @return
     */
    @RequestMapping("/save")
    public String save(Items items){
        int acount =  itemsService.save(items);
        //集合列表页跳转
        return "redirect:/items/list";
    }
}
