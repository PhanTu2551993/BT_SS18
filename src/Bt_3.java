
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
    public class Bt_3 {

        public static List<String> findLongestWords(String filePath) {
            List<String> longestWords = new ArrayList<>();
            int maxLength = 0;
            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] words = line.split("\\s+");
                    for (String word : words) {
                        int length = word.length();
                        if (length > maxLength) {
                            longestWords.clear();
                            longestWords.add(word);
                            maxLength = length;
                        } else if (length == maxLength) {
                            longestWords.add(word);
                        }
                    }
                }
            } catch (IOException e) {
                System.err.println("Error reading the file: " + e.getMessage());
            }

            return longestWords;
        }

        public static void main(String[] args) {
            String filePath = "sample.txt"; // Đường dẫn của file văn bản

            List<String> longestWords = findLongestWords(filePath);

            System.out.println("Longest words in the file:");
            for (String word : longestWords) {
                System.out.println("Word: " + word + ", Length: " + word.length());
            }
        }
    }


