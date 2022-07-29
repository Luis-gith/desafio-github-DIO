import java.util.Scanner;

public class nota {
    public static void main(String[] args) {
        int nota;
        Scanner scan = new Scanner(System.in);
            System.out.println("Digite uma nota de 1 a 10: ");
            nota = scan.nextInt();

            while (nota < 0 | nota > 10) {
                System.out.println("Nota Inválida! Digite uma nota de 1 a 10: ");
                nota = scan.nextInt();
            }
    }
}