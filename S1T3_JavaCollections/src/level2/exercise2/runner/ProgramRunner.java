package level2.exercise2.runner;

import level2.exercise2.model.Restaurant;
import level2.exercise2.model.RestaurantComparator;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProgramRunner {
    public static void run() {

        Set<Restaurant> restaurants = new HashSet<Restaurant>();

        Restaurant canTina = new Restaurant("Can Tina", 5);
        Restaurant canRos = new Restaurant("CanRos", 7);
        Restaurant alabriga = new Restaurant("Alabriga", 6);
        Restaurant canSanso = new Restaurant("Can Sansó", 8);
        Restaurant canRos2 = new Restaurant("CanRos", 8);
        Restaurant alabriga2 = new Restaurant("Alabriga", 6);
        Restaurant fire = new Restaurant("Fire", 4);
        Restaurant baobab = new Restaurant("BaoBab", 10);

        Collections.addAll(restaurants, canTina, canRos, alabriga, canSanso, canRos2, alabriga2, fire, baobab);

        System.out.println(" --- Lista sin repetidos, sin ordenar --- ");
        for(Restaurant restaurant : restaurants ) {
            System.out.println(restaurant);
        }

        Set<Restaurant> sortedRestaurants = new TreeSet<Restaurant>(new RestaurantComparator());
        sortedRestaurants.addAll(restaurants);


        System.out.println("\n *** Lista ordenada *** ");
        for (Restaurant restaurant : sortedRestaurants) {
            System.out.println(restaurant);
        }
    }
}