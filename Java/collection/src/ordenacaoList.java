import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ordenacaoList {
    public static void main(String[] args) {
        List<Cat> myCats = new ArrayList<>(){{
            add(new Cat("Latrell", 30, "Yellow"));
            add(new Cat("Marcus", 18, "White"));
            add(new Cat("Shaneequa", 10, "White"));
            add(new Cat("Marcus", 12, "Black"));
        }};
        System.out.println("--\tOrdem de Inserção\t--");
        System.out.println(myCats);

        System.out.println("--\tOrdem aleatória\t--");
        Collections.shuffle(myCats);
        System.out.println(myCats);

        System.out.println("--\tOrdem natural (Name)\t--");
        Collections.sort(myCats);
        System.out.println(myCats);

        System.out.println("--\tOrdem de idade\t--");
        Collections.sort(myCats, new ageComparator());
        System.out.println(myCats);

        System.out.println("--\tOrdem de cor\t--");
        Collections.sort(myCats, new colourComparator());
        System.out.println(myCats);

        //critério de ordenação nome>cor>idade
        System.out.println("--\tOrdem de Nome/Cor/Idade\t--");
        myCats.sort(new generalComparator());
        System.out.println(myCats);






    }
}


class Cat implements Comparable<Cat> {
    private String name;
    private Integer age;
    private String colour;

    public Cat(String name, Integer age, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name = '" + name + '\'' +
                ", age = " + age +
                ", colour='" + colour + '\'' +
                "}";
    }

    @Override
    public int compareTo(Cat cat) {
        return this.getName().compareToIgnoreCase(cat.getName());
    }
}


class ageComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat g1, Cat g2) {
        return Integer.compare(g1.getAge(), g2.getAge());
    }
}

class colourComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat g1, Cat g2) {
        return g1.getColour().compareToIgnoreCase(g2.getColour());
    }
}

class generalComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat g1, Cat g2) {
        int name = g1.getName().compareToIgnoreCase(g2.getName());
        if(name != 0) return name;

        int colour = g1.getColour().compareToIgnoreCase(g2.getColour());
        if (colour != 0) return colour;

        return Integer.compare(g1.getAge(), g2.getAge());
    }
}