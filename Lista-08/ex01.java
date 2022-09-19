
import java.util.Scanner;
public class ex01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int aux = 0;

        System.out.println("Insira os numeros da Matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
                if (matriz[i][j] > 10) {
                    aux++;
                }
            }
        }
        System.out.println("Quantidade de numeros maiores que 10: " + aux);
    }
}