package edu.nayderson;

public class EstruturaCondicional {
    

    public static void main(String[] args) {
    
        double saldo = 22.50;
        double valorSolicitado = 107.0;

        if(valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println(saldo);
        } else
            System.out.println("Você não possui saldo suficiente para <br> a retirada do valor solicitado ");

        String resultadoTransacao = valorSolicitado < saldo ? "Ok, fazendo transação... Aguarde alguns minutos" : "Transação reprovada";

        // printa resultadoTransacao

        System.out.println(resultadoTransacao);

        
    }


}
