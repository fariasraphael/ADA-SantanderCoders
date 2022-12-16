package modulo02.codigoMorse;

import java.util.Scanner;

import static java.lang.Character.isUpperCase;
import static java.lang.Character.toUpperCase;
import static modulo02.codigoMorse.Codigo_Morse.alphaToMorse;

public class MainCodigoMorse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um texto: ");
        String texto = scan.nextLine();
        //scan.next();
        Codigo_Morse.alphaToMorse(texto);





//        System.out.println(Character.isUpperCase(alpha.charAt(3)));
//        System.out.println(alpha.charAt(4)-65);
//        System.out.println();
    }
}
