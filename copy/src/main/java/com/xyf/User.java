package com.xyf;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User implements Cloneable{
    private String name;
    private int age;
    //引用类型
    private ArrayList<Integer> list;


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
