package day01;


import java.util.Scanner;


public class Main {



    public static void main(String[] args) {
        PositiveNumberContainer positiveNumberContainer = new PositiveNumberContainer();
        Scanner scanner = new Scanner(System.in);
        boolean repeater = true;
        while (repeater==true) {
        System.out.println("Adj meg egy pozitív számot: ");
        String newNumberString = scanner.nextLine();
        Double number = Double.parseDouble(newNumberString);
        if (number>0) {
            positiveNumberContainer.addNumber(number);
        }
        else {

            System.out.println(positiveNumberContainer);
            repeater = false;
        }
        }


    }



}
