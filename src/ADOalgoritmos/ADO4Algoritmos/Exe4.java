package ADOalgoritmos.ADO4Algoritmos;

public class Exe4 {
    public static void main(String[] args) {
        System.out.println(funcaoMatematica(6));

    }
    static double funcaoMatematica(double x){
        if (x < - 1){
            return x+2;

        } else if (-1 < x && x < 2) {
            return x*x-4;

        }else {
            return x*2 -1;
        }
    }
}
