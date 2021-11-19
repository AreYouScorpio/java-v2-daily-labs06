package dontesitabla;

import static dontesitabla.felvetel.*;

public class Main {
    public static void main(String[] args) {

        ember ember1 = new ember("Jozsi", true,2,2);
        ember ember2 = new ember("Bela", true, 1, 1);
        ember ember3 = new ember("Laci", true, 1, 1);
        ember ember4 = new ember("Petu", false, 2, 2);
        ember ember5 = new ember("Geza", true, 1, 2);
        ember ember6 = new ember("Frankenstein", true, 2, 1);
        ember ember7 = new ember("Pirike", false, 1, 1);


        felvetel felvetel = new felvetel();
        emberek.add(ember1);
        emberek.add(ember2);
        emberek.add(ember3);
        emberek.add(ember4);
        emberek.add(ember5);
        emberek.add(ember6);
        emberek.add(ember7);
        emberek.add(new ember("Ricardo Winnetou", true, 1, 2));


        for (ember a : emberek) {
            felvetel.addEmberFelvettekListaja(a);
            felvetel.addEmberNemFelvettekListaja(a);
            felvetel.addEmberTrainingreListaja(a);
            felvetel.addEmberNyelvtanulasraListaja(a);
            felvetel.addEmberMindketListaja(a);
        }

        System.out.println("Felvettük őket: " + felvettekListaja);
        System.out.println("Nem vettük fel: " + nemfelvettekListaja);
        System.out.println("Csak trainingre küldjük: " + trainingreListaja);
        System.out.println("Csak nyelvtanfolyamra küldjük: " + nyelvtanulasraListaja);
        System.out.println("Trainingre és nyelvtanfolyamra is küldjük: " + mindketListaja);


    }
}