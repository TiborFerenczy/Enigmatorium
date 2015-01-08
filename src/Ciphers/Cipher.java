package Ciphers;

public class Cipher {

    private String alfabet = "ABCDEFGHIJKLMNOPRSTUVWXYZ ";

    public Cipher(int offset) {
        this.offset = offset;
    }

    public Cipher() {
    }
    private int offset = 1;

    public int getOffset() {
        return offset;
    }
    
    //enum enumeracje

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public String encrypt1(String word) {
        if (word.matches("^[A-Z a-z]*$")) // sprawdzanie poprawnosci zgodnosci z alfabetem
        {

            StringBuilder sb = new StringBuilder();
            char[] tab2;
            for (int i = 0; i < word.length(); i++) {
                sb.append((char) ((((word.charAt(i)) + offset) - 'A') % 26 + 'A'));

            }

            word = sb.toString();
            return word;
        } else {
            throw new IllegalArgumentException("Znaki spoza zakresu");
        }
    }

    public String encrypt2(String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            sb.append(((alfabet.charAt(((alfabet.indexOf(word.charAt(i))))+offset))));

        }

        return sb.toString();
    }
}
