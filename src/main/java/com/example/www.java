package com.example;
public class www {
    public static void main(String[] args)
    {
        System.out.println("2的10次方" + sss(2,10));
        System.out.println("3的5次方" + sss(3,5));
        System.out.println("5的0次方" + sss(5,0));
    }
    public static double sss(double a,int b)
    {
        if (b==0){
            return 1;
        }
         if (b%2!=0){
             return a*sss(a,b-1);

         }
         return sss(a*a,b/2);
    }
}