package Desafio;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();
        
        String resultado ="";
        for (int i=0;i < tamanho;i++) {
          resultado += "/";
        }
        System.out.println(resultado);
    }    
    
}
