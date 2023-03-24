package ADO5;

import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int choice;

        do {
            System.out.println("------ MENU DO JOGO ------");
            System.out.println("1.: Instruções ");
            System.out.println("2.: Jogar ");
            System.out.println("3.: Créditos ");
            System.out.println("4.: Sair ");
            System.out.println("Escolha uma opção: ");
            choice = entrada.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("____ Instruções do JOGO ____");
                    break;

                case 2:
                    System.out.println("Jogar");
                    break;

                case 3:
                    System.out.println("---- Créditos ----");
                    break;

                case 4:
                    System.out.println("____ Saindo ____");
                    break;

                default:
                    System.out.println("Opção Inválida! ");
                    break;

            }
        } while(choice != 4);
    }
}
