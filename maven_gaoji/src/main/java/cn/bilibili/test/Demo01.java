package cn.bilibili.test;

//import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Demo01 {

//    @Test
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("cjw01");
        list.add("cjw02");
        list.add("cjw03");
        list.add("cjw04");
        list.add("cjw05");
        list.add("cjw555");
        list.add("abc");
        list.add("abccjw");
//        System.out.println(list);
        list.stream().filter(s -> s.endsWith("5"))
                .forEach(System.out::println);

        //修改测试
    }
}
