import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] vet = new int [5];
        int auxMaior = 0, auxMenor = 0,  soma = 0,aux = 0, resultado = 0, media = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Coloque 5 valores");
            vet[i] = sc.nextInt();
        }
        System.out.println("Valoroes");
        for (int j = 0; j < 5; j++) {
            System.out.println(vet[j]);
        }
        for (int k = 0; k < 5; k++) {
            if (k == 0) {
                auxMaior = vet[k];
                auxMenor = vet[k];
            }
            else if (vet[k] > auxMaior) {
                auxMaior = vet[k];
            }else if(vet[k] < auxMenor){
                auxMenor = vet[k];
            }

        }
        System.out.println("o maior valor é: "+ auxMaior);
        System.out.println("O menor valor é: " + auxMenor);

        for (int l = 0; l < 5; l++) {


            soma = aux + vet[l];
            aux = vet[l];
            resultado = resultado + aux;

            media = resultado/5;


        }
        System.out.println("A média é : " + media);
    }
}

