public class Kreis {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.print("Geben Sie den Radius an: ");
        double radius = scan.nextDouble();
        scan.close();
        
        double umfang=(2*(22/7))*radius;
        double flaeche= (22/7)*(radius*radius);
        System.out.println("Umfang: " + umfang);
        System.out.println("Fläche: " + flaeche);
    }
}