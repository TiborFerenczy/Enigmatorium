package Ciphers;

public class CipherSubstitution extends Cipher {

    public CipherSubstitution(Alphabet a) {
        super(a);
    }

    @Override
    public String encrypt(String word) {
        return doJob(word, new CharProc<String>() {

            @Override
            public char process(char ch, String key, Alphabet alfabet) {
                int idx = alfabet.indexOf(ch);
                int idx2 = key.indexOf(idx);
                idx = (idx + idx2) % alfabet.length();
                if (idx < 0) {
                    idx = idx + alfabet.length();
                }

                return alfabet.charAt(idx);

            }
        });
    }

    @Override
    public String decrypt(String word) {
        return doJob(word, new CharProc<String>() {

            @Override
            public char process(char ch, String key, Alphabet alfabet) {
               int idx = alfabet.indexOf(ch);
                int idx2 = key.indexOf(idx);
                idx = (idx + idx2) % alfabet.length();
                if (idx < 0) {
                    idx = idx - alfabet.length();
                }

                return alfabet.charAt(idx);

            }
        });
}
}

