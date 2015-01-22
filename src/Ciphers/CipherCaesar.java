package Ciphers;

public class CipherCaesar extends Cipher {

    public CipherCaesar(Alphabet a) {
        super(a);
    }

    @Override
    public String encrypt(String word) {
        return doJob(word, new CharProc<Integer>() {

            @Override
            public char process(char ch, Integer key, Alphabet alfabet) {
                int idx = alfabet.indexOf(ch);
                idx = (idx + key) % alfabet.length();
                if (idx < 0) {
                    idx = idx + alfabet.length();
                }

                return alfabet.charAt(idx);

            }
        });
    }

    @Override
    public String decrypt(String word) {
        return doJob(word, new CharProc<Integer>() {

            @Override
            public char process(char ch, Integer key, Alphabet alfabet) {
                int idx = alfabet.indexOf(ch);

                idx = (idx - key) % alfabet.length();
                if (idx < 0) {
                    idx = idx + alfabet.length();
                }



                return alfabet.charAt(idx);

            }
        });
    }
}


//w jaki sposob 
