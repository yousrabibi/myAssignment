public class everyOther {
    public String everyOther(String str){
        String result = "";
        for (int i = 0; i < str.length(); i += 2)
        {
            result += str.charAt(i);
        }
        return result;
    }
}
