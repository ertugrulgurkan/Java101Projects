package com.ertugrul.mayintarlasi;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    Scanner input = new Scanner(System.in);

    public void run() {

        System.out.print("Kaç satır olsun: ");
        int satir = input.nextInt();
        System.out.print("Kaç sütun olsun: ");
        int sutun = input.nextInt();
        int mayinSayisi = (satir * sutun) / 4;
        createDesign(satir, sutun, mayinSayisi);
    }

    private void createDesign(int satir, int sutun, int mayinSayisi) {
        String[][] matrix = new String[satir][sutun];
        int[] tempArr;
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                matrix[i][j] = "-";
            }
        }
        for (int i = 0; i < mayinSayisi; i++) {
            do {
                tempArr = mayin(satir, sutun);

            } while (matrix[tempArr[0]][tempArr[1]].equals("*"));
            matrix[tempArr[0]][tempArr[1]] = "*";
        }

        drawLine();
        start(matrix, satir, sutun);

    }

    public int[] mayin(int raw, int column) {
        Random rnd = new Random();
        int[] location = { rnd.nextInt(raw), rnd.nextInt(column) };
        return location;
    }

    public void drawLine() {
        System.out.println("____________________________________");
    }

    public void start(String[][] matrix, int satir, int sutun) {
        System.out.println("Mayın tarlasına hoşgeldiniz!");
        String[][] tempMatrix = new String[satir][sutun];
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                tempMatrix[i][j] = "-";
            }
        }
        boolean status = true;
        int count = 0;
        int r, c, info = 0;
        do {
            for (int i = 0; i < satir; i++) {
                for (int j = 0; j < sutun; j++) {
                    System.out.print(tempMatrix[i][j] + " ");
                }
                System.out.print("\n");
            }

            do {
                System.out.print("Bir satır numarası seçiniz: ");
                r = input.nextInt();
                System.out.print("Bir sütun numarası seçiniz: ");
                c = input.nextInt();
                if (r >= satir || c >= sutun) {
                    System.err.println("Girdiğiniz satır ya da sütun numarası hatalı! Lütfen tekrar deneyin.");
                }
            } while (r >= satir || c >= sutun);

            if (matrix[r][c].equals("*")) {
                System.err.println("Mayına bastınız!!!");
                status = false;
            } else {
                info = 0;
                if (r - 1 >= 0) {
                    if (matrix[r - 1][c].equals("*")) {
                        info++;
                    }
                }
                if (r - 1 >= 0 && c - 1 >= 0) {
                    if (matrix[r - 1][c - 1].equals("*")) {
                        info++;
                    }
                }
                if (c - 1 >= 0) {
                    if (matrix[r][c - 1].equals("*")) {
                        info++;
                    }
                }
                if (c + 1 < sutun) {
                    if (matrix[r][c + 1].equals("*")) {
                        info++;
                    }
                }
                if (c + 1 < sutun && r + 1 < satir) {
                    if (matrix[r + 1][c + 1].equals("*")) {
                        info++;
                    }
                }
                if (r + 1 < satir) {
                    if (matrix[r + 1][c].equals("*")) {
                        info++;
                    }
                }
                if (r - 1 >= 0 && c + 1 < sutun) {
                    if (matrix[r - 1][c + 1].equals("*")) {
                        info++;
                    }
                }
                if (r + 1 < satir && c - 1 >= 0) {
                    if (matrix[r + 1][c - 1].equals("*")) {
                        info++;
                    }
                }
                tempMatrix[r][c] = String.valueOf(info);
                count++;
            }
            drawLine();
        } while (status && count < (satir * sutun) - ((satir * sutun) / 4));
        if (status) {
            System.out.println("Kazandınız :)");
            for (int i = 0; i < satir; i++) {
                for (int j = 0; j < sutun; j++) {
                    if (tempMatrix[i][j].equals("-")) {
                        System.out.print("* ");
                    } else {
                        System.out.print(tempMatrix[i][j] + " ");
                    }
                }
                System.out.print("\n");
            }
        }
    }
}