package level1.exercise1.runner;

import level1.exercise1.model.Month;

import java.util.*;

public class ProgramRunner {
    public static void run() {

        List<Month> months = new ArrayList<Month>();
        Set<Month> monthSet = new HashSet<>();

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

        monthSet.add(enero);
        monthSet.add(febrero);
        monthSet.add(marzo);
        monthSet.add(abril);
        monthSet.add(mayo);
        monthSet.add(junio);
        monthSet.add(julio);
        monthSet.add(septiembre);
        monthSet.add(octubre);
        monthSet.add(noviembre);
        monthSet.add(diciembre);


        System.out.println(" \n--- For-each del ArrayList sin Agosto --- ");
        for (Month month : months) {
            System.out.println(month.getName());
        }


        Iterator<Month> setIterator = monthSet.iterator();

        System.out.println("\n *** Iteración del HashSet sin Agosto ***\n" +
                "(el HashSet no mantiene un orden preestablecido)");
        while (setIterator.hasNext()) {
            Month month = setIterator.next();
            System.out.println(month.getName());
        }


        months.add(7, agosto);
        Iterator<Month> iterator = months.iterator();


        System.out.println("\n --- Iteración del ArrayList con Agosto --- ");
        while (iterator.hasNext()) {
            Month month = iterator.next();
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

        Iterator<Month> setIter = monthSet.iterator();

        System.out.println("\n --- Iteración del HashSet con Agosto y meses duplicados ---\n" +
                "              (no se agragan repetidos al Set) ");
        while (setIter.hasNext()) {
            Month month = setIter.next();
            System.out.println(month.getName());
        }
    }
}