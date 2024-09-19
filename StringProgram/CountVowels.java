package StringProgram;

public class CountVowels {

    public class CountWordsStartingWithVowel {

        // Function to count how many words start with a vowel
        static int countWordsStartingWithVowel(String str) {
            // Split the string into words based on spaces
            String[] words = str.split("\\s+");  // Handles multiple spaces
            
            int vowelStartCount = 0;  // To count words starting with vowels
            
            // Loop through all words
            for (String word : words) {
                if (word.length() > 0) {
                    // Get the first character of the word
                    char firstChar = word.toLowerCase().charAt(0);
                    
                    // Check if the first character is a vowel
                    if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u') {
                        vowelStartCount++;
                    }
                }
            }
            
            return vowelStartCount;  // Return the number of words starting with a vowel
        }
    
        public static void main(String[] args) {
            String testStr1 = "apple orange banana elephant";
            String testStr2 = "Umbrella is over the table";
            String testStr3 = "There are no vowels here";
            String testStr4 = "   an  owl observed ";
            String testStr5 = "ice cream is awesome";
            
            System.out.println("Count (testStr1): " + countWordsStartingWithVowel(testStr1));  // Output: 3
            System.out.println("Count (testStr2): " + countWordsStartingWithVowel(testStr2));  // Output: 3
            System.out.println("Count (testStr3): " + countWordsStartingWithVowel(testStr3));  // Output: 0
            System.out.println("Count (testStr4): " + countWordsStartingWithVowel(testStr4));  // Output: 2
            System.out.println("Count (testStr5): " + countWordsStartingWithVowel(testStr5));  // Output: 3
        }
    }
    
    
}
