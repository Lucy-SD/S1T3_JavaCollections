package level1.exercise3.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Country {


    FileReader path = null;
    BufferedReader reader = null;
    Map<String, String> countries = new HashMap<String, String>();

    public Map<String, String> createCountriesMap () {

        try {
            path = new FileReader("countries.txt");
            if (path.ready()) {
                reader = new BufferedReader(path);
                String line; //= reader.readLine();
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(" ");
                    if (parts.length == 2) {
                        countries.put(parts[0].trim(), parts[1].trim());
                    }
                }
            }
        } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        return countries;
    }
}