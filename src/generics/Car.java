package generics;

import lombok.Getter;

@Getter
public class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }
}
