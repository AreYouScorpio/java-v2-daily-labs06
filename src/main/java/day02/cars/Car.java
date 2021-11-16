package day02.cars;

public class Car {
    private String type;
    private double ccm;
    // public  enum Color {RED, BLACK, BLUE, GREY }
    int price;

    public Car(String type, double ccm, Color color,  int price) {
        this.type = type;
        this.ccm = ccm;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public double getCcm() {
        return ccm;
    }

    public int getPrice() {
        return price;
    }

    public int decreasePrice(int percent) {
        price=(int)(price*(1-(percent/100.0)));
        return price;
    }



}
