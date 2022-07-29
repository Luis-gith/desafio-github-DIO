import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        //loop(contador) - numero fatorial
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um número para saber o valor de seu fatorial: ");
        int number = scan.nextInt();

        int factorial = 1;
        for(int count = number; count >= 1; count--) {
            factorial = factorial*count;
        }

        System.out.println(number +"! = " + factorial);
    }
}