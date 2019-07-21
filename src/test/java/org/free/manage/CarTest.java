package org.free.manage;

import org.free.manage.entity.Car;
import org.free.manage.service.CarService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CarTest {

    @Autowired
    private CarService carService;

    @Test
    public void testInsert(){
        Car car = new Car();
        car.setCarOwnerName("都是");
        carService.insertSelective(car);
    }

}
