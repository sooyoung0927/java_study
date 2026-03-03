package com.wanted.object.work;

public class num4 {
    public static void main(String[] args) {
        String[] fruit = {"사과" , "포도", "귤", "복숭아", "참외"};

        int randomNum= (int)(Math.random()*fruit.length);

        System.out.println(fruit[randomNum]);

    }
}
