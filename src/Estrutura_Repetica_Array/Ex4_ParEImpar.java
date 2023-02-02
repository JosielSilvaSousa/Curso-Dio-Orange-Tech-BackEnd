import java.util.Scanner;

/*
 * Faça um programa que peça N Numeros inteiros,
 * calcule e mostre a quantidade de numeros pares
 * e a quantidade de numeros impares.
 */
public class Ex4_ParEImpar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros = 0;
        int numero;
        int quantidadePares=0, quantidadeImpares =0;

        System.out.println("Digite a quantidade de numeros: ");        
        quantidadeNumeros = scan.nextInt();
        

        int count =0;
        int soma = 0;
        do{ 
            System.out.println("Numero: ");
            numero = scan.nextInt();
            
            if (numero % 2 == 0) quantidadePares ++;
            else quantidadeImpares ++;
           
            soma += numero;

            count ++;
        }while(count < quantidadeNumeros);
        System.out.println("Quantidade de numeros pares: " + quantidadePares );
        System.out.println("Quantidade de numeros impares: " + quantidadeImpares );
        System.out.println("Soma: "+ soma);
        
        
    }

}