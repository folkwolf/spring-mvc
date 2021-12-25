package web.service;

import web.model.Car;

import java.util.List;

public interface GetAuto {
    public List<Car> getAutoList(Integer count);
}
