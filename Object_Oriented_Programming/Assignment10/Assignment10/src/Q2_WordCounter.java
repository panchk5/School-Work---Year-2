/* Assignment 10 (100 marks in total; 5% of the final score of this course)
 *
 * Question 2 (50 marks in total)
    Use the Q1_TreeMapByBST to implement a WordCounter to count words in documents.
    You cannot use JCF provided map.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Q2_WordCounter {
    // use the m_treemap as the data structure for word counting
    Q1_TreeMapByBST m_treemap = new Q1_TreeMapByBST();

    // Question 2.1 (15 marks) implement buildTreeMap() to build a treemap that stores
    // the words and word frequencies of a document into m_treemap.
    // "filename" is the path to the file. Please use the "JingleBell.txt" under folder "data".
    // You can ONLY modify the body of this method including the return statement.
    public void buildTreeMap(String filename){
        try {
            FileReader reader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Split the line into words
                String[] words = line.split("\\s+");
                // Process each word
                for (String word : words) {
                    // Remove punctuation and convert to lowercase for simplicity
                    word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

                    // Check if the word is already in the TreeMap
                    if (m_treemap.get(word) == -1) {
                        // If it's not in the TreeMap, add it with a count of 1
                        m_treemap.put(word, 1);
                    } else {
                        // If it's already in the TreeMap, increment the count
                        int currentCount = m_treemap.get(word);
                        m_treemap.put(word, currentCount + 1);
                    }
                }
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    // Question 2.2 (15 marks) print all the counted words in the document in alphabetical order.
    // You can ONLY modify the body of this method including the return statement.
    public void printWordsAlphabetical(){
        ArrayList<String> alphabet = m_treemap.getKeysInAlphabeticalOrder();
        System.out.println("ArrayList elements: " + Arrays.toString(alphabet.toArray()));
    }

    // Question 2.3 (15 marks) write an output file named "Output.txt" under folder "data"
    // The output of will consist of two lists.
    // Each list contains all the words from the file, along with the number of times
    // that the word occurred.
    // One list is sorted alphabetically.
    // The other list is sorted according to the number of occurrences, with the most
    // common words (i.e., a word with a larger frequency or count is said to be more common)
    // at the top and the least common at the bottom.
    // IMPORTANT: the output format is given in the file "Output_Example.txt" under folder "data".
    // Input parameter "filename" is the path to the output file.
    public void outputResult(String filename) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            int total = m_treemap.size();
            writer.write(total + " words were found in file\n\n");

            ArrayList<String> alphabet = m_treemap.getKeysInAlphabeticalOrder();
            writer.write("List of words in alphabetical order (with counts in parentheses):\n\n");

            for (String word : alphabet) {
                writer.write("   " + word.trim() + " (" + m_treemap.get(word) + ")\n");
            }

            writer.write("\n");
            writer.write("List of words by frequency of occurrence:\n\n");
            ArrayList<String> frequencyOrder = sortKeysByFrequency(alphabet);

            for (String word : frequencyOrder) {
                writer.write("   " + word.trim() + " (" + m_treemap.get(word) + ")\n");
            }

            writer.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    private ArrayList<String> sortKeysByFrequency(ArrayList<String> keys) {

        ArrayList<List<Object>> frequencyMap = new ArrayList<>();

        for (String word : keys) {
            List<Object> pair = new ArrayList<>();
            pair.add(word);
            pair.add(m_treemap.get(word));
            frequencyMap.add(pair);
        }
        bubbleSort(frequencyMap);

        ArrayList<String> sortkeys= new ArrayList<>();
        for (List<Object> pair : frequencyMap) {
            sortkeys.add((String) pair.get(0));
        }
        return sortkeys;
    }

    private static void bubbleSort(ArrayList<List<Object>> list) {
        int n = list.size();
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                int freq1 = (int) list.get(j).get(1);
                int freq2 = (int) list.get(j + 1).get(1);


                if (freq1 < freq2) {
                    List<Object> temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                    swapped = true;
                }
            }


            if (!swapped) {
                break;
            }
        }
    }

    // Question 2.4 (5 marks) call each of the above methods in the main() method to
    // successfully count the words and produce expected outputs.
    public static void main(String[] args){
        Q2_WordCounter tree = new Q2_WordCounter();
        tree.buildTreeMap("Assignment10/src/data/JingleBell.txt");
        tree.printWordsAlphabetical();
        tree.outputResult("Assignment10/src/data/Output.txt");
    }

}
