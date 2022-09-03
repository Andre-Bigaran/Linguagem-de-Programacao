import java.util.Scanner;
public class ex01 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] vet = new int[10];
            int soma = 0;
            int aux = 0;
            int resultado = 0;
            System.out.println("Coloque os 10 numeros do vetor: ");
            for (int i = 0; i < 10; i++) {
                vet[i] = sc.nextInt();
            }

            for (int j = 0; j < 10; j++) {

                if (vet[j] > 0) {
                    soma = aux + vet[j];
                    aux = vet[j];
                    resultado = resultado + aux;

                }
            }
            System.out.println("O Resutlado da soma dos pares é: " + resultado);

        }

    }

