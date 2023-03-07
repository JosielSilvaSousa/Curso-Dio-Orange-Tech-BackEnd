package Exemplo_Collentions.Set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
    public static void main(String[] args) {
        System.out.println("Crie um conjuto e adicone as notas");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));
        System.out.println(notas.toString());

   //     System.out.println("Exiba a posição da nota 5.0: "); Não para fazer porque o set não tem get;
   //     System.out.println("Adicone na lista a nota 8.0na posição 4: ");não da para fazer com set, não possui indice
   System.out.println("Confira se a nota 5 esta no consjunto: " + notas.contains(5d));  
  //      System.out.println("Exiba a terceira nota adicionada  ");  também não da para fazer.
   System.out.println("Exiba a menor nota: " + Collections.min(notas));
   System.out.println("Exiba a maior nota: " + Collections.max(notas));

   Iterator<Double> interator = notas.iterator();
      
   Double soma = 0d;
   while(interator.hasNext()){
    Double next = interator.next();
    soma += next;
   }

   System.out.println("Exiba a soma dos valores: " + soma);

   System.out.println("Exiba a média das notas: " + (soma/notas.size()));

   System.out.println("Remova a nota 0: ");
   notas.remove(0d);
   System.out.println(notas);

   System.out.println("Remova as notas menores que 7 e exiba a lsta: ");
   Iterator<Double> interator1 = notas.iterator();
      

   while(interator1.hasNext()){
    Double next = interator1.next();
    if (next < 7) interator.remove();

   }

   System.out.println(notas);

   System.out.println("Exiba todas as notas na orde que foram informadas: ");
   Set<Double> notas2 = new LinkedHashSet<>();
   notas2.add(7d);
   notas2.add(8.5);
   notas2.add(9.3);
   notas2.add(5d);
   notas2.add(7d);
   notas2.add(0d);
   notas2.add(3.6);
   System.out.println(notas2);

   System.out.println("Exiba todas as notas na ordem crescente: ");
   Set<Double> notas3 = new TreeSet<>(notas2);
   System.out.println(notas3);

   System.out.println("Apague todo o conjuto: ");
   notas.clear();
   System.out.println("Conferindo se o conjunto esta vazio: "+ notas.isEmpty());




}
    
}
