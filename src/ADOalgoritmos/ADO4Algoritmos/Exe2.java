package ADOalgoritmos.ADO4Algoritmos;

public class Exe2 {
    public static void main(String[] args) {
        System.out.println(encontrar_numero(50,60));

    }
    static int encontrar_numero(int a, int b){
        if (a > b){
            return a;

        }else {
            return b;
        }
    }
}
