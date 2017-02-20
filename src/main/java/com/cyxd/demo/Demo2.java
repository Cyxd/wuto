package com.cyxd.demo;

/**
 * Created by cyxd on 2017/02/16.
 */
public class Demo2 {

    public static void main(String[] args) throws Exception {

        System.getProperties().forEach((k, v) -> System.out.println(k + "---->" + v));

        System.getenv().forEach((k, v) -> System.out.println(k + "---->" + v));


    }

}
