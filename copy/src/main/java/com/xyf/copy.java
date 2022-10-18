package com.xyf;

import java.util.ArrayList;

public class copy {
    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        User u1 = new User();
        u1.setName("xyf");
        u1.setAge(21);
        u1.setList(list);
        User u2 = (User) u1.clone();
        System.out.println("u1 与 u2 指向同一地址？" + (u1 == u2) );
        //更改克隆对象的值，看是否会影响原始对象
        u2.setAge(7);
        u2.setName("xjc");
        u2.getList().add(30);

        System.out.println(u1.toString());
        System.out.println(u2.toString());
        //浅拷贝，对于基本类型和引用类型是有区别的，基本类型直接创建一个副本，而引用类型是复制的内存地址引用。

    }
}