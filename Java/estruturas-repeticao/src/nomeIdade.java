import java.util.Scanner;

public class nomeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name;
        int age;

        while(true) {
            System.out.println("Nome: ");
            name = scan.next();
            if (name.equals("0")) break;

            System.out.println("Idade: ");
            age = scan.nextInt();
        }
        System.out.println("Program failed. Restart");
    }
}

