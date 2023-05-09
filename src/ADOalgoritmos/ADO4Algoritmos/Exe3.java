package ADOalgoritmos.ADO4Algoritmos;

public class Exe3 {
    public static void main(String[] args) {
        System.out.println(VerificarNumero(4));

    }
    static String VerificarNumero(int num){
        if (num %2 == 0){
            return "Número é par";

        }else {
            return "Número é impar";
        }
    }
}
