package netology.spring_security.controller;

import lombok.AllArgsConstructor;
import netology.spring_security.model.Person;
import netology.spring_security.repositoy.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
public class Controller {

    private final Repository repository;


    @GetMapping("/persons/by-city")
    protected List<Person> findPersonByCityOfLiving(@RequestParam (value = "city", required = false) String city) {
        return repository.findPersonByCityOfLiving(city);
    }
    @GetMapping("/persons/by-age")
    protected List<Person> findPersonByContact_AgeBeforeOrderByContactAsc(@RequestParam(value = "age", required = false) Integer age){
       return repository.findPersonByContact_AgeBeforeOrderByContactAsc(age);
    }

    @GetMapping("/persons/by-name&surname")
    protected Optional<Person> findPersonByContact_NameContainingIgnoreCaseAndAndContact_SurnameContainingIgnoreCase(@RequestParam(value = "name", required = false) String name,@RequestParam(value = "surname", required = false) String surname){
        return repository.findPersonByContact_NameContainingIgnoreCaseAndAndContact_SurnameContainingIgnoreCase(name, surname);
    }

}
