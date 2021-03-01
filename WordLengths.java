import java.util.HashMap;

public class WordCounter {
    private HashMap<Integer, Integer> frequencies = new HashMap<>();

    public WordCounter(String[] tokens) {
        wordLengthFreq(tokens);
    }

    public void wordLengthFreq(String[] tokens) {
        frequencies.clear();
        for (String token : tokens) {
            Integer tokenLength = token.length();
            Integer count = frequencies.get(tokenLength); //this returns null if the value doesn't exist!
            if (count == null) {
                frequencies.put(tokenLength, 1);
            }
            else {
                frequencies.put(tokenLength, count + 1);
            }
        }
    }
    public HashMap<Integer, Integer> getFreqDist() {
        return frequencies;
    }
    //Returns the frequency distribution as a HashMap.
    public int maxVal() {
        int max = 0;
        for (int i : frequencies.values()) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
    //Returns the highest value in the frequency distribution.
    public double[] map2array() {
        // Handle empty frequencies
        if (frequencies.size() == 0) {
            return new double[] {};
        }

        // Find the longest token with a non-zero frequency
        int maximumKey = -1;
        for (int i : frequencies.keySet()) {
            if (i > maximumKey) {
                maximumKey = i;
            }
        }

        double[] points = new double[maximumKey + 1];

        int maximumValue = maxVal();

        for (int i = 0; i < points.length; i++) {
            Integer frequency = frequencies.get(i);
            if (frequency == null) {
                points[i] = 0;
            }
            else {
                points[i] = ((double) frequency) / maximumValue * 100;
            }
        }
        return points;
    }
   // Convert the frequency distribution to a normalized array of doubles. Each (integer) key of the frequency distribution corresponds to an index into the array, and the value for that key corresponds to the element at the index. Convert the values into percentages (where the maximum value of the distribution is 100%).


    public static void main(String[] args) {
        Tokenizer tokenizer = new Tokenizer("http://www.inf.ed.ac.uk/teaching/courses/inf1/op/2020/labs/resources/melville-moby_dick.txt");
        String[] tokens = tokenizer.getTokens();

        WordCounter wordCounter = new WordCounter(tokens);
        System.out.println(wordCounter.getFreqDist());



        }
    }




