public class Additionsrechner {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.print("Geben sie die erste zu addierende Zahl an: ");
        double summand1 = scan.nextDouble();
        System.out.print("Geben sie die zweite zu addierende Zahl an: ");
        double summand2 = scan.nextDouble();
        scan.close();
        
        double summe = summand1 + summand2;
        System.out.println("Das ergebnis der Addition ist: " + summe);
      }
}