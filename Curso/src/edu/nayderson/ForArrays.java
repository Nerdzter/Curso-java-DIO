package edu.nayderson;

public class ForArrays {
    public static void main(String[] args) {
        
        String funcionarios[] = {
            "Cleber",
            "Luiz",
            "Oswaldo", 
            "Pedro",
            "Nayderson",
        };


        for (int x=0; x<funcionarios.length; x++){
            System.out.println("O funcionario no índice " + x + " é " + funcionarios [x]);
        }
    }
}
