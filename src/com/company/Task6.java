package com.company;

import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        //1.Ввод данных, объявление массива и переменных
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int min = 100;
        int max = 0;
        int n = in.nextInt();
        int[][] matrix = new int[n][n];

        //Получаем время начала программы в миллисекундах
        long time = System.currentTimeMillis();
        //2. Решение с помощью циклов for
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100);//генерируем рандомные числа
            }
        }
        for (int[] row : matrix) {
            for (int item : row) {               // цикл вывода очередной строки
                System.out.print(item + "\t");   // выводим очередной элемент
            }
            System.out.println();
        }
        //Поиск максимального числа
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] >= max) {
                    max = matrix[i][j];
                    //Поиск минимального числа
                } else if (matrix[i][j] <= min) {
                    min = matrix[i][j];
                }
            }
        }
        //Вывод максимального числа, индексов строк и столбцов его повторений
        System.out.println("Максимальное число :  " + max);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == max) {
                    System.out.println("Строка : " + i + " " + "Столбец : " + j + " ");
                }
            }
        }
        System.out.println();
        //Вывод минимального числа, индексов строк и столбцов его повторений
        System.out.println("Минимальное число :  " + min);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == min) {
                    System.out.println("Строка : " + i + " " + "Столбец : " + j);
                }
            }
        }
        //Получаем время  программы в миллисекундах
        System.out.print("Время выполнения поиска:  ");
        System.out.println(System.currentTimeMillis() - time + " миллисекунд");
    }
}





