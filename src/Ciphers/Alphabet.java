package Ciphers;

public class Alphabet {

    // public static final String ALPHA_UP_WITH_SPACE = "ABCDEFGHIJKLMNOPRSTUWXYZ ";
    private final String charset;
    private final int length;

    public Alphabet(String alph) {
        charset = alph;
        length = alph.length();
    }

    public int indexOf(char c) {
        return charset.indexOf(c);
    }

    public char charAt(int i) {
        return charset.charAt(i);
    }

    boolean isTextValid(String text) {
        return text.matches("^[" + charset + "]*$");
    }
    

    int length() {
        return length;
    }

    public enum charset {
        ALPHA_UP_WITH_SPACE("ABCDEFGHIJKLMNOPRSTUWXYZ "),
        DIGITS("0123456789");
        private String chars;

        charset(String chars) {
            this.chars = chars;
        }

        public String getChars() {
            return chars;
        }
           
       
        
        }
    }


