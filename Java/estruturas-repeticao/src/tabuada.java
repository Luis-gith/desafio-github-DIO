import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número que quer ver a tabuada: ");
        int number = scan.nextInt();

        System.out.println("Tabuada do: ");
        for(int count = 1; count <= 10; count++) {
            System.out.println(number +" X " + count + " = " + (number*count));
        }
    }
}