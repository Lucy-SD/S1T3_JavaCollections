package level2.exercise2.model;

import java.util.Objects;

public class Restaurant {

    String name;
    int rating;

    public Restaurant(String name, int rating){
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return this.name;
    }
    public int getRating() {
        return this.rating;
    }

    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Restaurant other = (Restaurant) obj;

        return name.equals(other.name) && rating == other.rating;
    }

    public int hashCode() {
        return Objects.hash(name, rating);
    }

    public String toString() {
        return "El restaurante \"" + this.name + "\" tiene una puntuación de " + this.rating + ".";
    }
}
