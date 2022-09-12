import java.util.Scanner;
public class ex04 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int vet[] = new int[5];
        boolean verif;
        for (int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextInt();
        }
        for (int i = 0; i < vet.length; i++) {
            verif = true;
            for (int j = 0; j < vet.length; j++) {
                if (vet[i] == vet[j] && i!=j) {
                    verif = false;
                    break;
                }
            }
            if(verif){
                System.out.print(vet[i] + " ; ");
            }
        }

    }
}