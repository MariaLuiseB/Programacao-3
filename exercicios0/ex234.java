import java.util.Scanner;

public class ex234 {
    public static void main(String[] args) {
        //populacao mundial -> 7,888 bilhões
        // taxa de crescimento 0,9
        Scanner leitor = new Scanner(System.in);
        float populacao;
        
        System.out.println("DIGITE A POPULACAO MUNDIAL ATUAL:");
        populacao = leitor.nextFloat();

        System.out.printf("POPULACAO MUNDIAL EM 1 ANOS: %f\n", populacao * 0.9);
        System.out.printf("POPULACAO MUNDIAL EM 2 ANOS: %f\n", populacao * 0.8);
        System.out.printf("POPULACAO MUNDIAL EM 3 ANOS: %f\n", populacao * 0.7);
        System.out.printf("POPULACAO MUNDIAL EM 4 ANOS: %f\n", populacao * 0.6);
        System.out.printf("POPULACAO MUNDIAL EM 5 ANOS: %f\n", populacao * 0.5);
        
        leitor.close();
    }
    
}
