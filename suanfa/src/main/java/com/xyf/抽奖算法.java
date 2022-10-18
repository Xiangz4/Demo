package com.xyf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/*
    思路：使用一个数组，根据每个对象的中奖概率，在数组中进行对应空间的分配，（如 50% len/2的位置都是这个元素）最后通过Random取一个数，落在数组的那个位置就是那个
*/
public class 抽奖算法 {
    private HashMap<Object,Integer> map;
    private static Object[] arr = new Object[100];
    private static Random random = new Random();

    public void setmap(HashMap<Object,Integer> map){
        this.map = map;
    }

    public Object func(){
        int index = 0;
        for(Map.Entry<Object,Integer> entry : map.entrySet()){
            int temp = index;
            for(; index < temp+entry.getValue();index++){
                arr[index] = entry.getKey();
            }
        }
        int num = random.nextInt(100);
        return arr[num];
    }

    //测试
    public static void main(String[] args) {
        抽奖算法 d = new 抽奖算法();
        HashMap<Object, Integer> map = new HashMap<>();
        map.put("xyf",50);
        map.put("asd",30);
        map.put("asdsdad",20);
        d.setmap(map);
        for (int i = 0; i < 10; i++) {
            System.out.println(d.func());
        }


    }
}
