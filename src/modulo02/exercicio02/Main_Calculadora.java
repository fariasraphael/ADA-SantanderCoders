package modulo02.exercicio02;

public class Main_Calculadora {
    public static void main(String[] args) {
        Calculadora calculadora1 = new Calculadora(10.0,5.0);

        calculadora1.somar();
        calculadora1.subtrair();
        calculadora1.multiplicar();
        calculadora1.dividir();

        Calculadora calculadora2 = new Calculadora(10.0,0.0);
        calculadora2.dividir();

    }
}
