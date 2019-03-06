package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int swt, x=0, y=0,z=0, a=2;
       double i, f;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите режим домашнего задания от 1 до 10 ");
        swt = scanner.nextInt();

        switch (swt) {
            case 1:

                System.out.println("Составить программу для вычисления значений функции F");
                System.out.println("Введите диапазон функции от a до b");
                x=scanner.nextInt();
                y=scanner.nextInt();
                System.out.println("Введите шаг функции");
                z=scanner.nextInt();
                System.out.println("F(x)= x - sin(x)");
                for (i = x; i<=y; i +=z){
                    f = i - Math.sin(i);
                    System.out.println("F = " + f + " x = " + i);
                }
                System.out.println("F(x) = sin^2 x");
                for (i = x; i<=y; i +=z){
                    f = Math.pow(Math.sin(i), 2);
                    System.out.println("F = " + f + " x = " + i);
                }
                System.out.println("F(x) = 2cos(x) - 1");
                for (i = x; i<=y; i +=z){
                    f = (Math.cos(i)*2)-1;
                    System.out.println("F = " + f + " x = " + i);
                }
                break;
            case 2:
                System.out.println("Написать программу вычисления функции y=ax^2+b");
                for (i=1; i<=5; i +=0.5){
                    f = 3 * Math.pow(i,2)-5;
                    System.out.println("y = " + f + " x = " + i);
                }
                break;
            case 3:
                for (i = 100; ;i++){
                    if (x==15) break;
                    else if (i % 19==0){
                        System.out.println(i);
                        x++;
                    }
                }
                break;
            case 4:
                for (i = 500; ;i++){
                    if (x==20){
                        break;
                    }
                    else if (i % 13==0 || i%17==0){
                        System.out.println(i);
                        x++;
                    }
                }
            case 5:
                System.out.println("Введите предел ");
                x= scanner.nextInt();
                while (a <= x){
                    y = a;
                    a = a + 4;
                    z++;
                }
                System.out.println("Число слагаемых " + z + " Сумма " + a + " Последнее слагаемое " + y);
                break;
            case 6:
                int sum =0;
                for (i=1; ; i += 4){
                    if (x == 10)break;
                    sum += (int)i;
                    x++;

                }
                System.out.println("Сумма " + sum);
                break;
            case 7:
                System.out.println("Выберите фигуру: " + "\n1) Квадрат" + "\n2) Прямоугольный треугольник" + "\n3) Треугольник" + "\n4) Ромб");
                a = scanner.nextInt();
                if (a==1) {
                    for (i = 0; i < 10; i++) {
                        for (int j = 0; j < 10; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                }
                if (a==2){
                    for (int j = 1; j <= 10; ++j) {
                        for (int k = 1; k <= j ; ++k) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                }
                if (a==3){
                    int k=0;
                    for( i = 1; i <= 10; ++i, k = 0) {
                        for(int s = 1; s <= 10 - i; ++s) {
                            System.out.print("  ");
                        }

                        while(k != 2 * i - 1) {
                            System.out.print("* ");
                            ++k;
                        }

                        System.out.println();
                    }
                }
                if (a==4){
                    int s =9;
                    for (int j = 1; j <= 10; j++)
                    {
                        for (i = 1; i <= s; i++)
                        {
                            System.out.print(" ");
                        }
                        s--;
                        for (i = 1; i <= 2 * j - 1; i++)
                        {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    s = 1;
                    for (int j = 1; j <= 10 - 1; j++)
                    {
                        for (i = 1; i <= s; i++)
                        {
                            System.out.print(" ");
                        }
                        s++;
                        for (i = 1; i <= 2 * (10 - j) - 1; i++)
                        {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                }
        }
    }
}

