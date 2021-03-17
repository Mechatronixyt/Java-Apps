
/*
* @author:  Mechatronix
* @version: 1.0
* @year: 2020
*/

public class Rechner{
    public static void main(String[] args){

        // Eingabe der Rechenart
        final java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.print("Geben Sie an was ausgeführt werden soll('plus','minus','geteilt','mal'): ");
        final var str = scan.next();

        // Ausgabe der gewälten Rechenart
        System.out.println("Sie haben " + str + " gewählt.");

        // Abfrage Plus
        if (str.equals("plus")) {
            System.out.print("Geben sie die erste zu addierende Zahl an: ");
            final double summand1 = scan.nextDouble();
            System.out.print("Geben sie die zweite zu addierende Zahl an: ");
            final double summand2 = scan.nextDouble();
            scan.close();

            final double summe = summand1 + summand2;
            System.out.println("Das ergebnis der Addition ist: " + summe);
        }

        // Abfrage Minus
        if (str.equals("minus")) {
            System.out.print("Geben sie die erste zu subtrahierende Zahl an: ");
            final double minuent = scan.nextDouble();
            System.out.print("Geben sie die zweite zu subtrahierende Zahl an: ");
            final double subtrahend = scan.nextDouble();
            scan.close();

            final double differenz = minuent - subtrahend;
            System.out.println("Das ergebnis der Subtrktion ist: " + differenz);
        }

        // Abfrage Mal
        if (str.equals("mal")) {
            System.out.print("Geben sie die erste zu multiplizierende Zahl an: ");
            final double faktor1 = scan.nextDouble();
            System.out.print("Geben sie die zweite zu multiplizierende Zahl an: ");
            final double faktor2 = scan.nextDouble();
            scan.close();

            final double produckt = faktor1 *faktor2;
            System.out.println("Das ergebnis der Multiplikation ist: " + produckt);
        }

        // Abfrage Geteilt
        if (str.equals("geteilt")) {
            System.out.print("Geben sie die erste zu dividierende Zahl an: ");
            final double dividend = scan.nextDouble();
            System.out.print("Geben sie die zweite zu dividierende Zahl an: ");
            final double divisor = scan.nextDouble();
            scan.close();

            final double qoutient = dividend / divisor;
            System.out.println("Das ergebnis der Division ist: " + qoutient);
        }

    }
}