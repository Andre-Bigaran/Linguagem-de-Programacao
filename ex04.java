package com.mycompany.lista7;

import java.util.Scanner;

public class ex04 {

    public static int[] v1 = new int[10];
    public static int[] v2 = new int[10];
    public static int[] v3 = new int[20];
    public static int aux = 2;
    public static int aux2 = 1;
    public static boolean verifica = false;

    public static void main(String[] args) {
        System.out.println("Vetor 1");
        Scanner sc = new Scanner(System.in);
        int i;
        for (i = 0; i < v1.length; ++i) {
            v1[i] = sc.nextInt();
        }

        System.out.println("Vetor 2");

        for (i = 0; i < v2.length; ++i) {
            v2[i] = sc.nextInt();
        }

        v3[0] = v1[0];
        System.out.println("Vetor resultante");
        vetorResultante1();
        vetorResultante2();

        for (i = 0; i < v3.length; ++i) {
            int var10001 = v3[i];
            System.out.print("" + var10001 + " ");
        }

    }

    public static void vetorResultante1() {
        for (int i = 0; i < v1.length; ++i) {
            for (int j = 0; j < v3.length; ++j) {
                if (v1[i] == v3[j]) {
                    verifica = false;
                    break;
                }

                verifica = true;
            }

            if (verifica) {
                if (aux > 18) {
                    System.out.println("Aux maior que 18");
                    break;
                }

                v3[aux] = v1[i];
                aux += 2;
            }
        }

    }

    public static void vetorResultante2() {
        for (int i = 0; i < v2.length; ++i) {
            for (int j = 0; j < v3.length; ++j) {
                if (v2[i] == v3[j]) {
                    verifica = false;
                    break;
                }

                verifica = true;
            }

            if (verifica) {
                if (aux2 > 19) {
                    System.out.println("Aux maior que 19");
                    break;
                }

                v3[aux2] = v2[i];
                aux2 += 2;
            }
        }

    }
}
