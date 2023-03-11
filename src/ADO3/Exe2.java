package ADO3;

import java.util.Scanner;

public class Exe2 {

    public static void main(String[] args) {

        Scanner entrada1 = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        Scanner entrada3 = new Scanner(System.in);

        int x;
        int y;
        int z;

        System.out.println("digite 3 valores: ");
        x = entrada1.nextInt();
        y = entrada2.nextInt();
        z = entrada3.nextInt();

        if (x < y + z && y < x + z && z < x + y){

            System.out.println("Trata-se de um triangulo");

            if (x == y && x == z){
                System.out.println("Três lados iguais. Trata-se de um triangulo equilatero");

            }else if (x == y || x == z){
                System.out.println("Dois lados iguais. Trata-se de um triangulo isoceles");

            }else
                System.out.println("Três lados diferentes. Trata-se de um triangulo escaleno");

        }else {

            System.out.println("Os tres lados não formam um triangulo.");

        }

    }
}
