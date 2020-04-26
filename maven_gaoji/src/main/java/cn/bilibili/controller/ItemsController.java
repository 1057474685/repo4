package cn.bilibili.controller;

import cn.bilibili.domain.Items;
import cn.bilibili.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/findById")
    public @ResponseBody Items findById(){
        System.out.println("controller层findById");
        Items items = itemsService.findById(1);
        System.out.println(items);
        return items;
    }

    @RequestMapping("/demo01")
    public String demo01(){
        System.out.println("items/demo01执行..");
        Items items = itemsService.findById(1);
        System.out.println(items);
        return "success";
    }
}
