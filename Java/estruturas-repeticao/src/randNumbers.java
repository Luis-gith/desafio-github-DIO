import java.util.Random;

public class randNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[5];

        for(int i = 0; i<numbers.length; i++) {
            int rand = random.nextInt(100);
            numbers[i] = rand;
        }

        System.out.print("Números aleatórios: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.print("\nSucessores: ");
        for (int number : numbers) {
            System.out.print((number + 1) + " ");
        }

        System.out.print("\nAntecessores: ");
        for (int number : numbers) {
            System.out.print((number - 1) + " ");
        }

    }
}