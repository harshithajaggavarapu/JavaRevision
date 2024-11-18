package com.task87;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 no's");
        int x = input.nextInt();
        int y = input.nextInt();
        try{
            int ans = x/y;
            System.out.println("result is " + ans);
        }catch(ArithmeticException e){

        }
    }
}
