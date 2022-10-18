package com.xyf;

public class deep_copy {

    public static void main(String[] args) throws CloneNotSupportedException {
        User u1 = new User("xyf",21,null);
        Pojo pojo = new Pojo("xxx",1,u1);
        Pojo clone = (Pojo) pojo.clone();

        clone.getUser().setAge(203);

        System.out.println(pojo.toString());
        System.out.println(clone.toString());

        //在clone方法中，对于引用类型调用clone方法，之后将返回的对象注入原对象中达到深拷贝的效果
    }


}
