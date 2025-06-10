package level1.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ProgramRunner {
    public static void run() {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(5);
        list1.add(8);
        list1.add(13);
        list1.add(21);
        list1.add(34);

        ListIterator<Integer> list1Iterator = list1.listIterator();

        System.out.println("Secuencia de Fibonacci:");

        while (list1Iterator.hasNext()){
            System.out.println(list1Iterator.next() + ".");
        }

        while (list1Iterator.hasPrevious()) {
            list2.add(list1Iterator.previous());
        }

        System.out.println("\nSecuencia de Fibonacci invertida:");
        for (Integer num : list2) {
            System.out.println(num + ". ");
        }
    }
}
