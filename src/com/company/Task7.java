package com.company;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        //1.Ввод данных, объявление массива и переменных
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = in.nextInt();
        int[][] matrix = new int[n][n]; //объявили двумерный массив
        int k = 1;//переменная для накопления элементов массива

        //2. Решение с помощью циклов for
        for (int i = 0; i < matrix.length; i++) { //обходим строки массива
            if (i % 2 == 0) { //если номер строки четное число, то заполнение
                // происходит от 0 столбца до matrix.length (слева направо)
                for (int j = 0; j < matrix.length; j++) { // обходим столбцы
                    matrix[i][j] = k;
                    k++;
                }
            } else { //если номер строки нечетное число, то заполнение
                // происходит от n-1 столбца до 0 (справа налево)
                for (int j = n - 1; j >= 0; j--) { // обходим столбцы
                    matrix[i][j] = k;
                    k++;
                }
            }
        }
        for (int[] row : matrix) {
            for (int item : row) {               // цикл вывода очередной строки
                System.out.print(item + "\t");   // выводим очередной элемент
            }
            System.out.println();                       // переносим строку на новую
        }
    }
}

