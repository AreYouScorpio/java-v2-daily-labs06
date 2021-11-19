package dontesitabla;

import java.util.ArrayList;

public class felvetel {


    public static ArrayList<ember> emberek = new ArrayList<>();

    public static ArrayList<ember> felvettekListaja = new ArrayList<>();
    public static ArrayList<ember> nemfelvettekListaja = new ArrayList<>();
    public static ArrayList<ember> nyelvtanulasraListaja = new ArrayList<>();
    public static ArrayList<ember> trainingreListaja = new ArrayList<>();
    public static ArrayList<ember> mindketListaja = new ArrayList<>();

    public void addEmberFelvettekListaja (ember ember){
        if (ember.vegzettseg && ember.nyelvvizsga == 2 && ember.allokepesseg == 2)        felvettekListaja.add(ember);
    }

    public void addEmberNemFelvettekListaja (ember ember){
        if (ember.vegzettseg == false || ember.nyelvvizsga ==  0 || ember.allokepesseg == 0)        nemfelvettekListaja.add(ember);
    }

    public void addEmberNyelvtanulasraListaja (ember ember){
        if (ember.vegzettseg && ember.nyelvvizsga ==  1 && ember.allokepesseg >1 )        nyelvtanulasraListaja.add(ember);
    }

    public void addEmberTrainingreListaja (ember ember){
        if (ember.vegzettseg && ember.nyelvvizsga > 1 && ember.allokepesseg == 1 )        trainingreListaja.add(ember);
    }

    public void addEmberMindketListaja (ember ember){
        if (ember.vegzettseg && ember.nyelvvizsga == 1 && ember.allokepesseg == 1 )        mindketListaja.add(ember);
    }





}
