package cn.bilibili.service.impl;

import cn.bilibili.dao.ItemsDao;
import cn.bilibili.domain.Items;
import cn.bilibili.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ItemsService")
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;

    @Override
    public Items findById(int id) {
        System.out.println("service层findById...");
        Items items = itemsDao.findById(id);
        return items;
    }
}
