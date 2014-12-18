
public class Main {

    public static void main(String[] args) {

        int offset = 1;
        String word = "ABCXYZ";
        String word2;
        if (word.matches("^[A-Z a-z]*$")) // sprawdzanie poprawnosci zgodnosci z alfabetem
        {

            StringBuilder sb = new StringBuilder();
            char[] tab2;
            for (int i = 0; i < word.length(); i++) {
                sb.append((char) ((word.charAt(i)) + offset));
                
            }
            word2 = sb.toString();
            System.out.println(word2);
            System.out.println(word);
        } else {
            throw new IllegalArgumentException("Znaki spoza zakresu");
        }
    }
}
