public class missingFront {
    public String missingFront(String str) {
        if (str.length() <= 3) {
            return "";
        }
        return str.substring(3);
    }
}
