package edu.nayderson;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        try {
            System.out.print("Insira sua idade para continuar: ");
            int idade = scanner.nextInt();
            System.out.println("Sucesso! Agora sei que você tem " + idade + " anos.");

        } catch (Exception e) {

            // TODO: AQUI VEM TUDO QUE FOR DA ERRO

            System.out.println("Por favor, o campo 'IDADE' tem que estar em número.");
        
        }
    }
}
