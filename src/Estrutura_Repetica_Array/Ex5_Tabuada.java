import java.util.Scanner;
/*
 * Desenvolva um gerador de tabulada
 * capas de gerar a tabuada de qualquer numero interiro entre 1 a 10
 * o usuário deve informar de qual numero ele deseja ver a tabuada.
 * a saida deve ser conforme o exemplo abaixo.
 * 
 * tabuada de 5:
 * 
 * 5X1 = 5
 * 5X2= 10;
 * ...
 * 
 */
public class Ex5_Tabuada {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
    
        int tabuada = scan.nextInt();
    
        System.out.println("Tabuada de " + tabuada);  
        
        for(int i = 1; i<=10; i++){
            System.out.println(tabuada+ " X " + i + " = "+(tabuada*i));            
        }
    }

    
}
