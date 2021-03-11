package com.atguigu.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

//这是单行注释
public class HelloWorld
{

    private final int INital_size=10;
    public static void  main(String[] args){
        //region Description
        ArrayList list03=new ArrayList();

        System.out.println("你好世界1");

        System.out.println("你好世界2");
        //endregion
        Date date = new Date();
        list03.remove(0);

    }
    private String maqq(){

         return null;
    }
    public static void  method1(){
        int num =10;
        try {
            FileInputStream fis=new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
