public class swapEnds {

    public String swapEnds(String str) {
        if (str.length() <= 1)
        {
            return str;
        }
        char[] charArr = str.toCharArray();
        char first = charArr[0];
        charArr[0] = charArr[charArr.length -1];
        charArr[0] = charArr[charArr.length -1] = first;
        return new String(charArr);
    }
}
