package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class GetAutoImpl implements GetAuto {

    @Override
    public List<Car> getAutoList(Integer count) {
        if (count == null) {
            count = 5;
        }
        List<Car> carList = new ArrayList<>();
        carList.add(new Car(3, "Toyota", "5"));
        carList.add(new Car(5, "Nissan", "8"));
        carList.add(new Car(1, "Suzuki", "5"));
        carList.add(new Car(22, "BMW", "2"));
        carList.add(new Car(3, "Audi", "4"));

        return carList.stream().limit(count).collect(Collectors.toList());

    }
}
