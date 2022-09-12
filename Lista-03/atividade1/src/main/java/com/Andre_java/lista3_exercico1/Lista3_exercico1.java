package com.Andre_java.lista3_exercico1;

import java.util.Scanner;

public class Lista3_exercico1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ;
        System.out.println("Informe o numero um valor entr 0 e 10");
        num = sc.nextInt();
        while (num < 0 || num > 10) {
          System.out.println("Valor invalido, Informe o valor novamente");
        }
       System.out.println("Valor Valido");
    }
}
