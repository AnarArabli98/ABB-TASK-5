package lesson8.classwork;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Practice {
    static void main() {
//        List<Person> persons = new ArrayList<>();
//        List<Person> people = new LinkedList<>();
//
//        people.add(new Person(1, "SS", "VV"));
//        people.add(new Person(2, "QQ", "EE"));
//        people.add(new Person(3, "DD", "OO"));
//
//
//        persons.add(new Person(1,"LLL","KKK"));
//        persons.add(new Person(2,"FFF","GGG"));
//        persons.add(new Person(3,"RRR","YYY"));
//
//        class idComparator implements Comparator<Person> {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return (int) (o1.getId() - o2.getId());
//            }
//        }
//
//        Collections.sort(persons, new idComparator());
//
//        for (Person person : persons) {
//            System.out.println(person);
//        }

        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(dtf.format(now));


    }
}
