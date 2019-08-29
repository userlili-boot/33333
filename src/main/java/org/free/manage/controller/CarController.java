package org.free.manage.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.free.manage.entity.Car;
import org.free.manage.framework.Result;
import org.free.manage.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Api(tags = "平台车型确认接口")
@RestController
@RequestMapping("api/car")
public class CarController extends BaseController {

    @Autowired
    private CarService carService;

    @ApiOperation("新增车型")
    @PostMapping("create")
    public Mono<Result<Integer>> createCar(@RequestBody Car car){
        Integer id = carService.create(car);
        return ok(id);
    }
    
    @ApiOperation("查询车型")
    @GetMapping("{id}/detail")
    public Mono<Result<Car>> detail(@PathVariable("id")Integer id){
    	Car car = carService.findById(id);
		return ok(car);
    }

}
