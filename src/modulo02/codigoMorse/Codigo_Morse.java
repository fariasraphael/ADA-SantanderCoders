package modulo02.codigoMorse;

public abstract class Codigo_Morse {
    private static final String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "-----", ".-----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----."};

    public static String alphaToMorse(String alpha) {
        int n = alpha.length();
        String morse = "";
        for (int i = 0; i < n; i++) {
            //verifica se o caracter passado esta em letra maiúscula
            if (Character.isUpperCase(alpha.charAt(i))) {
                morse += getMorse()[alpha.charAt(i) - 65];

            //verifica se o caracter passado esta em letra minúscula
            } else if (Character.isLowerCase(alpha.charAt(i))) {
                morse += getMorse()[alpha.charAt(i) - 97];

            //verifica o final de uma palavra
            } else if (Character.isWhitespace(alpha.charAt(i))) {
                morse += "/";

            //verifica se o caracter é um digito
            } else if (Character.isDigit(alpha.charAt(i))) {
                morse += getMorse()[alpha.charAt(i) - 22];
            }
            morse += " ";
        }
        return morse;
    }

    public static String morseToalpha(String morse) {
        int n = getMorse().length;
        String texto = "";
        char c;
        for (int i = 0, s = 0; i < n; i++) {
            if (morse.charAt(i) == ' ' || morse.charAt(i) == '/') {
                for (int j = 0; j < n; j++) {
                    if (j < 26 && morse.substring(s, i).equals(getMorse()[j])) {
                        texto += (char) (j + 65);
                        s = i;
                    } else if (morse.substring(s, i).equals(getMorse()[j])) {
                        texto += (char) (j + 22);
                    }
                }
                if (morse.charAt(i) == '/') {
                    texto += " ";
                }
                s = i + 1;
            } else if (i == n - 1) {
                for (int j = 0; j < n; j++) {
                    if (j < 26 && morse.substring(s, i + 1).equals(getMorse()[j])) {
                        texto += (char) (j + 65);
                        s = i + 1;

                    } else if (morse.substring(s, i + 1).equals(getMorse()[j])) {
                        texto += (char) (j + 22);
                    }
                }
            }
        }
        return texto;
    }
    public static String[] getMorse () {
        return morse;
    }
}
