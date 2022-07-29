import java.util.*;

public class ordenacaoSet {
    public static void main(String[] args) {
        System.out.println("Ordene sua séries favoroitas!");
        System.out.println("--\tOrdem Aleatória\t--");

        Set<Serie> mySeries0 = new HashSet<>() {{
           add(new Serie("Shameless", "Comédia", 50));
           add(new Serie("Friends", "Comédia", 25));
           add(new Serie("The Witcher", "Ação e Aventura", 50));
        }};

        for (Serie serie:mySeries0)
            System.out.println(serie.getName() + " - " + serie.getGenre() + " - " + serie.getEpTime());

        System.out.println("\n--\tOrdem de Inserção\t--");
        Set<Serie> mySeries1 = new LinkedHashSet<>() {{
            add(new Serie("Shameless", "Comédia", 50));
            add(new Serie("Friends", "Comédia", 25));
            add(new Serie("The Witcher", "Ação e Aventura", 50));
        }};

        for (Serie serie : mySeries1) System.out.println(serie.getName() + " - " + serie.getGenre() + " - " + serie.getEpTime());

        System.out.println("\n--\tOrdem Natural (Tempo de Episódio)\t--");
        Set<Serie> mySeries2 = new TreeSet<>(mySeries1);
        for (Serie serie : mySeries2) System.out.println(serie.getName() + " - " + serie.getGenre() + " - " + serie.getEpTime());

        System.out.println("\n--\tOrdem nome>genero>tempo)\t--");
        Set<Serie> mySeries3 = new TreeSet<>(new ComparatorGeral());
        mySeries3.addAll(mySeries0);
        for (Serie serie : mySeries3) System.out.println(serie.getName() + " - " + serie.getGenre() + " - " + serie.getEpTime());




    }
}



class Serie implements Comparable<Serie> {
    private String name;
    private String genre;
    private Integer epTime;

    public Serie(String name, String genre, Integer epTime) {
        this.name = name;
        this.genre = genre;
        this.epTime = epTime;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public Integer getEpTime() {
        return epTime;
    }

    @Override
    public String toString() {
        return "Serie{" + "nome =" + name + "," + "genero = " + genre + "," + "Tempo por episódio = " + epTime + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return name.equals(serie.name) && genre.equals(serie.genre) && epTime.equals(serie.epTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, genre, epTime);
    }

    @Override
    public int compareTo(Serie series) {
        int epTime = Integer.compare(this.getEpTime(), series.getEpTime());
        if (epTime != 0) return epTime;

        return this.getName().compareTo(series.getName());
    }



}


class ComparatorGeral implements Comparator<Serie> {
    @Override
    public int compare(Serie s1, Serie s2) {
        int name = s1.getName().compareTo(s2.getName());
        if (name != 0) return name;

        int genre = s1.getGenre().compareTo(s2.getGenre());
        if (genre != 0) return genre;

        return Integer.compare(s1.getEpTime(), s2.getEpTime());

    }
}
