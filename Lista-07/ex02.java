package com.mycompany.lista7;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        double porcentagem = 0;
        double salario[] = new double[2];
        salario[0] = 1000;
        salario[1]
                = porcentagem = (1.5 / 100);
        salario[0] = salario[1] + (salario[0] * porcentagem);
        for (int i = 1; i <= 25; i++) {
            porcentagem = porcentagem * 2;
            salario[1] = salario[1] + (salario[1] * porcentagem);
        }
        System.out.println("Salário atual: R$" + salario[1]);
    }
}
