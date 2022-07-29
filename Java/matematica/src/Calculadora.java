public class Calculadora {

    public static void soma(double number1, double number2) {
        double result = number1 + number2;
        System.out.println("O resultado de" + number1 + " mais " + number2 + " é igual a: " + result);
    }

    public static void subtrai(double number1, double number2) {
        double result = number1 - number2;
        System.out.println("O resultado de" + number1 + " menos " + number2 + " é igual a: " + result);
    }

    public static void divide(double number1, double number2) {
        double result = number1 / number2;
        System.out.println("O resultado de" + number1 + " dividido por " + number2 + " é igual a: " + result);
    }

    public static void multiplica(double number1, double number2) {
        double result = number1 * number2;
        System.out.println("O resultado de" + number1 + " vezes " + number2 + " é igual a: " + result);
    }
}