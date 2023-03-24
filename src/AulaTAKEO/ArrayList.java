package AulaTAKEO;

import java.util.Collections;

public class ArrayList {

    public static void main(String[] args) {

        java.util.ArrayList<Integer> urna = new java.util.ArrayList<Integer>();

        for (int i = 1; i <= 13; i++)
            urna.add(1);

        Collections.shuffle(urna);
        Collections.shuffle(urna);
        Collections.shuffle(urna);

        System.out.println("1° dia: ");
        for (int i = 0; i <= 3; i++)
            System.out.println(urna.get(i) + "\t");

        System.out.println("\n2° dia: ");
        for (int i = 4; i <= 7; i++)
            System.out.println(urna.get(i) + "\t");

        System.out.println("\n3° dia: ");
        for (int i = 8; i <= 12; i ++)
            System.out.println(urna.get(i) + "\t");

    }
}
