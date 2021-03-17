public class Subtraktionsrechner {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.print("Geben sie die erste zu suptrahierende Zahl an: ");
        double minuent = scan.nextDouble();
        System.out.print("Geben sie die zweite zu suptrahierende Zahl an: ");
        double suptrahend = scan.nextDouble();
        scan.close();
        
        double differenz = minuent - suptrahend;
        System.out.println("Das ergebnis der Suptrktion ist: " + differenz);
      }
}