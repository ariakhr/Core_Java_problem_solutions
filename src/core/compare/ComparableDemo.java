package core.compare;

import domain.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

    public static void main(String[] args) {
        List<Person> footballTeam = new ArrayList<>();
        Person Person1 = new Person(59, "John", 20);
        Person Person2 = new Person(67, "Roger", 22);
        Person Person3 = new Person(45, "Steven", 24);
        footballTeam.add(Person1);
        footballTeam.add(Person2);
        footballTeam.add(Person3);

        System.out.println("Before Sorting : " + footballTeam);
        // If Person class not implements comparable then below error happens
        // Compile time exception for below sort- reason: no instance(s) of type variable(s)
        // T exist so that Person conforms to Comparable<? super T>

        Collections.sort(footballTeam);
        System.out.println("After Sorting : " + footballTeam);
    }
}
