package Metodos;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        System.out.println("Exercicio calculadora");

        Calculadora.soma(1,5);
        Calculadora.divisao(1,5);
        Calculadora.multiplicacao(1,5);
        Calculadora.subtracao(1,5);


        System.out.println("Exercicio Mensagem");

        Mensagem.obterMensagem(10);
        Mensagem.obterMensagem(01);
        Mensagem.obterMensagem(14);

        System.out.println("Exercicio Emprestimo");
        
        Emprestimo.calcular(10.0,3);
        Emprestimo.calcular(1000,2);
        Emprestimo.calcular(1000,3);
    }
    
}
