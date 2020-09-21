package com.company;
import java.util.Scanner;

public class Main
{
    public static double Calc_hypot (double cat1, double cat2)
    {
        return Math.sqrt(cat1 * cat1 + cat2 * cat2);
    }
    public static void Show_info( double a) {
        System.out.println(a);
    }

    public static double Calc_radius(double c)
    {
        return c/2;
    }

    public static double Square(double r, double pi)
    {
        return pi * r * r;
    }


    public static void main(String[] args)
    {
        final double pi = 3.14;
        double cat1, cat2,  r, s;
        System.out.println("Введите длину катета ");
        Scanner num = new Scanner(System.in);
        cat1 = num.nextDouble();
        cat2 = cat1;

        System.out.print("Длина второго катета = ");
        Show_info(cat2);

        double c = Calc_hypot(cat1,cat2);
        System.out.printf("Длина гипотенузы = %1$.2f ", c);
        System.out.println();
        r = Calc_radius(c);

        System.out.printf("Радиус окружности равен = %1$.2f ", r);
        System.out.println();

        s = Square(r, pi);
        System.out.printf("Для круга R = %1$.2f площадь s = %2$.2f",r,s );

    }
}


