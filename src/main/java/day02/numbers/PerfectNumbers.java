package day02.numbers;

public class PerfectNumbers {
    public boolean isPerfectNumber(int number) {
        int sum=0;

        for(int divisor=1;divisor<number;divisor++) {
            if(number % divisor == 0) {
                sum+=divisor;
            }
        }

        return number == sum;
    }
}
