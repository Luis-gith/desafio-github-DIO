public class Emprestimo {
    public static void calculaTotal(double emprestimo, int parcelas) {
        double taxa = 0;
        if(parcelas <= 12 && parcelas >= 1){
            taxa = 0.02;
        } else if (parcelas > 12 && parcelas <= 24) {
            taxa = 0.005;
        }
        double result = emprestimo * (Math.pow(( 1 + taxa ), parcelas));
        double mensal =  result/parcelas;

        System.out.println("O seu empréstimo de:\n"  + String.format("%.2f", emprestimo) + " reais, dividido em " + parcelas + " parcelas, custará:\n"  + String.format("%.2f", result) + " reais");
        System.out.println("O valor a ser pago mensalmente é de: " + String.format("%.2f", mensal) + " reais");
    }
}



