package cn.bilibili.service;

import cn.bilibili.domain.Items;

public interface ItemsService {

    /**
     * 通过id查一个
     * @param id
     * @return
     */
    public Items findById(int id);
}
