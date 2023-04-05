package ADOalgoritmos;

import java.util.Scanner;

public class ADO3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a meta de aposentadoria desejada: R$ ");
        double meta = entrada.nextDouble();

        System.out.print("Informe o valor da contribuição mensal: R$ ");
        double contribuicao = entrada.nextDouble();

        System.out.print("Informe a taxa de juros anual (%): ");
        double taxa = entrada.nextDouble();

        double saldo = 0;
        int anos = 12;
        int mes = 1;

        while (saldo < meta) {
            saldo += contribuicao * mes;
            saldo *= 1 + taxa / 100;
            anos++;
        }

        System.out.printf("Levarão %d anos para alcançar a meta de aposentadoria de R$ %.2f.", anos, meta);
    }
}

