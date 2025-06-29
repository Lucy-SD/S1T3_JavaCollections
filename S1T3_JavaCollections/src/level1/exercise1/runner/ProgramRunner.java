package level1.exercise1.runner;

import level1.exercise1.model.Month;

import java.util.*;

public class ProgramRunner {
    public static void run() {

        List<Month> months = new ArrayList<Month>();

        Month enero = new Month("Enero");
        Month febrero = new Month("Febrero");
        Month marzo = new Month("Marzo");
        Month abril = new Month("Abril");
        Month mayo = new Month("Mayo");
        Month junio = new Month("Junio");
        Month julio = new Month("Julio");
        Month septiembre = new Month("Septiembre");
        Month octubre = new Month("Octubre");
        Month noviembre = new Month("Noviembre");
        Month diciembre = new Month("Diciembre");


        Month agosto = new Month("Agosto");

        months.add(enero);
        months.add(febrero);
        months.add(marzo);
        months.add(abril);
        months.add(mayo);
        months.add(junio);
        months.add(julio);
        months.add(septiembre);
        months.add(octubre);
        months.add(noviembre);
        months.add(diciembre);

        Set<Month> monthSet = new HashSet<>(months);


        System.out.println(" \n--- For-each del ArrayList sin Agosto --- ");
        for (Month month : months) {
            System.out.println(month.getName());
        }


        Iterator<Month> setIteratorNoAugust = monthSet.iterator();

        System.out.println("\n *** Iteración del HashSet sin Agosto ***\n" +
                "(el HashSet no mantiene un orden preestablecido)");
        while (setIteratorNoAugust.hasNext()) {
            Month month = setIteratorNoAugust.next();
            System.out.println(month.getName());
        }

        months.add(7, agosto);

        Iterator<Month> setIteratorWithAugust = months.iterator();

        System.out.println("\n --- Iteración del ArrayList con Agosto --- ");
        while (setIteratorWithAugust.hasNext()) {
            Month month = setIteratorWithAugust.next();
            System.out.println(month.getName());

        }

        monthSet.add(agosto);
        monthSet.add(enero);
        monthSet.add(marzo);

        months.add(enero);
        months.add(marzo);

        System.out.println("\n *** For-each del ArrayList con meses duplicados ***\n" +
                "               (se agregan al Array) ");
        for (Month month : months) {
            System.out.println(month.getName());
        }

        Iterator<Month> setIteratorWithAugustAndOthers = monthSet.iterator();

        System.out.println("\n --- Iteración del HashSet con Agosto y meses duplicados ---\n" +
                "              (no se agregan repetidos al Set) ");
        while (setIteratorWithAugustAndOthers.hasNext()) {
            Month month = setIteratorWithAugustAndOthers.next();
            System.out.println(month.getName());
        }
    }
}