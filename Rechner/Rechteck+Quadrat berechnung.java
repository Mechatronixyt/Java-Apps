public class Rechteck {

    public static void main(String[] args) {
      java.util.Scanner scan = new java.util.Scanner(System.in);
      System.out.print("Geben Sie die Länge an: ");
      double laenge = scan.nextDouble();
      System.out.print("Geben Sie die Breite an: ");
      double breite = scan.nextDouble();
      scan.close();
      
      double umfang=(laenge+breite)*2;
      double flaeche=laenge*breite;
      System.out.println("Umfang: " + umfang);
      System.out.println("Fläche: " + flaeche);
    }
  
  }