package day02.cars;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;


public class CarShopTest {

    CarShop carShop = new CarShop("BestCars", 100);

    @BeforeEach
        public  void init(){
        carShop.addCar(new Car("Toyota", 1.2, Color.BLUE, 80));
        carShop.addCar(new Car("Toyota", 1.2, Color.BLUE, 101));
        carShop.addCar(new Car("Toyota", 1.2, Color.BLUE, 101));}


    @Test

        public void createCarShopTest () {

        CarShop carShop = new CarShop("BestCars", 100);


            assertEquals("BestCars", carShop.getTraderName());
            assertEquals(100, carShop.getMaxPrice());
            assertEquals(0, carShop.getCarsForSell().size());


        }


    @Test

        public void addCarWithValidPriceTest() {
            boolean result = carShop.addCar(new Car("Toyota", 1.2, Color.BLUE, 99));

            assertTrue(result);
            assertEquals(1, carShop.getCarsForSell().size());
            assertEquals("Toyota", carShop.getCarsForSell().get(0).getType());




    }

    @Test
    public void addCarWithInvalidPriceTest() {
        boolean result = carShop.addCar(new Car("Toyota", 1.2, Color.BLUE, 101));

        assertFalse(result);
        assertEquals(0, carShop.getCarsForSell().size());


    }

    @Test
    public void sumPriceOfCarsTest(){
        assertEquals(0,carShop.sumCarPrice());
    }

}
