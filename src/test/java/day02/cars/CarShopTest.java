package day02.cars;

import org.junit.Test;

import static org.junit.Assert.*;


class CarShopTest {

    CarShop carShop = new CarShop("BestCars", 100);


    @Test

        public void createCarShopTest () {



            assertEquals("BestCars", carShop.getTraderName());
            assertEquals(100, carShop.getTraderName());
            assertEquals(0, carShop.getCarsForSell().size());


        }


    @Test

        public void addCarWithValidPriceTest() {
            boolean result = carShop.addCar(new Car("Toyota", 1.2, Color.BLUE, 99));

            assertTrue(result);
            assertEquals(1, carShop.getCarsForSell().size());
            assertEquals("Toyota", carShop.getCarsForSell().get(0), getClass());




    }

    @Test
    public void addCarWithInvalidPriceTest() {
        boolean result = carShop.addCar(new Car("Toyota", 1.2, Color.BLUE, 101));

        assertFalse(result);
        assertEquals(0, carShop.getCarsForSell().size());


    }

    @Test
    public void sumPriceOfCarsTest(){
        carShop.addCar(new Car("Toyota", 1.2, Color.BLUE, 80));
        carShop.addCar(new Car("Toyota", 1.2, Color.BLUE, 101));
        carShop.addCar(new Car("Toyota", 1.2, Color.BLUE, 101));
}

}
