package edu.nayderson;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        people();
    }

    public static void people() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.next();

        System.out.println("What is your age?");
        int age = scanner.nextInt();

        System.out.println("What is your gender? (M or F)");
        String gender = scanner.next().toUpperCase();  // Captura o gênero digitado pelo usuário e converte para maiúsculas

        System.out.println("Oh no! I'm so sorry... I'll give you more choices:");

        switch (gender) {
            case "M": {
                System.out.println("Ok. Your account has been created.");
                break;
            }
            case "F": {
                System.out.println("Ok. Your account has been created.");
                break;
            }
            case "A": {
                System.out.println("Ok, now write what is your gender.");
                gender = scanner.next();
                System.out.println("Your account has been created as " + gender + ".");
                break;
            }
            default: {
                System.out.println("Invalid option. Please enter M, F, or A.");
                gender = "Invalid";  // Sinaliza que o gênero foi inválido
                break;
            }
        }

        // Mensagens finais após a criação da conta, somente se o gênero for válido
        if (!gender.equals("Invalid")) {
            System.out.println("Oh, I'm so sorry for the inconvenience.");
            System.out.println("Welcome to this repository, " + name + ". I'm so happy to say that.");
            System.out.println("Ok, sorry, but I need to use one more variable: " + age);
        }

        scanner.close();  // Fechar o scanner após o uso
    }
}