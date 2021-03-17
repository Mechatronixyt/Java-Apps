/*
* @author:  Mechatronix
* @version: 3.0
* @year: 2020
 */

import java.util.Random;
import java.util.Scanner;

public class Zufallszahlengenerator {

    //Variablen initialisieren
    public static int zufallszahl;
    public static int zaehler;

    public static int max_Int;
    public static int min_Int;
    public static int widerholkonstante_Int;

    public static double max_Double;
    public static double min_Double;
    public static double widerholkonstante_Double;

    public static String run_string;


    //mainclass
    public static void main(String[] args) {

        //scan initialisieren
        java.util.Scanner scan = new java.util.Scanner(System.in);

        //die unendliche Schleife
        for(;true; ) {

            //Überschrift etc ausgeben
            System.out.println("Zufallszahlengenerator");
            System.out.println("Dies ist ein kleiner Zufallszahlengenerator");
            System.out.println("");
            System.out.println("--------------------------------------------");
            System.out.println("");

            //Programm starten
            System.out.print("Geben Sie 'run' ein um das Programm (erneut) zu startnen: ");
            run_string = scan.next();

            System.out.println("");
            System.out.println("------------------------------------------------");
            System.out.println("");

            if (run_string.equals("run")) {

                //runned wird gestartet
                runned();
            }
            else {
                System.out.println("Dies ist nicht 'run'.");
                System.out.println("Bitte versuchen Sie es erneut.");
            }

            System.out.println("");
            System.out.println("");
            System.out.println("");
        }
    }

    //runned wird ausgeführt
    private static void runned() {

        //Minimum und Maximum erfragen
        min_and_max();

        //und alles erechnen
        calculate_and_output();
    }
    public static void calculate_and_output(){

        //Random und scan initialisieren
        java.util.Scanner scan = new Scanner(System.in);
        java.util.Random random = new Random();

        if(min_Int >= 0 || max_Int >= 0){
            if(max_Int >= min_Int) {
                if(max_Int != min_Int) {
                    zufallszahl = random.nextInt(max_Int) + min_Int;

                    System.out.println("Die ermittelte Zufallszahl ist " + zufallszahl + ".");

                    System.out.println("");

                    System.out.print("Geben Sie erneut 'run' ein das eine Zahl mit den gleichen Parametern angezeigt wird: ");
                    run_string = scan.next();

                    if (run_string.equals("run")) {

                        System.out.println("");

                        System.out.print("Geben Sie eine belibige Zahl ein um anzugeben wie oft eine Zahl ausgegeben werden soll: ");
                        widerholkonstante_Double = scan.nextDouble();
                        widerholkonstante_Int = (int) widerholkonstante_Double;

                        if(widerholkonstante_Int >= 1){
                            for(zaehler = 1; widerholkonstante_Int >= zaehler; zaehler++) {
                                System.out.println("");
                                zufallszahl = random.nextInt(max_Int) + min_Int;
                                System.out.println("Die ermittelte Zufallszahl ist " + zufallszahl + ".");
                            }
                        }
                        else {
                            System.out.println("");
                            System.out.println("Ok Sie haben sich umentschieden.");
                            System.out.println("Das Programm startet jetzt von vorn.");
                        }
                    }
                    else {
                        System.out.println("");
                        System.out.println("Ok das Programm startet von vorn.");
                    }
                }
                else {
                    System.out.println("Ok da Sie zwei gleiche Parameter angegeben haben ist die Zufallszahl logischerwiese auch gleich diesen Parametern " + min_Int + ".");
                }
            }
            else {
                System.out.println("Dies ist keine korekte Eingebe.");
                System.out.println("Bitte versuchen Sie es von vorn!");
            }
        }
        else{
            System.out.println("Unter Null funktioniert noch nicht kommt aber bald nach.");
        }
    }
    public static void min_and_max(){
        java.util.Scanner scan = new Scanner(System.in);

        System.out.print("Geben Sie das Minimum ein: ");
        min_Double = scan.nextDouble();
        min_Int = (int) min_Double;
        System.out.println("Ok das Minimum beträgt " + min_Int + ".");

        System.out.print("Geben Sie das Maximum ein: ");
        max_Double = scan.nextDouble();
        max_Int = (int) max_Double;
        System.out.println("Ok das Maximum beträgt " + max_Int + ".");

        System.out.println("");
    }
}