package AulasALGORITMO;

import java.util.Scanner;

public class EXE3While {
    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        int num;

        System.out.println("Digite um número entre 1 e 10: ");
        num = numero.nextInt();

        int cont = 11;
        for (int i = 1; i < cont; i++){

            int tabuada = num *i;
            System.out.println(num + " x " + i + " = " + tabuada);
        }
    }
}
