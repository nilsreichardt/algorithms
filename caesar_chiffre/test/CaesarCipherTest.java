import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaesarCipherTest {

    @Test
    public void testEncryptWithDefaultShift() {
        String text = "hello";
        String encrypted = CaesarCipher.encrypt(text);
        assertEquals("khoor", encrypted);
    }

    @Test
    public void testEncryptWithCustomShift() {
        String text = "hello";
        String encrypted = CaesarCipher.encrypt(text, 5);
        assertEquals("mjqqt", encrypted);
    }

    @Test
    public void testEncryptWithNegativeShift() {
        String text = "hello";
        String encrypted = CaesarCipher.encrypt(text, -3);
        assertEquals("ebiil", encrypted);
    }

    @Test
    public void testDecryptWithDefaultShift() {
        String encrypted = "khoor";
        String decrypted = CaesarCipher.decrypt(encrypted);
        assertEquals("hello", decrypted);
    }

    @Test
    public void testDecryptWithCustomShift() {
        String encrypted = "mjqqt";
        String decrypted = CaesarCipher.decrypt(encrypted, 5);
        assertEquals("hello", decrypted);
    }

    @Test
    public void testDecryptWithNegativeShift() {
        String encrypted = "ebiil";
        String decrypted = CaesarCipher.decrypt(encrypted, -3);
        assertEquals("hello", decrypted);
    }

    @Test
    public void testWithSpecialCharacters() {
        // Unfortunately, emojis are not working.
        String text = """
                Hello, World! こんにちは, 世界! ¡Hola, mundo! Здравствуй, мир!
                1234567890
                !"#$%&'()*+,-./:;<=>?@[]^_`{|}~
                ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖØÙÚÛÜÝÞß
                àáâãäåæçèéêëìíîïðñòóôõöøùúûüýþÿ
                ĀāĂăĄąĆćĈĉĊċČčĎďĐđĒēĔĕĖėĘęĚěĜĝ
                ĞğĠġĢģĤĥĦħĨĩĪīĬĭĮįİıĲĳĴĵĶķĸĹĺ
                ĻļĽľĿŀŁłŃńŅņŇňŉŊŋŌōŎŏŐőŒœŔŕŖŗ
                ŘřŚśŜŝŞşŠšŢţŤťŦŧŨũŪūŬŭŮůŰűŲų
                ŴŵŶŷŸŹźŻżŽžƒǺǻǼǽǾǿΆΈΉΊΌ΍ΎΏ
                ΐάέήίΰαβγδεζηθικλμνξοπρςστυφχψω
                ЁЂЃЄЅІЇЈЉЊЋЌЍЎЏАБВГДЕЖЗИЙКЛ
                МНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдежзийкл
                мнопрстуфхцчшщъыьэюяѐёђѓєѕіїјљњћќ
                ѝўџҐґҒғҖҗҘҙҚқҜҝҞҟҠҡҢңҤҥҦҧҨҩ
                ҪҫҬҭҮүҰұҲҳҴҵҶҷҸҹҺһӀӁӂӃӄӅӆ
                ӇӈӉӊӋӌӍӎӏӐӑӒӓӔӕӖӗӘәӚӛӜӝӞ
                ӟӠӡӢӣӤӥӦӧӨө
                """;
        String encrypted = CaesarCipher.encrypt(text, 7);
        String decrypted = CaesarCipher.decrypt(encrypted, 7);
        assertEquals(text, decrypted);
    }

    @Test
    public void testEncryptDecryptWithEmptyString() {
        String text = "";
        String encrypted = CaesarCipher.encrypt(text);
        String decrypted = CaesarCipher.decrypt(encrypted);
        assertEquals(text, decrypted);
    }
}
