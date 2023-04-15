package codigomorse;

public class Morse {

    private static final String[] MORSE_CODES = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----."};

    private static final char[] LETTERS = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public static String decodificadorMorse(String cadenaMorse) {
        StringBuilder sb = new StringBuilder();
        String[] palabras = cadenaMorse.trim().split("   ");
        for (String palabra : palabras) {
            String[] letras = palabra.trim().split(" ");
            for (String letra : letras) {
                for (int i = 0; i < MORSE_CODES.length; i++) {
                    if (letra.equals(MORSE_CODES[i])) {
                        sb.append(LETTERS[i]);
                        System.out.println(letra);
                        break;
                    }
                }
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }



    public static char getLetra(String letraMorse) {
        for (int i = 0; i < MORSE_CODES.length; i++) {
            if (letraMorse.equals(MORSE_CODES[i])) {
                return LETTERS[i];
            }
        }
        return '\0';
    }

}

