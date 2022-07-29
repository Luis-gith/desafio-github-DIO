import java.util.Scanner;

public class consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int qtdCon = 0, count = 0;

        do {
            System.out.println("Digite uma letra do alfabeto brasileiro: ");
            String letra = scan.next();

            if ( !(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")) )  {
                consoantes[count] = letra;
                qtdCon++;
            }

            count++;
        }  while(count < consoantes.length);

        System.out.println("CONSOANTES: ");
        for (String consoante: consoantes) {
            if (consoante != null)
             System.out.println(consoante + " ");
        }

        System.out.println("Quantidade de consoantes: " + qtdCon);

    }
}