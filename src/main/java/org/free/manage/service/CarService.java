package org.free.manage.service;

import org.free.manage.entity.Car;
import org.free.manage.framework.mybatis.BaseService;
import org.springframework.stereotype.Service;

@Service
public class CarService extends BaseService<Car> {

    /**
     * 新增
     * @param car
     * @return
     */
    public Integer create(Car car){
        car.setId(null);
        return insertSelective(car);
    }

}
