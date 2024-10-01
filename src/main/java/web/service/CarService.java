package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getCar(int count);
}
