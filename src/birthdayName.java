
public class birthdayName {
    public static void main (String[] args)
    {
        birthdayName ss = new birthdayName();
        String ans = ss.birthdayName("Krishna");
        System.out.println(ans);
    }

    public String birthdayName(String word)
    {
        String output = "Happy birthday " + word;
        return output;
    }

}

