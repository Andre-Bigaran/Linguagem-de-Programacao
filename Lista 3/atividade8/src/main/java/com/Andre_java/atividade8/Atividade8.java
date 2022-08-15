
package com.Andre_java.atividade8;

import java.util.Scanner;

public class Atividade8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         double n1, n2, n3, n4, n5, media, soma;
        System.out.println("Informe 5 números");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();
        n4 = sc.nextDouble();
        n5 = sc.nextDouble();
        soma = n1+n2+n3+n4+n5;
        media = soma /5;
        System.out.print("Soma: " + soma);
        System.out.print("\nMédia: "+media);

    }
}
