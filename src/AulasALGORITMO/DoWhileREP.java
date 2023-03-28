package AulasALGORITMO;

import java.util.Scanner;

public class DoWhileREP {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x = 1;

        System.out.println("Número: ");
        int n = input.nextInt();

        if(n <= 0){
            while (x <= n){
                System.out.println("x: " + x);
                x++;  //x=x+1;

            }
        }

    }

}
