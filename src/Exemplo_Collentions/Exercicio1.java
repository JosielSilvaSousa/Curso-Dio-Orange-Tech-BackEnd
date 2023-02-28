package Exemplo_Collentions;
/*Faça um programa que receba a temperatura média dos 6
primeiros meses do ano e armazene-as em uma lista.

Após isto, calcule a média semestral das temperaturas e
mostre todas as temperaturas acima desta média, e em que
mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2
– Fevereiro e etc).*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercicio1 {

    public static void main(String[] args) {
       System.out.println("Crie uma lista com as 6 primeiras temperaturas do ano: "); 

       List<Double> temperatura = new ArrayList<>();
       temperatura.add(31.5);
       temperatura.add(25.0);
       temperatura.add(28.8);
       temperatura.add(20.1);
       temperatura.add(15.9);
       temperatura.add(32.0);

       System.out.println("Media da temperatura semestral");
       Iterator<Double> interator = temperatura.iterator();
      
       Double media = 0d;
       while(interator.hasNext()){
        Double next = interator.next();
        media += next;
       }
       Double valorMedia = media/6;
       System.out.println(media/6);

       Iterator<Double> interator1 = temperatura.iterator();
       while(interator1.hasNext()){
        Double next = interator1.next();
        if (next > valorMedia){
          System.out.println(next + "Esta Acina da media");
        }

       }
    }  
}
    

