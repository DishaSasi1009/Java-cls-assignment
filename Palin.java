public class Palin{
    public static void main(String[] args) {
        String[] words = {"abc", "bcd", "aba", "cfg", "madam"};
        System.out.println(findFirstPalindrome(words)); 
    }
    public static String findFirstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindrome(word)) {
                return word;
            }
        }
        return null; 
    }
    public static boolean isPalindrome(String word) {
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}