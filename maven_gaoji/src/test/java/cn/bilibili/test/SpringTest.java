package cn.bilibili.test;

import cn.bilibili.domain.Items;
import cn.bilibili.service.ItemsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class SpringTest {

    @Autowired
    private ItemsService itemsService;

    @Test
    public void demo01Spring(){
        itemsService.findById(1);
    }

    @Test
    public void demo02SpringAndMybatis(){
        Items items = itemsService.findById(1);
        System.out.println(items);
    }
}
