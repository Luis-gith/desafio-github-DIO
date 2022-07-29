import java.util.Scanner;

public class maiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number, maior = 0, soma = 0, count = 0;
        do {
            System.out.println("Insira um número: ");
            number = scan.nextInt();
            soma = soma + number;
            if (number > maior) maior = number;

            count++;
        } while(count < 5);
        System.out.println("O maior número inserido foi: " + maior);
        System.out.println("A valor médio dos números inseridos foi: " + (soma/5));
    }
}

