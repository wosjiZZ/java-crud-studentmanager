package com.example;

import java.util.Scanner;

public class wer {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("数值");
        double t= scanner.nextDouble();
        System.out.println("华氏度转摄氏度");
        System.out.println("摄氏度转华氏度");
        int w= scanner.nextInt();
        if (w==1) {
            double a = t * 1.8 + 32;
            System.out.println(a + "华氏度");
        } else if (w==2) {
            double a=(t-32)/1.8;
            System.out.println(a + "摄氏度");

        }

        }

    }
