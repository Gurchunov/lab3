package com.company.teachmeskills;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//
//        Main.task1(1, 5, 5);
//        System.out.println();
//        Main.task2(-1);
//        System.out.println();
//        Main.task4();
//        System.out.println();
//        Main.task5();
//        System.out.println();
        Main.task6();
    }

    //Task 1
    public static void task1(int a, int b, int c) {
        if (a + b > c & a + c > b & b + c > a) {
            System.out.println("треугольник существует!");
        } else {
            System.out.println("треугольник не существет!");
        }
    }

    //Task2
    public static void task2(int a) {
        if (a > 0) {
            a = a + 1;
            System.out.println("число " + a + " положительное");
        } else if (a < 0) {
            a = a - 2;
            System.out.println("число " + a + " отрицательное");
        } else if (a == 0) {
            a = 10;
            System.out.println("число равно " + a);
        }
    }

//    Task3
//    public static void task3(int a) {
//        if (){
//            System.out.println(a + "");
//        }
//    }

    //Task4
    public static void task4() {
        // "Перед созданием массива подумайте, какого он будет размера" - тут я все равно не понял, что нужно было сделать
        int[] array = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        for (int a : array) {
            System.out.print(a + " ");

        }
        System.out.println();
        for (int a = 0; a < array.length; a++) {
            System.out.println(a);
        }
    }

    //Task5
    public static void task5() {
        int[] array = new int[15];
        int count = 0;
        for (int a = 0; a < array.length; a++) {
            array[a] = ((int) (Math.random() * 101));
            if (array[a] % 2 == 0) {
                count++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(count);

    }

    //Task6
    public static void task6() {

        int[] array = new int[12];
        int maxNum = 0;
        int position = 0;

        for (int a = 0; a < array.length; a++) {
            array[a] = ((int) (Math.random() * 16));
        }
        for (int i : array) {
            if (i > maxNum) {
                maxNum = i;

            }

        }
        System.out.println(Arrays.toString(array));
        System.out.println("максимальное число " + maxNum + " элемент массива № ");

    }
}

