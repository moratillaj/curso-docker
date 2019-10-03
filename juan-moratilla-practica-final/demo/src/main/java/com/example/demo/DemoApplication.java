package com.example.demo;

import com.example.demo.model.Car;
import com.example.demo.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

    @Autowired
    private CarRepository carRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Component
    public class LoadData implements CommandLineRunner {

        @Override
        public void run(String... args) throws Exception {

            Stream.of(new Car(1, "megane"), new Car(2, "fiesta"))
                    .forEach(carRepository::save);


        }
    }
}
