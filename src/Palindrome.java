public class Palindrome {
    public boolean countPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reverseStr = new StringBuilder(str).reverse().toString();
        return str.equals(reverseStr);

    }
}
