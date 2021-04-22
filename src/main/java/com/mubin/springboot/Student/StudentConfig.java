package com.mubin.springboot.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.OCTOBER;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mubin = new Student("Mubin","uic.mubin@gmail.com"
                    , LocalDate.of(1998, OCTOBER,03),22);
            Student alex = new Student("Alex","alex@gmail.com"
                    , LocalDate.of(1998, OCTOBER,03),22);
            repository.saveAll(List.of(mubin,alex));

        };
    }

}
