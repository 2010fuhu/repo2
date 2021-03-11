package com.atguigu.java;/* *
@作者 Administrator

@创建时间  2021/3/8 23:04
*/


import com.atguigu.bean.Customer;

import java.util.ArrayList;
import java.util.Arrays;

public class TemplatesTest {

    //模板六 prsf psfi psfs
    private static final Customer cust=new Customer();
    public static final int num2=2;
    public static final String  Nation="china";
    //模板一 ；psvm
    public static void main(String[] args) {
        //模板二 ；sout soutp soutm
        System.out.println();
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplatesTest.main");
        int num1=10;
        System.out.println("num1 = " + num1);
        System.out.println(num1);
        //模板三 ：fori iter itar
        String[] arr= new String[]{"tom","hanmeimei","lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (String s : arr) {
            System.out.println(s);
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);

        }
        //模板四 list.forr fori list.for
        ArrayList list=new ArrayList();
        for (int i = 0; i < list.size(); i++) {

        }
        for (int i = list.size() - 1; i >= 0; i--) {

        }
        for (Object o : list) {

        }



    }
    public void method(){
        System.out.println("TemplatesTest.method");
        //模板五 Ifn inn
        ArrayList list=new ArrayList();
        list.add(123);
        list.add(345);

        if (list == null) {

        }
        if (list != null) {

        }
        //nn
        if (list != null) {

        }
        //null
        if (list == null) {

        }

    }

}
