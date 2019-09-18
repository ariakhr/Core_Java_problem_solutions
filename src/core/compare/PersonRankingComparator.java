package core.compare;

import domain.Person;

import java.util.Comparator;

public class PersonRankingComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getRanking() - o2.getRanking();
    }
}
