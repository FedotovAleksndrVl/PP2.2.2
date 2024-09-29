package web.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class    Car {
    private String brand;
    private String side;
    private Integer price;

    public Car(String brand, String side, Integer price) {
        this.brand = brand;
        this.side = side;
        this.price = price;
    }

    public Car() {
    }

    public static ArrayList<Car> getCar (int count) {
        Stream<Car> car = Stream.of(
                new Car("ГАЗ","Россия",75000),
                new Car("BMW","Германия",99999),
                new Car("Mercedes-Benz","Германия",88888),
                new Car("Toyota","Япония",77777),
                new Car("KIA","Южная Корея",87555)
        );
        return  car.limit(count).collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public String toString() {
        return "\nCars{" +
                "brand='" + brand + '\'' +
                ", side='" + side + '\'' +
                ", price=" + price +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public String getSide() {
        return side;
    }

    public Integer getPrice() {
        return price;
    }
}
