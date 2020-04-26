package cn.bilibili.dao;

import cn.bilibili.domain.Items;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository("ItemsDao")
public interface ItemsDao {


    /**
     * 通过id查找一条
     * @param id
     * @return
     */
    @Select("SELECT * FROM Items WHERE id=#{id}")
    public Items findById(int id);
}
