/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/*
 * @task: A program that uses an iterator interface to loop through a list and perform specific actions
 * @author: Charles
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {

        // Create a list of words
        List<String> words = new ArrayList<>();
        words.add("javascript");
        words.add("react");
        words.add("CSS");
        words.add("Java");
        words.add("HTML");
        words.add("programming");

        System.out.println("Original List: " + words);

        // Use an iterator to remove specific words
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            if (word.equalsIgnoreCase("HTML") || word.equalsIgnoreCase("react")) {
                iterator.remove(); // Remove the word
            }
        }

        System.out.println("New List: " + words);
    }
}
