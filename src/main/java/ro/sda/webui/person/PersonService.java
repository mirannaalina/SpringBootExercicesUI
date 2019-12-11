package ro.sda.webui.person;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

   private final List<Person> persons = new ArrayList<>();

   public PersonService(){
       persons.add(new Person("Andrei",23));
       persons.add(new Person("Alina",20));
       persons.add(new Person("Mihai",25));
   }

   public Person getFirstPerson(){
       return persons.get(0);
   }

   public Optional<Person> findByName(String name){
       return persons.stream()
               .filter(p -> p.getName().toLowerCase().equals(name.toLowerCase()))
               .findFirst(); //operatie de incheiere a steam-ului, cum e si collect

   }

}
