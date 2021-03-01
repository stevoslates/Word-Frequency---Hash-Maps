import java.util.*;
public class Tokenizer {

    private String[] tokens = {};

    public Tokenizer() {
        //Nada
    }
    public Tokenizer(String fname) {
        tokensFromFile(fname);
    }
    public void tokensFromFile(String fname) {
        In file = new In(fname);
        String words = file.readAll();
        tokenize(words);
    }

    public void tokenize(String str) {
        tokens = str.split("\\W+");
    }

    public String[] getTokens() {
        return tokens;
    }

    public int getNumberTokens() {
     return tokens.length;
    }

}
