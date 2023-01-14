public class CondicaoTernaria {
    public static void main(String[] args){
        int a,b;
        a = 6;
        b = 6;
        String resultado = "";//Primeiro exemplo;

        if (a==b)
        resultado = "Verdadeiro";
        else
        resultado = "Falso";

        System.out.println(resultado);

        //Segundo exemplo.
        String resultado2 = a==b ?"Verdadeiro": "Falso";
        System.out.println(resultado2);


    }
    
}
