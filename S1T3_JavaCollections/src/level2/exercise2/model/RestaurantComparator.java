package level2.exercise2.model;

import java.util.Comparator;

public class RestaurantComparator implements Comparator<Restaurant> {

    public int compare(Restaurant r1, Restaurant r2) {
        int nameCmp = r1.getName().compareTo(r2.getName());
        if (nameCmp != 0) {
            return nameCmp;
        }
        return (Integer.compare(r2.getRating(), r1.getRating()));
    }
}