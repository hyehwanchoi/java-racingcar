package racingcar.domain;

import racingcar.Result;
import racingcar.domain.Car;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cars {

    private List<Car> carList;

    public Cars(int carCount) {
        this.carList = Stream.generate(Car::new)
                .limit(carCount)
                .collect(Collectors.toList());
    }

    public List<Car> getCars() {
        return carList;
    }

    public void move() {
        carList.forEach(car -> car.move());
    }
}
