package AulasALGORITMO;

import java.util.Scanner;

public class EXEwhile {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int contagem;


        System.out.println("Digite 2 números : ");
        int inicio = entrada.nextInt();
        int fim = entrada.nextInt();



        while (inicio <= fim) {

            if(inicio %2 == 0){
                System.out.println(inicio);

            }inicio++;

        }
        System.out.println("São " +  " até o ultimo número " + fim);



    }
}
