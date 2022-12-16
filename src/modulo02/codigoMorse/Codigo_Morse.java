package modulo02.codigoMorse;

public abstract class Codigo_Morse {
    private static final String[] morse = {".-",
            "-...",
            "-.-.",
            "-..",
            ".",
            "..-.",
            "--.",
            "....",
            "..",
            ".---",
            "-.-",
            ".-..",
            "--",
            "-.",
            "---",
            ".--.",
            "--.-",
            ".-.",
            "...",
            "-",
            "..-",
            "...-",
            ".--",
            "-..-",
            "-.--",
            "--..",
            ".-----",
            "..---",
            "...--",
            "....-",
            ".....",
            "-....",
            "--...",
            "---..",
            "----.",
            "-----"};

    public static void alphaToMorse(String alpha) {
        int n = alpha.length();
        String[] morse = new String[n];
        for (int i = 0; i < n; i++) {
            if (Character.isUpperCase(alpha.charAt(i))) {
                morse[i] = getMorse()[alpha.charAt(i) - 65];
            } else if (Character.isLowerCase(alpha.charAt(i))) {
                morse[i] = getMorse()[alpha.charAt(i) - 97];
            } else if (Character.isWhitespace(alpha.charAt(i))){
                morse[i] = "/";
            } else {
                morse[i] = Character.toString(alpha.charAt(i));
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(morse[i] + " ");
        }
    }

    public void morseToalpha(String Morse){

    }

    public static String[] getMorse() {
        return morse;
    }
}
