package org.example;

public class Polynom {

    static double spocitej(double x){
        return Math.pow(x,4) + 10*Math.pow(x,3) + 35*Math.pow(x,2) + 50*x + 24;
    }

    static double spocitej2(double x){

        double b = 1;
        b=10+b*x;
        b=35+b*x;
        b=50+b*x;
        b=24+b*x;

        return b;
    }

    public static void main(String[] args) {
        for (double i = -1.0; i < 1.0; i+=0.1) {
            System.out.println("f("+i+") ="+spocitej2(i));
        }
    }
}
