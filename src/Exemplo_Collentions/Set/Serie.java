package Exemplo_Collentions.Set;

import java.util.Objects;

class Serie implements Comparable <Serie>{
    private static Object tempoEpsodigo;
    private static String nome;
    private static String genero;
    private Integer tempoEpsodio;

    public Serie (String nome,String genero, Integer tempoEpsodigo){
        this.nome = nome;
        this.genero = genero;
        this.tempoEpsodio = tempoEpsodigo;

    }

    public String getNome(){
        return nome;
    }
    public String getGenero(){
        return genero;
    }

    public Integer getTempoEpsodio(){
        return  tempoEpsodio;
    }

    @Override
    public String toString() {
        return "{"+
               "nome='" + nome+'\''+
               ",genero='" + genero+'\''+
               ",tempoEpsodio='" + tempoEpsodio +
               '}';
    }

    @Override
    public boolean equals(Object o) { 
        if (this ==o) return true;
        if(o==null || getClass() !=o.getClass()) return false;
        Serie serie = (Serie) o;       
        return nome.equals(Serie.nome)&& genero.equals(Serie.genero) && tempoEpsodio.equals(Serie.tempoEpsodigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome,genero,tempoEpsodio);
    }

    @Override
    public int compareTo(Serie serie) {
      int tempoEpsodio = Integer.compare(this.getTempoEpsodio(),serie.getTempoEpsodio());
      if(tempoEpsodio!=0) return tempoEpsodio;
      return this.getGenero().compareTo(serie.getGenero());

    }

}