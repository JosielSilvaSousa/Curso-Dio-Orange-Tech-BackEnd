import java.util.Locale;
import java.util.Scanner;

public class EntradaScanner {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite Seu Nome");
    String nome = scanner.next();

    System.out.println("Digite se sobre nome");
    String sobrenome = scanner.next();

    System.out.println("Digite sua idade");
    String idade = scanner.next();

    System.out.println("Digite sua altura");
    String altura = scanner.next();


        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        
        
    }
    
}
