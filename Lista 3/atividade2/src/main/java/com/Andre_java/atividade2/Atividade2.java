

package com.Andre_java.atividade2;

import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String nome="t",senha="t";
      
        while(nome.equals(senha)){
        System.out.println("Informe o Login:");
        nome =sc.nextLine();
        System.out.println("Informe a Senha:");
        senha = sc.nextLine();
        }
        System.out.println("Usuario cadastrado");
    } 
}
