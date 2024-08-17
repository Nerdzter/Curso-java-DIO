package edu.nayderson;

public class WhileExemplo {
    
    public static void main(String[] args) {
        
        int idade = 18;
        int dinheiro = 1000;

        while (dinheiro < idade * 2) {
            if (dinheiro < 2000) {
                System.out.println("Talvez na próxima vida eu seja rico...");
                dinheiro += 500; // Incrementando o dinheiro para evitar loop infinito
            } else {
                System.out.println("Pq eu sou ricaaaa");
                break; // Saindo do loop quando a condição é atendida
            }
        }
    }
}
