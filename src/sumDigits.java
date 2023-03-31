public class sumDigits {
        public static void main (String[] args)
        {
            sumDigits ss = new sumDigits();
            int ans = ss.sumDigits(1233);
            System.out.println(ans);
        }

        public int sumDigits(int num)
        {
            int sum = 0;
            while(num !=0)
            {
                sum = sum + num%10;
                num = num / 10;
            }
            return sum;
        }

    }


