package Exemplo_Collentions;

import java.rmi.server.RMIClassLoader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

/*Utilizando listas, faça um programa que faça 5 perguntas para uma
pessoa sobre um crime. As perguntas são:

"Telefonou para a vítima?"

"Esteve no local do crime?"

"Mora perto da vítima?"

"Devia para a vítima?"

"Já trabalhou com a vítima?"

Se a pessoa responder positivamente a 2 questões ela deve ser
classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
"Assassina". Caso contrário, ela será classificado como "Inocente".
*/
public class Exercicio2 {
    public static void main(String[] args) {
        System.out.println("Responda as perguntas abaixo: "); 
        try (Scanner scan = new Scanner(System.in)) {
            List<String> temperatura = new ArrayList<>();
            temperatura.add("Telefonou para a vítima?");
            temperatura.add("Esteve no local do crime?");
            temperatura.add("Mora perto da vítima?");
            temperatura.add("Devia para a vítima?");
            temperatura.add("Já trabalhou com a vítima?");
  
 
            System.out.println("Responda com S ou N");
            Iterator<String> interator = temperatura.iterator();
            int count =0;
            while(interator.hasNext()){
             String next = interator.next();
             System.out.println(next);
             String resultado = scan.next();
             if (resultado.equalsIgnoreCase("S"))
             count += 1;
            }
     
            if (count == 2 ){
            System.out.println("Suspeito!");
             }
            else  if (count >2 && count <=4 ){
            System.out.println("Cúmplice!");
            }
            else if (count == 5 ){
            System.out.println("Assassina!");
            }
            else
            System.out.println("Inocente!");
        }
        
    }
    
}
