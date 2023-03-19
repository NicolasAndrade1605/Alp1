package ADO2;

import java.util.Scanner;

public class Exe3 {

    public static void main(String[] args) {

        Scanner entradaDado = new Scanner(System.in);
        int num;



        System.out.println("Digite um número entre 1 e 10: ");
        num = entradaDado.nextInt();

        int cont = 11;
        for (int i = 1; i < cont; i++){

            int tabuada = num * i;
            System.out.println(num + " x " + i + " = " + tabuada);

        }

    }

}
