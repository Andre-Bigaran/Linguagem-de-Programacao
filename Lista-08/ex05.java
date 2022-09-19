import java.util.Scanner;
public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int linha = 0, coluna = 0;
        int x;
        int[][] matriz = new int[5][5];
        boolean verifica = false;


        System.out.println("Insira os valores da matriz 5x5; ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.print("Valor do X: ");
        x = sc.nextInt();



        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == x) {
                    verifica = true;
                    System.out.println("Valor: " + x);
                    System.out.println("Linha: " + (i + 1) + " Coluna: " + (j + 1));
                    break;
                }
            }
        }
        if (!verifica) {
            System.out.println("Não achei valor igual o X");
        }

    }
}