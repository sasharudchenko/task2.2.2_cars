package web.DAO;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CarDAOImpl implements CarDAO{
    private List<Car> cars = new ArrayList<>();
    public CarDAOImpl() {
        cars.add(new Car("m1", 111, 2000));
        cars.add(new Car("m2", 222, 2001));
        cars.add(new Car("m3", 333, 2002));
        cars.add(new Car("m4", 444, 2003));
        cars.add(new Car("m5", 555, 2004));
    }

    @Override
    public List<Car> numbersOfCar(int count) {
        return cars.subList(0, count);
    }


}
