package com.xyf;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Pojo implements Cloneable{
    private String name;
    private int age;
    private User user;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pojo pojo = (Pojo) super.clone();
        User user = (User) pojo.user.clone();
        pojo.setUser(user);
        return pojo;
    }
}
