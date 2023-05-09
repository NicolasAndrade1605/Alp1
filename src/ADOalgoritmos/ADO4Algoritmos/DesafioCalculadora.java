package ADOalgoritmos.ADO4Algoritmos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {

        menu();
    }

    public static double somar (double num1 , double num2) {
        return num1 + num2;
    }

    public static double subtracao(double num1 , double num2) {
        return num1 - num2;
    }
    public static double divisao(double num1 , double num2) {
        return num1/num2;
    }

    public static double multiplicacao(double num1 , double num2) {
        return num1 * num2;

    }
    public static void menu() {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Qual operação voce quer fazer?\n"
                + "somar (1) \n"
                + "subtracao (2)\n"
                + "divisao (3)\n"
                + "multiplicacao (4)");

        int opcao = Sc.nextInt();
        System.out.println("informe 2 numeros ");

        double num1 = Sc.nextDouble();
        double num2 = Sc.nextDouble();

        switch (opcao) {

            case 1:
                System.out.println(somar(num1, num2));
                break;

            case 2:
                System.out.println(subtracao(num1, num2));
                break;

            case 3:
                System.out.println(multiplicacao(num1, num2));
                break;

            case 4:
                System.out.println(subtracao(num1, num2));
                break;

            default:
                System.out.println("Opção invalida");
        }
    }