package day02.cars;

//import jdk.internal.org.objectweb.asm.tree.InsnList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarShop {
    private String traderName;
    private int maxPrice;
    public static List<day02.cars.Car> CarsForSell = new ArrayList<>();

    public CarShop(String traderName, int maxPrice) {
        this.traderName = traderName;
        this.maxPrice = maxPrice;
    }




    public String getTraderName() {
        return traderName;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public List<day02.cars.Car> getCarsForSell() {
        return CarsForSell;
    }

    public boolean addCar(day02.cars.Car car){
        if (car.price<maxPrice) {
            CarsForSell.add(car);
            return true;
        }
        return false;
    }

    int sumCarPrice(){
        int totalPrice=0;
        for (int i=0; i<getCarsForSell().size();i++) {
            totalPrice+= getCarsForSell().get(i).getPrice();
        }
        return totalPrice;
    }

    int numberOfCarsCheaperThan(int price){
        // System.out.println("Kérek egy árat: ");
        //Scanner scanner = new Scanner(System.in);
        // int number = scanner.nextInt();
        int piecesOK=0;
        for (int i=0; i<getCarsForSell().size();i++) {
            if (price >= getCarsForSell().get(i).getPrice()) {
                piecesOK++;
            };
        }
        return piecesOK;

    }

    public List<day02.cars.Car> carsWithBrand(String brand){
        List<day02.cars.Car> result=new ArrayList<>();
        for (int i=0; i<getCarsForSell().size();i++) {
            if (getCarsForSell().get(i).getType().equals(brand))
                result.add(getCarsForSell().get(i));
        }
        return result;
    }

    @Override
    public String toString() {
        return "CarShop{" +
                "traderName='" + traderName + '\'' +
                ", maxPrice=" + maxPrice +
                '}';
    }
}
