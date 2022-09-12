import java.util.Scanner;
public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] vetor = new int[5];
        int x;

        System.out.println("Coloque os 5 numeros do vetor: ");
        for (int i = 0; i < 5; i++) {
            vetor[i] = sc.nextInt();
        }
        System.out.println("1 - mostre o vetor na ordem direta; ");
        System.out.println("2 -mostre o vetor na ordem inversa; ");
        x = sc.nextInt();

        switch(x){
            case 1:
                System.out.println("ordem direta");
                for (int j = 0; j < 5; j++) {
                    System.out.print(vetor[j] + " | ");
                }
                break;
            case 2:
                System.out.println("Ordem inversa");
                for (int i = 4; i >= 0; i--) {
                    System.out.print(vetor[i] + " | ");
                }
                break;
            default: System.out.println("Codigo Invalido");
                break;

        }
    }
}
