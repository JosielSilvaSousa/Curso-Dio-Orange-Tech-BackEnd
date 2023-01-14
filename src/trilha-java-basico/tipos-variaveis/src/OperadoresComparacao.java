public class OperadoresComparacao {

   public static void main(String[] args){
    //Primeiro exemplo
    String nomeUm = "JOSIEL";
    String nomeDois = "JOSIEL";
    System.out.println(nomeUm==nomeDois);

   //Exemplo 2
    String nomeTres = "JOSIEL";
    //Aqui estamos trabalhando com uma string e um objeto
    String nomeQuatro = new String ("JOSIEL");
    System.out.println(nomeTres==nomeQuatro);

   //Exemplo 3
    String nomeCinco= "JOSIEL";
    String nomeSeis = "JOSIEL";
    System.out.println(nomeCinco.equals(nomeSeis));
   }

}
