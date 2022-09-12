

package com.Andre_java.atividade7;

import java.util.Scanner;

public class Atividade7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero, maior;
        double lista[] = new double[5];
        System.out.println("Informe 5 números");
        for (int i = 0; i < lista.length; i++) {
            numero = sc.nextDouble();
            lista[i] = numero;
        }
        maior = lista[0];
        for (int j = 0; j < lista.length; j++) {
            if (lista[j] > maior) {
                maior = lista[j];
            }
        }
        System.out.println("Maior: " + maior);

    }
}
