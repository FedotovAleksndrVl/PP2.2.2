package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarServiseImpl implements CarService{
    @Override
    public List<Car> getCar(int count) {
        return Stream.of(
                new Car("ГАЗ","Россия",75000),
                new Car("BMW","Германия",99999),
                new Car("Mercedes-Benz","Германия",88888),
                new Car("Toyota","Япония",77777),
                new Car("KIA","Южная Корея",87555)
        ).limit(count).collect(Collectors.toCollection(ArrayList::new));
    }
}
