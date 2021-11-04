package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student ailene = new Student(
                    "Ailene",
                    "ailenea@gmail.com",
                    LocalDate.of(1999, Month.SEPTEMBER, 22)
            );

            Student matthew = new Student(
                    "Matthew",
                    "matthewb@gmail.com",
                    LocalDate.of(1999, Month.JUNE, 22)
            );

            repository.saveAll(
                    List.of(ailene, matthew)
            );
        };
    }
}
