import Ciphers.*;

public class Main {

    public static void main(String[] args) {




        Alphabet alfabet = new Alphabet(Alphabet.charset.ALPHA_UP_WITH_SPACE.getChars());
        Cipher cipher = new CipherCaesar(alfabet);        
        cipher.setOffset(1);
       
        
        String word = "ABCD";
        String word2;
        System.out.println(word);
        word2 = cipher.encrypt(word);
        System.out.println(word2);
        word2 = cipher.decrypt(word);
        System.out.println(word2);
        System.out.println();
        
                
        Alphabet alfabet2 = new Alphabet(Alphabet.charset.DIGITS.getChars());
        Cipher cipher2= new CipherSubstitution(alfabet2);
        cipher2.setOffset("5903142867");
        word = "903";
        word2=cipher2.encrypt(word2);
        System.out.println(word);
        System.out.println(word2);
        
        
        
    }
}