package com.task98;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTester {
    public static void main(String[] args) {
        Map<String,String> mpp = new HashMap<>();
        mpp.put("india","delhi");
        mpp.put("sk","seoul");
        mpp.put("usa","washington");
        mpp.put("uk","london");
        mpp.put("canada","ottowa");
        System.out.println("enter the name of country");
        Scanner input = new Scanner(System.in);
        String in = input.next();
        if(mpp.containsKey(in)){
            System.out.println(mpp.get(in));
        }else{
            System.out.println("sorry its not present in map");
        }
    }
}
