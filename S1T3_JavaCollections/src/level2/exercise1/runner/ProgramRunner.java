package level2.exercise1.runner;

import level2.exercise1.model.Restaurant;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ProgramRunner {
    public static void run() {

        Set<Restaurant> restaurants = new HashSet<Restaurant>();

        Restaurant canRos = new Restaurant("Can Ros", 7);
        Restaurant canRos2 = new Restaurant("Can Ros", 5);
        Restaurant cantina = new Restaurant("Cantina", 8);
        Restaurant canRos3 = new Restaurant("Can Ros", 7);

        Collections.addAll(restaurants, canRos, canRos2, cantina, canRos3);

        for(Restaurant restaurant : restaurants) {
            System.out.println(restaurant);
        }
    }
}