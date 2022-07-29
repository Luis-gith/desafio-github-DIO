import java.util.*;

public class setTesting {
    public static void main(String[] args) {
        Set<Double> notas = new HashSet<>(Arrays.asList(8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        System.out.println("Confira se a nota 5 está no conjunto: " + notas.contains(5d));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        double sum = 0;
        while (iterator.hasNext())
            sum += iterator.next();

        System.out.printf("Exiba a soma dos valores: %.2f\n", sum);
        System.out.printf("Exiba a média dos valores: %.2f\n", (sum / notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println("Verifique se ela ainda existe: " + notas.contains(0d));

        //pode ser substituido por nomeCollection.removeIf
        /* Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            double lower = iterator1.next();
            if(lower < 7) iterator1.remove();
        }*/

        notas.removeIf(lower -> lower < 7);
            System.out.println("Remova as notas menores que 7");
            System.out.println(notas);

        System.out.println("Exiba uma lista de notas na ordem em que forem informadas: ");
        //para salvar ordem em Set, utilizamos LinkedHashSet
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.print("Ordem crescente: " + notas3);

        System.out.println("\nApague todo o conjunto notas2: ");
        notas2.clear();
        System.out.println("Conferindo se está vazio: " + notas2 + notas2.isEmpty());
        System.out.println("Confira se notas está vazio(tomara que nao kk): " + notas.isEmpty());

    }
}