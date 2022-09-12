import java.util.Scanner;
public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n[] = new int[10];
        int x = 0;
        for(int i = 0; i < 10; i++) {
            System.out.println((i+1) + "- Informe numero: ");
            n[i] = sc.nextInt();
        }
        System.out.println("Digite um numero: ");
        x = sc.nextInt();
        int xt = 0;
        for(int i = 0 ; i < 10; i++) {
            if(n[i] % x == 0) {
                System.out.println("O numero "+n[i]+" é multiplo de "+x);
                xt++;
            }
        }
    }
}

