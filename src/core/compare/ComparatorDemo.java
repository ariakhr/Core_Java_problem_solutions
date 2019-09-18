package core.compare;

import domain.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Person> footballTeam = new ArrayList<>();
        Person Person1 = new Person(59, "John", 20);
        Person Person2 = new Person(67, "Roger", 22);
        Person Person3 = new Person(45, "Steven", 24);
        footballTeam.add(Person1);
        footballTeam.add(Person2);
        footballTeam.add(Person3);

        System.out.println("Before Sorting : " + footballTeam);

        PersonRankingComparator comparator = new PersonRankingComparator();
        Collections.sort(footballTeam, comparator);

        System.out.println("After Sorting by Ranking : " + footballTeam);

        PersonAgeComparator comparatorAge = new PersonAgeComparator();
        Collections.sort(footballTeam, comparatorAge);
        System.out.println("After Sorting by Age : " + footballTeam);


    }

}
