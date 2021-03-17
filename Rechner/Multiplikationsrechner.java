public class Multiplikationsrechner {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.print("Geben sie die erste zu multiplizierende Zahl an: ");
        double faktor1 = scan.nextDouble();
        System.out.print("Geben sie die zweite zu multiplizierende Zahl an: ");
        double faktor2 = scan.nextDouble();
        scan.close();
        
        double produckt = faktor1 *faktor2;
        System.out.println("Das ergebnis der Multiplikation ist: " + produckt);
      }
}