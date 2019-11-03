package Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString {
	public static void findDuplicateWords(String inputString) {
		// spilt:
		String[] words = inputString.split(" ");

		// create the hashmap:
		Map<String, Integer> wordCount = new HashMap<String, Integer>();

		// to check word in given array:
		for (String word : words) {

			// if word is present
			if (wordCount.containsKey(word)) {
				wordCount.put(word.toLowerCase(), wordCount.get(word) + 1);
			} else {
				wordCount.put(word, 1);
			}

		}

		// extracting all the keys of map--wordCount:
		Set<String> wordsInString = wordCount.keySet();

		// loop through all the words in wordCount
		for (String word : wordsInString) {
			if (wordCount.get(word) > 1) {
				System.out.println(word + " : " + wordCount.get(word));
			}
		}
	}

	public static void main(String[] args) {
		findDuplicateWords("hey java is the best language is java");
		findDuplicateWords("how are you are dumb you how dumb you");

	}

}
