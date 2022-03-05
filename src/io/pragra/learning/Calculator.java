package io.pragra.learning;

public class Calculator {
    public int sum(int a, int b) {  // sum(int,int)
        return a+b;
    }

    public int sum(int a, int b, int c) {// sum(int,int,int)
        return sum(a,b)+c;
    }

   public double sum(double a, double b) { // sum(double,double)
        return a+b;
   }

   public long sum(int a, long b) {  // sum(int,long)
        return a+b;
   }

}
