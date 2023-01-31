import java.util.Scanner;

public class Ex2_Nota {
    /*
     * faça um programa que peça uma nota, entre 0 e dez.
     * Mostre uma mensagem caso o valor seja inválido
     * e continue pedindo
     * ate que o usuário informe uma valor valido.
     */
 public static void main(String[] args) {
 
    try (Scanner scan = new Scanner(System.in)) {
        int nota;       

        System.out.println("Digite a nota: ");
        nota = scan.nextInt();
        
        while(nota < 0 | nota > 10){
            System.out.println("Nota invalido Digite novamente");
            nota = scan.nextInt();

        }
    }
    System.out.println("Processo Finalizado...");
    
    
 }
    
}
