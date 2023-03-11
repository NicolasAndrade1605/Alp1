package ADO3;

import java.util.Scanner;

public class Exe1 {

    public static void main(String[] args) {
        Scanner entradaDado = new Scanner(System.in);
        double valorProduto;

        System.out.println("Insira o valor do produto: ");
        valorProduto = entradaDado.nextDouble();

        double desconto;
        double valorComDesconto;

        if(valorProduto>= 300){
            desconto = valorProduto * 0.20;
            valorComDesconto = valorProduto - desconto;

            System.out.println("Valor do desconto: " + desconto);
            System.out.println("Valor final com desconto: " + valorComDesconto);
        } else {
            desconto = valorProduto * 0.15;
            valorComDesconto = valorProduto - desconto;
            System.out.println("Valor do desconto: " + desconto);
            System.out.println("Valor final com desconto: " + valorComDesconto);

        }



    }
}
