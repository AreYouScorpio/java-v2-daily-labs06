package day01;

import java.util.ArrayList;
import java.util.List;

public class PositiveNumberContainer {

    private List<Double> numbers = new ArrayList<>();

    public void addNumber(double newnumber){
        numbers.add(newnumber);
    }

    public List<Double> getNumbers() {
        return numbers;
    }

    @Override
    public String toString() {
        return "PositiveNumberContainer{" +
                "numbers=" + numbers +
                '}';
    }
}
