import java.util.Scanner;
public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int auxMaior = 0, x = 0, y = 0;

        System.out.println("Insira os numeros da matriz 4x4;");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = sc.nextInt();
                if (i == 0 && j == 0) {
                    auxMaior = matriz[i][j];
                }
                if (matriz[i][j] > auxMaior) {
                    auxMaior = matriz[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println("O numero maior está na: ");
        System.out.println("Linha: " + (x + 1) + " Coluna: " + (y + 1));

    }
}