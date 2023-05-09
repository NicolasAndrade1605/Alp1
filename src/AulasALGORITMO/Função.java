package AulasALGORITMO;

import java.util.Scanner;

public class Função {
    public static int obterNumero(){
        System.out.println("____Obter um Número____");
        Scanner entrada = new Scanner(System.in);
        System.out.println();
        int n = entrada.nextInt();
        return n;
    }

    public static void imprimir(int menor){
        System.out.println("____Imprimir____");
        System.out.println("Menor: " + menor);

    }public static int obterMaiorNumero(){

    }

    public static void main(String[] args) {
        int n1 = obterNumero();
        int n2 = obterNumero();
        int menor = encontrarMenor(n1, n2);
        imprimir(menor);
    }

}
