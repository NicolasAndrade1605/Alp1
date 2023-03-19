package ADO4;

import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
    try (Scanner DiaDaSemana = new Scanner(System.in)){
        int dia;

        System.out.println("Escreva um numero de 1 a 7: ");
        dia = DiaDaSemana.nextInt();

        switch (dia) {
            case 1 -> System.out.println("Hoje é Domingo");
            case 2 -> System.out.println("Hoje é Segunda");
            case 3 -> System.out.println("Hoje é Terça - feira");
            case 4 -> System.out.println("Hoje é Quarta - feira");
            case 5 -> System.out.println("Hoje é Quinta - feira");
            case 6 -> System.out.println("Hoje é Sexta - feira");
            case 7 -> System.out.println("Hoje é Sábado - feira");
            case 0 -> System.out.println("Valor invalido! , não tem dia 0");

        }
    }
}
}

