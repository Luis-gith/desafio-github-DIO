/* Faça um programa que receba a temperatura média dos 6
primeiros meses do ano e armazene-as em uma lista.

Após isto, calcule a média semestral das temperaturas e
mostre todas as temperaturas acima desta média, e em que
mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro,
2 – Fevereiro e etc).*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class temperatura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temps = new ArrayList<>();

        int count = 0, sum = 0;

        System.out.println("Digite a temperatura média de cada mês do 1º semestre em ordem: ");

        while(count < 6) {
            System.out.print("Temperatura: ");
            Double temperature = scan.nextDouble();
            temps.add(temperature);
            count++;

           sum += temperature;
        }

        System.out.println("____________");

        System.out.println("Lista de temperaturas recebidas: ");
        temps.forEach(t -> System.out.println( t + " "));

        double avg = temps.stream()
        .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0d);
        System.out.printf("\nMédia das temperaturas: %.1f\n", avg);

        System.out.println("Meses acima da média: ");

        Iterator<Double> iterator = temps.iterator();
        count = 0;
        while(iterator.hasNext()) {
            Double temp = iterator.next();
            if(temp > avg) {
                switch(count) {
                    case (0):
                        System.out.printf("1- Janeiro: %.1f\n", temp);
                        break;

                    case (1):
                        System.out.printf("2- Fevereiro: %.1f\n", temp);
                        break;

                    case (2):
                        System.out.printf("3- Março: %.1f\n", temp);
                        break;

                    case (3):
                        System.out.printf("4- Abril: %.1f\n", temp);
                        break;

                    case (4):
                        System.out.printf("5- Maio: %.1f\n", temp);
                        break;
                    case (5):
                        System.out.printf("6- Junho: %.1f\n", temp);
                        break;

                    default:
                        System.out.println("não houve temperatura acima da média semestral.");
                }
            }
            count++;
        }
    }
}

