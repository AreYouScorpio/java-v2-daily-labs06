package day02.cars;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    Car car = new Car("Toyota", 1.2, Color.BLUE, 120);


    @Test
    public void createCarTest () {
        Car car = new Car("Toyota", 1.2, Color.BLUE, 120);

        assertEquals("Toyota", car.getType());
        assertEquals(1.2, car.getCcm(), 0.005);
        assertEquals(Color.BLUE, car.getColor());
        assertEquals(120, car.getPrice());
    }


    @Test
    public void decreasePriceTest() {


        car.decreasePrice(10);

        assertEquals(108, car.getPrice());

    }

    @Test
    public void decreasePriceWithWrongPercentTest(){

    car.decreasePrice(0);
    assertEquals(120, car.getPrice());

    car.decreasePrice(100);
    assertEquals(0, car.getPrice());


}
}
