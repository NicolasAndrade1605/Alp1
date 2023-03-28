package AulasALGORITMO;

import java.util.Scanner;

public class EXE2While {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)){
            int numero, soma = 0;

            do {
                System.out.println("Digite um número ");
                numero = entrada.nextInt();
                soma += numero;

            }while (numero != 0);
            System.out.println("A soma dos números digitados é: " + soma);

        }

    }
}
