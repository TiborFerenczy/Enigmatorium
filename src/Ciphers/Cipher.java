package Ciphers;

public abstract class Cipher {

    protected Alphabet alfabet;
    protected int key = 1;

    public Cipher(Alphabet a) {
        alfabet = a;

    }

    public Cipher(int key) {
        this.key = key;
    }

    public Cipher() {
    }

    public int getOffset() {
        return key;
    }

    //enum enumeracje
    public void setOffset(int offset) {
        this.key = offset;
    }
//
//    public String encrypt1(String word) {
//        if (word.matches("^[A-Z a-z]*$")) // sprawdzanie poprawnosci zgodnosci z alfabetem
//        {
//
//            StringBuilder sb = new StringBuilder();
//            char[] tab2;
//            for (int i = 0; i < word.length(); i++) {
//                sb.append((char) ((((word.charAt(i)) + offset) - 'A') % 26 + 'A'));
//
//            }
//
//            word = sb.toString();
//            return word;
//        } else {
//            throw new IllegalArgumentException("Znaki spoza zakresu");
//        }
//    }

    protected String doJob(String word, CharProc cp) {

        if (!alfabet.isTextValid(word)) {
            throw new IllegalArgumentException("Tekst zawiera znaki spoza alfabetu.");
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            ch = cp.process(ch, key, alfabet);

            sb.append((char)ch);

        }
        return sb.toString();

    }

    public abstract String encrypt(String word);

    public abstract String decrypt(String word);
}
