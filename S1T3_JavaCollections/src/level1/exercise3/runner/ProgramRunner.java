package level1.exercise3.runner;

import level1.exercise3.model.CountryMapManager;

import java.io.FileWriter;
import java.util.*;

public class ProgramRunner {
    public static void run() {

        Scanner scan = new Scanner(System.in);
        String name;
        String answer;
        int score = 0;
        Map<String, String> countries;
        CountryMapManager manager = new CountryMapManager();


        System.out.println("Bienvenida. Cúal es tu nombre ¿?");
        name = scan.nextLine();

        System.out.println(name + ", vamos a jugar a \"encuentra la capital\"." +
                "\nTendrás que adivinar las capitales de 10 países. Vamos ¡!");

        countries = manager.createCountriesMap();

        for(int i = 0; i < 10; i++) {

            List<String> countryName = new ArrayList<String>(countries.keySet());
            int id = (int) ((Math.random()*50) + 1);
            String randomCountry = countryName.get(id);
            String capital = countries.get(randomCountry);

            System.out.println("Cúal es la capital de " +  randomCountry + " ¿?");
            answer = scan.nextLine();

            if(answer.equalsIgnoreCase(capital)) {
                score++;
                System.out.println("Muy bien. Es correcto. Sumas un punto.");
            } else {
                System.out.println("No es correcto. La capital de " + randomCountry + " es " + capital + ".");
            }
        }

        System.out.println("\n    --- Fin del Juego ---   \n");

        try (FileWriter writer = new FileWriter("puntuacion.txt")){
            writer.write("El jugador " + name + " ha ganado " + score + " puntos.");
            System.out.println("El jugador " + name + " ha ganado " + score + " puntos.\nGracias por participar = )");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}