package Exemplo_Collentions;
/*
 * Dados as seguinttes informações sobre meus gatos, crie uma lista
 * e ordene esta lista exibindo (nome-idade e - cor)
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {
   
        List<Gato> meusGatos = new ArrayList<>(){{
        add(new Gato("Jon",18,"preto"));
        add(new Gato("Simba",6,"tigrado"));
        add(new Gato("Jon",12,"Amarelo"));
    }};
        System.out.println("--\tOrdem de Inserção\t---");
        System.out.println(meusGatos);

        System.out.println("--\tOrdem aleatoria\t---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tOrdem natural\t---");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tOrdem idade\t---");
        Collections.sort(meusGatos, new ComparatorIdade());
        //meusGatos.sort(new ComparatorIdade());Ambas as formas funcionan
        System.out.println(meusGatos);

        System.out.println("--\tOrdem cor\t---");
        //Collections.sort(meusGatos, new ComparatorCor());
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);
       
        System.out.println("--\tOrdem nome/cor/Idade\t---");
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
    }
    
}
 // Compara a Idade
class ComparatorIdade implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2){
       return  Integer.compare(g1.getIdade(), g2.getIdade());
    }
}
 // Compara a cor 
class ComparatorCor implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2){
       return  g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}
//Compara nome depois cor e depois idade
class ComparatorNomeCorIdade implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2){
    int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
    if (nome != 0) return nome;

    int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
    if (nome != 0) return cor;

       return Integer.compare(g1.getIdade(),g2.getIdade());
    }
}

