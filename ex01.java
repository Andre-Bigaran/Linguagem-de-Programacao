package com.mycompany.lista7;

import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];
        System.out.println("Vetor A");

        int i;
        for (i = 0; i < a.length; ++i) {
            a[i] = sc.nextInt();
        }

        System.out.println("Vetor B");

        for (i = 0; i < b.length; ++i) {
            b[i] = sc.nextInt();
        }

        for (i = 0; i < c.length; ++i) {
            c[i] = a[i] - b[i] * a[i];
        }

        System.out.println("Vetor C");

        for (i = 0; i < b.length; ++i) {
            System.out.print(c[i] + " ");
        }

    }
}
