import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] vet = new int[10];
        int soma =0, aux = 0, nrep = 0, i, j;

        System.out.println("Coloque os 10 numeros do vetor: ");
        for (i = 0; i < 10; i++) {
            vet[i] = sc.nextInt();
        }

        for (j = 0; j < 10; j++) {

            if (vet[j] != aux){

                aux = vet[j];


            }else{
                nrep = vet[j];
                System.out.println("Repetido: " + nrep);
            }
        }
    }
}