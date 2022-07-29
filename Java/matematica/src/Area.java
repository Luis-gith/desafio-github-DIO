// Calcule a area de um retangulo, um quadrado, um trapezio e um losango. Tente usar sobrecarga

public class Area {
    public static void calculaArea(double lado) {
        double area = lado*lado;
        System.out.println("Área do quadrado: " + area);
    }

    public static void calculaArea(double lado1, double lado2) {
        double area = lado1*lado2;
        System.out.println("Área do retângulo: " + area);
    }

    public static void calculaArea(double bMaior, double bMenor, double altura) {
        double area = ((bMaior+bMenor)*altura)/2;
        System.out.println("Área do trapézio: " + area);
    }

    public static void calculaArea(float dMaior, float dMenor) {
        double area = (dMaior*dMenor)/2;
        System.out.println("Área do losango: " + area);
    }

}