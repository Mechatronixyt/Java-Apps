public class Divisionsrechner {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.print("Geben sie die erste zu dividierende Zahl an: ");
        double dividend = scan.nextDouble();
        System.out.print("Geben sie die zweite zu dividierende Zahl an: ");
        double divisor = scan.nextDouble();
        scan.close();
        
        double qoutient = dividend / divisor;
        System.out.println("Das ergebnis der Division ist: " + qoutient);
      }
}