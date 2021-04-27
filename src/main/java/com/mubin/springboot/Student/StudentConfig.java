package com.mubin.springboot.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.LocalDate;
import java.util.List;
import static java.time.Month.OCTOBER;


@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mubin = new Student("Mubin","uic.mubin@gmail.com"
                    , LocalDate.of(1998, OCTOBER,03));
            Student alex = new Student("Alex","alex@gmail.com"
                    , LocalDate.of(1992, OCTOBER,03));
            repository.saveAll(List.of(mubin,alex));

        };
    }

}
