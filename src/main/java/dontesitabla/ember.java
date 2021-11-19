package dontesitabla;

public class ember {

    String name;
    boolean vegzettseg;
    int nyelvvizsga;
    int allokepesseg;

    public ember(String name, boolean vegzettseg, int nyelvvizsga, int allokepesseg) {
        this.name = name;
        this.vegzettseg = vegzettseg;
        this.nyelvvizsga = nyelvvizsga;
        this.allokepesseg = allokepesseg;
    }


    public String getName() {
        return name;
    }

    public boolean isVegzettseg() {
        return vegzettseg;
    }

    public int getNyelvvizsga() {
        return nyelvvizsga;
    }

    public int getAllokepesseg() {
        return allokepesseg;
    }

    @Override
    public String toString() {
        return "ember{" +
                "name='" + name + '\'' +
                ", vegzettseg=" + vegzettseg +
                ", nyelvvizsga=" + nyelvvizsga +
                ", allokepesseg=" + allokepesseg +
                '}';
    }
}