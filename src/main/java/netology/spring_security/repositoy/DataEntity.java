package netology.spring_security.repositoy;

import javax.persistence.*;
import netology.spring_security.model.Contact;
import netology.spring_security.model.Person;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class DataEntity implements CommandLineRunner {
    @PersistenceContext
    EntityManager entityManager;
    @Override
    @Transactional
    public void run(String... args) throws Exception {

        Person anar = Person.builder().contact(Contact.builder()
                        .name("Anar")
                        .surname("Gafarov")
                        .age(31)
                        .build())
                .phoneNumber("+7 (111) 111-11-11")
                .cityOfLiving("Moscow")
                .build();

        Person dmitriy = Person.builder().contact(Contact.builder()
                        .name("Dmitriy")
                        .surname("Guliy")
                        .age(34)
                        .build())
                .phoneNumber("+7 (999) 999-99-99")
                .cityOfLiving("Moscow")
                .build();

        Person vlad = Person.builder().contact(Contact.builder()
                        .name("Vladislav")
                        .surname("Reznikov")
                        .age(42)
                        .build())
                .phoneNumber("+7 (666) 666-66-66")
                .cityOfLiving("Krasnodar")
                .build();
//        entityManager.persist(anar);
//        entityManager.persist(dmitriy);
//        entityManager.persist(vlad);
    }
}
