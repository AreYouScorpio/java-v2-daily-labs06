package day01;

import java.util.ArrayList;
import java.util.List;

public class PositiveNumberContainer {

    public static List<Double> numbers = new ArrayList<>();

    public void addNumber(double newnumber){
        numbers.add(newnumber);
    }

    public static List<Double> getNumbers() {
        return numbers;
    }



}
