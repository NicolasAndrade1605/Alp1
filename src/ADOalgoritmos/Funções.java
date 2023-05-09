package ADOalgoritmos;

import java.util.Scanner;

public class Funções {
    import java.util.Scanner;

    public class CalculeMediaSalarial {

        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite a quantidade de funcionários: ");
            int qtdFuncionarios = entrada.nextInt();

            double somaSalarios = 0.0;

            for (int i = 1; i <= qtdFuncionarios; i++) {
                System.out.print("Digite o salário do funcionário " + i + ": ");
                double salario = entrada.nextDouble();
                somaSalarios += salario;
            }

            double mediaSalarial = somaSalarios / qtdFuncionarios;

            System.out.println("A média salarial da empresa é: " + mediaSalarial);

            entrada.close();

        }

    }

}
