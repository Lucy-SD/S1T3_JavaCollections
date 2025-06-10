package level1.exercise3.runner;

import level1.exercise3.model.Country;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;

public class ProgramRunner {
    public static void run() {

        Scanner scan = new Scanner(System.in);
        String name;
        String answer;
        int score = 0;
        FileWriter userFile;
        PrintWriter userScore;
        Map<String, String> countries;
        Country country = new Country();


        System.out.println("Bienvenida. Cúal es tu nombre ¿?");
        name = scan.nextLine();

        System.out.println(name + ", vamos a jugar a \"encuentra la capital\"." +
                "\nTendrás que adivinar las capitales de 10 países. Vamos ¡!");

        countries = country.createCountriesMap();

        for(int i = 0; i < 10; i++) {

            List<String> countryName = new ArrayList<String>(countries.keySet());
            int id = (int) ((Math.random()*50) + 1);
            String randomCountry = countryName.get(id);
            String capital = String.valueOf(countries.get(randomCountry));

            System.out.println("Cúal es la capital de " +  randomCountry + " ¿?");
            answer = scan.nextLine();

            if(answer.equalsIgnoreCase(capital)) {
                score++;
                System.out.println("Muy bien. Es correcto. Sumas un punto.");
            } else {
                System.out.println("No es correcto. La capital de " + randomCountry + " es " + capital);
            }
        }

        System.out.println("--- Final del Juego ---");

        try {
            userFile = new FileWriter("D:\\Documents\\Cursos Programación\\Espe\\puntuacion.txt");
            new PrintWriter(userFile);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("El jugador " + name + " ha ganado " + score + " puntos.\n" +
                "Gracias por participar = )");
    }
}