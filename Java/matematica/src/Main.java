public class Main {
    public static void main (String[] args) {
        //Calculadora
        System.out.println("\nCalculadora:");
        Calculadora.soma(5.5, 8.65);
        Calculadora.subtrai(10.67, 25.333);
        Calculadora.divide(9.55, 5.8);
        Calculadora.multiplica(1.6, 6.9);


        // Emprestimo
        System.out.println("\n\nEmprestimo:");
        Emprestimo.calculaTotal(10000,6);
        Emprestimo.calculaTotal(500,5);
        Emprestimo.calculaTotal(1500.50,12);

        // Area quadrilateros
        System.out.println("\n\nQuadrilateros");
        Area.calculaArea(5);
        Area.calculaArea(8d, 3d);
        Area.calculaArea(10,4,5);
        Area.calculaArea(5f,7f);
    }

}
