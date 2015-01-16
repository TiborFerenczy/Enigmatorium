
import Ciphers.Alphabet;
import Ciphers.Cipher;
import Ciphers.CipherCaesar;
import Ciphers.*;

public class Main {

    public static void main(String[] args) {




        Alphabet alfabet = new Alphabet(Alphabet.charset.ALPHA_UP_WITH_SPACE.getChars());
        Cipher cipher = new CipherCaesar(alfabet);
        String word = "ABCD";
        String word2;


        System.out.println(word);
        word2 = cipher.encrypt(word);
        System.out.println(word2);
        word2 = cipher.decrypt(word);
        System.out.println(word2);
        
    }
}