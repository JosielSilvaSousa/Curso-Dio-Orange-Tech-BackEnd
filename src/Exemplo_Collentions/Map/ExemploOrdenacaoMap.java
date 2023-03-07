package Exemplo_Collentions.Map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class ExemploOrdenacaoMap {
    public static void main(String[] args) {
        System.out.println("--\tOrdem aleatoria\t--") ; 
        Map<String,Livro> meusLivros = new HashMap<>(){{
            put(" Hamking, Stephen", new Livro("Uma Breve Historia do tempo",256));
            put(" Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put(" Harari, Yuval noah", new Livro("21 lições para o século 21", 432));
        }} ;
       for(Map.Entry<String,Livro> livro : meusLivros.entrySet())
       System.out.println(livro.getKey() + "-" + livro.getValue().getNome());

       System.out.println("--\tOrdem Insersao\t--") ; 
       Map<String,Livro> meusLivros1 = new LinkedHashMap<>(){{
           put(" Hamking, Stephen", new Livro("Uma Breve Historia do tempo",256));
           put(" Duhigg, Charles", new Livro("O Poder do Hábito", 408));
           put(" Harari, Yuval noah", new Livro("21 lições para o século 21", 432));
       }} ;
      for(Map.Entry<String,Livro> livro : meusLivros1.entrySet())
      System.out.println(livro.getKey() + "-" + livro.getValue().getNome());

      System.out.println("--\tOrdem alfabetica dos autores\t--") ; 
      Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
      for(Map.Entry<String,Livro> livro : meusLivros2.entrySet())
      System.out.println(livro.getKey() + "-" + livro.getValue().getNome());

      System.out.println("--\tOrdem alfabetica nome dos livros\t--") ; 
      Set<Map.Entry<String,Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
      meusLivros3.addAll(meusLivros.entrySet());
      for(Map.Entry<String,Livro> livro : meusLivros3)
      System.out.println(livro.getKey() + "-" + livro.getValue().getNome());

      //System.out.println("--\tOrdem números de paginas\t--") ; 

    }
    


    
}
class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome,Integer paginas){
        this.nome = nome;
        this.paginas = paginas;
    }
    public String getNome(){
        return nome;
    }
    public Integer getPaginas(){
        return paginas;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Livro  livro = (Livro) obj;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
      
        return Objects.hash(nome,paginas);
    }
    @Override
    public String toString() {
        return "Livro{"+
               "nome" + nome + '\''+
               ",paginas= "+ paginas+
               "}";
    }
}
//Compara o nome dos livros.
class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{
    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String,Livro>l2){
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
} 
