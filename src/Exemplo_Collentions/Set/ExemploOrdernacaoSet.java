package Exemplo_Collentions.Set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdernacaoSet {


public static void main(String[] args) {

    System.out.println("--\tOrdem aleatório\t--");
    Set<Serie> minhasSeries = new HashSet<>(){{
        add(new Serie("got","fantasia",60));
        add(new Serie("dark","drama",60));
        add(new Serie("that '70s show","comédia",25));
    }};

    for (Serie serie: minhasSeries){
      System.out.println(serie.getNome() + " - " + serie.getGenero()+ " - " + serie.getTempoEpsodio());
    }  
    
    System.out.println("--\tOrdem inserção\t--");
    Set<Serie> minhasSeries1 = new HashSet<>(){{
        add(new Serie("got","fantasia",60));
        add(new Serie("dark","drama",60));
        add(new Serie("that '70s show","comédia",25));
    }}; 

    for (Serie serie: minhasSeries1){
        System.out.println(serie.getNome() + " - " + serie.getGenero()+ " - " + serie.getTempoEpsodio());
      }  

      System.out.println("--\tOrdem natural(TrmpoEmpsodio)\t--");
      Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
       for (Serie serie: minhasSeries2){
        System.out.println(serie.getNome() + " - " + serie.getGenero()+ " - " + serie.getTempoEpsodio());
      } 
      
      System.out.println("--\tOrdem Nome/Genero/TempoEpsodio\t--"); 
      Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpsodio());
      minhasSeries3.addAll(minhasSeries);
      for (Serie serie: minhasSeries3){
       System.out.println(serie.getNome() + " - " + serie.getGenero()+ " - " + serie.getTempoEpsodio());
     } 

    // System.out.println("--\tOrdem Gênero\t--"); 

    // System.out.println("--\tOrdem Tempo Epsodio\t--"); 
    
   }
    
}

class ComparatorNomeGeneroTempoEpsodio implements Comparator<Serie>{

    @Override
    public int compare(Serie s1,Serie s2) {        
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome!=0) return nome;
      
        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero!=0) return genero;
      
        return  Integer.compare(s1.getTempoEpsodio(),s2.getTempoEpsodio());
    }


}
