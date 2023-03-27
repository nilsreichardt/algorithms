import java.util.stream.Collectors;

public class CaesarCipher {
    public static String encrypt(String text) {
        return encrypt(text, 3);
    }

    public static String encrypt(String text, int shift) {
        return text.codePoints()
                .map(c -> c + shift)
                .mapToObj(c -> Character.toString((char) c))
                .collect(Collectors.joining());
    }

    public static String decrypt(String text) {
        return decrypt(text, 3);
    }

    public static String decrypt(String text, int shift) {
        return encrypt(text, -shift);
    }

    public static void main(String[] args) {
       String text = encrypt("Hallo!");
        System.out.println(text);
    }
}