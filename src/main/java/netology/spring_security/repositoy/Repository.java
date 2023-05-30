package netology.spring_security.repositoy;

import netology.spring_security.model.Contact;
import netology.spring_security.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Person, Contact> {

    List<Person> findPersonByCityOfLiving(String city);

    List<Person> findPersonByContact_AgeBeforeOrderByContactAsc(Integer age);

    Optional<Person> findPersonByContact_NameContainingIgnoreCaseAndAndContact_SurnameContainingIgnoreCase(String name, String surname);
}
