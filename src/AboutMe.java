import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


public class AboutMe {
    public static void main(String[] args) {
        //criando o objeto scanner
        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu Sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        //imprimindo os dados obitidos pelo usuario
        System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + "anos");
        System.out.println("Minha altura é " + altura + "cm");
        scanner.close();
        } 
        catch(InputMismatchException e){
            System.err.println("Os Campos idade e altura precisam ser numéricos");
        }
    }
}
