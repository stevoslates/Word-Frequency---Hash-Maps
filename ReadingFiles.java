import java.util.*;

public class ReadingFiles {
    public static void main(String[] args) {

        Hashtable<String, Integer> words = new Hashtable<>();
        In file = new In("example.txt");
        while (!file.isEmpty()) {

            String word = file.readString().toLowerCase();
           // word = removePunctuations(word);
            word = word.replaceAll("\\W+", "");
            int count;
            if (words.containsKey(word)) {
                count = words.get(word);
                words.put(word,count + 1);
            } else {
                count = 1;
                words.put(word,count);
            }

        }
        Map<String, Integer> sortedWords = sortByValue(words);

        //System.out.println(words);
        for (Map.Entry<String, Integer> e : sortedWords.entrySet()) {
            System.out.println(e.getKey()
                    + " = " + e.getValue());
        }
    }

    public static HashMap<String, Integer> sortByValue(Hashtable<String, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer>> list =
                new LinkedList<>(hm.entrySet());

        // Sort the list
        list.sort(Map.Entry.comparingByValue());

        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
}
