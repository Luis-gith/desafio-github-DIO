import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class listTesting {
    public static void main(String[] args) {
        //Crie uma lista e adicione as sete notas
        List<Double> notas = new ArrayList<>();
        notas.add(5.4);
        notas.add(3.2);
        notas.add(4.8);
        notas.add(7.8);
        notas.add(9.0);
        notas.add(0.0);
        notas.add(8.5);

        System.out.println(notas.toString());

        System.out.println("Exiba o índice da nota 9.0: " + notas.indexOf(9.0));
        System.out.println("Adicione a lista a nota 1.0 na posição 4: ");
        notas.add(4, 1.0);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.4 pela nota 6.0: ");
        notas.set(notas.indexOf(5.4), 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.4 ainda está na lista: " + notas.contains(5.4));

        System.out.println("Exiba as notas na ordem em que foram informadas: ");
        for (Double nota: notas) System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + soma/ notas.size());

        System.out.println("Remova a nota 0.0: ");
        notas.remove(6); //ou 0.0 para fazer o objeto de alvo
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7: ");

        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());



    }
}