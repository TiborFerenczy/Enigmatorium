import Ciphers.Cipher;
public class Main {

    public static void main(String[] args) {

        String word = "ABCD";
        String word2;
        //cipher(word);
 
       Cipher c = new Cipher();
       word2=c.encrypt2(word);
       System.out.println(word);
       System.out.println(word2);
}
}