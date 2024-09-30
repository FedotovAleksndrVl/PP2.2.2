package web.model;

import org.springframework.stereotype.Component;
import java.util.Objects;

@Component
public class Car {
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

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return Objects.equals(brand, car.brand) && Objects.equals(side, car.side) && Objects.equals(price, car.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, side, price);
    }
}
