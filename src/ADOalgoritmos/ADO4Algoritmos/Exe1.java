package ADOalgoritmos.ADO4Algoritmos;

public class Exe1 {
    public static void main(String[] args) {
        System.out.println(ExemploVariavelLocal(4));

    }
    static String ExemploVariavelLocal(double nota){
        if (nota >= 6){
            return "Aprovado";

        }else {
            return "Reprovado";
        }
    }
}
