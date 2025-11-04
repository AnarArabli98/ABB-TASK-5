package lesson7.classwork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Practice {
    static void main() {
        List<Elephant> elephants = new ArrayList<>();
        elephants.add(new Elephant("Alfa","Gray","250"));
        elephants.add(new Elephant("Beta","Blue","300"));
        elephants.add(new Elephant("Delta","Red","150"));
        elephants.add(new Elephant("Eta","Yellow","500"));

        for (Elephant elephant : elephants) {
            System.out.println(elephant);
        }

        Iterator<Elephant> iterator = elephants.iterator();
        while ((iterator.hasNext())) {
            Elephant elephant = iterator.next();
            System.out.println(elephant);
        }
    }

}
