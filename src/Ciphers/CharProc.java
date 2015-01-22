package Ciphers;

public interface CharProc<T> {
//interfejs

    public char process(char c, T key, Alphabet alfabet);
}
