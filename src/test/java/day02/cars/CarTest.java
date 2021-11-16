package day02.cars;

import org.junit.Test;

import static org.junit.Assert.*;

class CarTest {

    Car car = new Car("Toyota", 1.2, Color.BLUE, 120);


    @Test
    void createCarTest () {
        Car car = new Car("Toyota", 1.2, Color.BLUE, 120);

        assertEquals("Toyota", car.getType());
        assertEquals(1.2, car.getCcm());
        assertEquals(Color.BLUE, car.getClass());
        assertEquals(120, car.getPrice());
    }


    @Test
    void decreasePriceTest() {


        car.decreasePrice(10);

        assertEquals(108, car.getPrice());

    }

    @Test
    void decreasePriceWithWrongPercentTest(){

    car.decreasePrice(-90);
    assertEquals(120, car.getPrice());


}
}
