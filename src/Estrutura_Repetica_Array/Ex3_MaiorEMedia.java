import java.util.Scanner;

/*
 * faça um programa que leia 5 numeros e 
 * informe o maior numero 
 * e a media desses numeros
 */

public class Ex3_MaiorEMedia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         int numero;

         int count = 0;
         int maior = 0;
         int soma = 0; 
         int media = 0;
         do {
            System.out.println("Numero: ");
            numero = scan.nextInt();
            if (numero > maior) maior = numero;
            count = count +1;

            soma = soma + numero;
         } while(count < 5);
         media = soma/5;
         System.out.println("Maior: " + maior);
         System.out.println("Media: " + media);
    }
    
}
