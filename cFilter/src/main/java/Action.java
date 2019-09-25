package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by dingw on 6/28/2019.
 */

public class Action {
    public Action(){}

    public void collection(){
        Collection<Person> collection = new ArrayList<>();
        collection.add(new Person("Sally", 21, "Female"));
        collection.add(new Person("Smith", 30, "Male"));
        collection.add(new Person("Cathy", 25, "Female"));
        collection.add(new Person("Jason", 23, "Male"));
        collection.add(new Person("Steve", 26, "Male"));

        System.out.println(collection.toString());

        Stream<Person> personStream = collection.stream().filter(new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return "Male".equals(person.getGender());
            }
        });
        System.out.println(personStream.collect(Collectors.toList()).toString());

        personStream = collection.stream().filter(new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return "Female".equals(person.getGender());
            }
        });
        System.out.println(personStream.collect(Collectors.toList()).toString());

        personStream = collection.stream().filter(c -> c.getAge() > 23);
        System.out.println(personStream.collect(Collectors.toList()).toString());
    }

    public void list(){
        List<Person> persons = Arrays.asList(new Person[]{ new Person("Amy", 25, "Female"), new Person("Ken", 31, "Male"), new Person("Sam", 22, "Male")});
        System.out.println(persons.toString());

        persons = Arrays.asList(new Person[]{ new Person("Amy", 25, "Female"), new Person("Ken", 31, "Male"), new Person("Sam", 22, "Male")})
                .stream()
                .filter(data -> data.getAge() > 22)
                .filter(data -> data.getGender().equals("Male"))
                .collect(Collectors.toList());
        System.out.println(persons.toString());
    }
}
