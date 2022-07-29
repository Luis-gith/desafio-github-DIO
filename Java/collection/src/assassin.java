import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class assassin {
    public static void main(String[] args) {
        List<String> answers = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

            System.out.println("Did you call the victim? (y/n)");
        String a = scan.next();
        answers.add(a.toLowerCase());

            System.out.println("Were you in the crime scene? (y/n)");
        a = scan.next();
        answers.add(a.toLowerCase());

            System.out.println("Is your residence near the victim's? (y/n)");
        a = scan.next();
        answers.add(a.toLowerCase());

            System.out.println("Did you owe money or any other valuable good to the victim? (y/n)");
        a = scan.next();
        answers.add(a.toLowerCase());

            System.out.println("Have you and the victim ever worked together? (y/n)");
        a = scan.next();
        answers.add(a.toLowerCase());

        int count = 0;
        for (String ans : answers) {
            if (ans.contains("y")) {
                count++;
            }
        }

        switch (count) {
            case 2:
                System.out.println("SUSPECT"); break;
            case 3:
            case 4:
                System.out.println("ACCOMPLICE"); break;
            case 5:
                System.out.println("ASSASSIN"); break;
            default:
                System.out.println("INNOCENT"); break;
        }
    }
}
