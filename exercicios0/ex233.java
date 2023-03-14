import java.util.Scanner;

public class ex233 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float peso, altura,imc;
        

        System.out.println("DIGITE SEU PESO EM KG:\n");
        peso = leitor.nextFloat();

        System.out.println("DIGITE SUA ALTURA EM METROS:\n");
        altura = leitor.nextFloat();

        float alturoemmetrosquadrados = altura * altura;

        imc = peso / alturoemmetrosquadrados;

        System.out.printf("SEU IMC É: %.2f",imc);

        System.out.println("\nBMI VALUES\n");
        System.out.println("UNDERWEIGHT: less than 18.5\n");
        System.out.println("NORMAL: between 18.5 and 24.9\n");
        System.out.println("OVERWEIGHT: between 25 and 29.9\n");
        System.out.println("OBESE: 30 or greater\n");

        leitor.close();
    }
    
}
