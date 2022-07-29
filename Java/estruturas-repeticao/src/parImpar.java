import java.util.Scanner;

public class parImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N, number, count = 0, impar = 0, par = 0 ;

            System.out.println("Quantos números serão informados?  ");
            N = scan.nextInt();

        do {
            System.out.println("Digite um número inteiro: ");
            number = scan.nextInt();
            count++;
            if(number%2 == 0) par++;
            else impar++;
        } while(count < N);
        System.out.println("Quantidade de números pares inseridos: " + par);
        System.out.println("Quantidade de números ímpares inseridos: " + impar);

    }
}