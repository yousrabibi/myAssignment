
public class reverseDoubleChar {
    public static void main (String[] args)
    {
        reverseDoubleChar ss = new reverseDoubleChar();
        String ans = ss.reverseDoubleChar("good");
        System.out.println(ans);
    }

    public String reverseDoubleChar(String word)
    {
        String output = "";
        char ch;
        for (int i=0; i<word.length(); i++)
        {
            ch = word.charAt(i);
            output = ch + output;
            output = ch + output;
        }
        return output;
    }

}
