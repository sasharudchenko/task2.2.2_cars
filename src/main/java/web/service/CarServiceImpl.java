package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.CarDAOImpl;
import web.model.Car;

import java.util.List;
@Service
public class CarServiceImpl implements CarService{
    @Autowired
    private CarDAOImpl carDAO ;
    @Override
    public List<Car> numbersOfCar(int count) {
        return carDAO.numbersOfCar(count);
    }
}
