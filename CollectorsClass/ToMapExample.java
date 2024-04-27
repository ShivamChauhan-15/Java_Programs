package CollectorsClass;

import java.util.*;
import java.util.stream.Collectors;
import java.util.List;
import java.util.stream.Collectors;

class City {
    private String name;
    private double temperature;

    public City(String name, double temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public double getTemperature() {
        return temperature;
    }
}

public class ToMapExample {
    public static void main(String[] args) {
        List<City> cities = List.of(
                new City("New York", 8.5),
                new City("Los Angeles", 15.3),
                new City("Chicago", 6.7),
                new City("Houston", 18.9),
                new City("Phoenix", 12.1)
        );
        Map<String,Double>m=cities
                .stream()
                .filter(city -> city.getTemperature() > 10)
                .collect(Collectors.toMap(
                        City::getName,
                        City::getTemperature
                ));


        //2nd with merge function to resolve duplicate key conflict
        System.out.println("with merge function :");
        List<City> c2 = List.of(
                new City("New York", 8.5),
                new City("New York", 10.5),
                new City("Los Angeles", 15.3),
                new City("Chicago", 6.7),
                new City("Chicago", 9.6),
                new City("Houston", 18.9),
                new City("Phoenix", 12.1)
        );
        System.out.println(c2
                .stream()
                .collect(Collectors.toMap(
                        City::getName,
                        City::getTemperature,
                        (oldValue,newValue)-> newValue
                )));


        //3rd with supplier
        System.out.println("with supplier: ");
        System.out.println("with merge function :");
        List<City> c3 = List.of(
                new City("New York", 8.5),
                new City("New York", 10.5),
                new City("Los Angeles", 15.3),
                new City("Chicago", 6.7),
                new City("Chicago", 9.6),
                new City("Houston", 18.9),
                new City("Phoenix", 12.1)
        );
        System.out.println(c3
                .stream()
                .collect(Collectors.toMap(
                        City::getName,
                        City::getTemperature,
                        (oldValue,newValue)-> newValue

                )));
    }
}

