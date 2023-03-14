import java.util.Scanner; 

public class ex228 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        double raio, circunferencia, area, diametro;

        System.out.println("DIGITE O RAIO:");
        raio = leitor.nextDouble();

        circunferencia = 2 * Math.PI * raio;
        area = Math.PI * Math.pow(raio, 2);
        diametro = 2 * raio;

        System.out.printf("CIRCUNFERENCIA: %.2f%n", circunferencia);
        System.out.printf("AREA: %.2f%n", area);
        System.out.printf("DIAMETRO: %.2f%n", diametro);

        leitor.close();

    }
}
