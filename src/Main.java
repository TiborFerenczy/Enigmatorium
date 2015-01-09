
import Ciphers.Alphabet;
import Ciphers.Cipher;

public class Main {

    public static void main(String[] args) {




        Alphabet alfabet = new Alphabet(Alphabet.Alphabets.ALPHA_UP_WITH_SPACE);
        Cipher cipher = new Cipher(alfabet);
        String word = "ABCDZ ";


        System.out.println(word);
        word = cipher.encrypt(word);
        System.out.println(word);
    }
}