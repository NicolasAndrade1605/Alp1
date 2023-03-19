package ADO4;

import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)){
            String resposta;

            System.out.println("Qual é considerada a equipe mais vitoriosa do Futebol? ");

            System.out.println("A) Arsenal ");
            System.out.println("B) Barcelona ");
            System.out.println("C) Real Madrid ");
            System.out.println("D) Manchester City ");
            System.out.println("E) Manchester United ");
            System.out.println("-----------------------");
            System.out.println("digite sua resposta: ");
            resposta = entrada.nextLine();


            switch (resposta){
                case "C": System.out.println("Resposta Correta! ");
                break;
                case "c": System.out.println("Resposta Correta! ");
                break;

                    default: System.out.println("Resposta Incorreta! ");

            }
        }
    }

}
