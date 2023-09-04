import java.util.HashMap;

public class Main {
    public static String minWindow(String s, String reqChars) {
        // Create a hash map to store the required characters and their frequency
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char c : reqChars.toCharArray()) {
            hashMap.put(c, 1);
        }

        // Initialize variables for two pointers and other trackers
        int counter = reqChars.length();
        int begin = 0;
        int end = 0;
        int substrSize = s.length() + 1;
        int head = 0;

        while (end < s.length()) {
            // Check if current character is in the required list
            if (hashMap.containsKey(s.charAt(end))) {
                if (hashMap.get(s.charAt(end)) > 0) {
                    counter--;
                }
                hashMap.put(s.charAt(end), hashMap.get(s.charAt(end)) - 1);
            }

            // Shrink the window size
            while (counter == 0) {
                if (end - begin + 1 < substrSize) {
                    substrSize = end - begin + 1;
                    head = begin;
                }
                
                if (hashMap.containsKey(s.charAt(begin))) {
                    hashMap.put(s.charAt(begin), hashMap.get(s.charAt(begin)) + 1);
                    if (hashMap.get(s.charAt(begin)) > 0) {
                        counter++;
                    }
                }
                begin++;
            }
            end++;
        }
        return (substrSize == s.length() + 1) ? "" : s.substring(head, head + substrSize);
    }

    public static void main(String[] args) {
        System.out.println(minWindow("abcalgosomedailyr", "ad"));
    }
}
