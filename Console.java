
import java.util.Scanner;

public class Console {


    public static void main(String[] args){


        Scanner leitor = new Scanner(System.in);

        int a = 10;
        int b = 5;
        double resultado = a + b;
        int resultadoInteiro = (int) resultado; //casting
        var resultadoDinamico = a + b;
        var str = "É um texto?";
        var resultadoString = a + b;

        System.out.println("Digite um texto...");
        String texto = leitor.nextLine();

        System.out.println("texto digitado:" + texto);

        System.out.println("Digite um número inteiro...");
        int inteiro = leitor.nextInt();
        System.out.println("Número digitado: " + inteiro);

        System.out.println("Digite um número decimal...");
        double numero = leitor.nextDouble();
        System.out.println("Número digitado: " + numero);

        leitor.close();


    }

}
