package modulo02.codigoMorse;

import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.Character.isUpperCase;
import static java.lang.Character.toUpperCase;
import static modulo02.codigoMorse.Codigo_Morse.alphaToMorse;

public class MainCodigoMorse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um texto: ");
        String texto = scan.nextLine();
        if (Character.isAlphabetic(texto.charAt(0))||Character.isDigit((texto.charAt(0)))) {
            System.out.println(Codigo_Morse.alphaToMorse(texto));
        } else {
            System.out.println(Codigo_Morse.morseToalpha(texto));
        }
    }
}
