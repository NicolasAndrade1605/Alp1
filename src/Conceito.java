import java.util.Scanner;

public class Conceito {
    public static void main(String[] args) {

        Scanner entrada1 = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        Scanner entrada3 = new Scanner(System.in);

        int media1;
        int media2;
        int media3;
        char conceito;

        System.out.println("Insira as notas: ");
        media1 = entrada1.nextInt();
        media2 = entrada2.nextInt();
        media3 = entrada3.nextInt();

        double media = (media1 + media2 + media3)/3;
        System.out.println("a nota é : " + media);

        if (media >= 9){
            conceito = 'a';

        }else if (media >= 8 && media < 8.9){
            conceito = 'b';

        } else if (media >= 7 && media < 7.9) {
            conceito = 'c';

        } else if (media >= 6 && media < 6.9) {
            conceito = 'd';

        } else
            conceito = 'e';


        switch (conceito) {
            case 'a':
                System.out.println("Conceito A");
                break;

            case 'b':
                System.out.println("Conceito B");
                break;

            case 'c':
                System.out.println("Conceito C");
                break;

            case 'd':
                System.out.println("Conceito D");
                break;

            case 'e':
                System.out.println("Conceito E");
                break;
            default:
                System.out.println("O valor de média é maior que 10");

        }

    }
}

