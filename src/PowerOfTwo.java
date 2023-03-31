public class PowerOfTwo {
    public boolean powerOfTwo(int n) {
        if (n == 0) {
            return false;
        } else {
            do {
                if (n == 1) {
                    return true;
                } else if (n % 2 != 0) {
                    n = n / 2;
                }
                else{
                    return false;
                }

            } while (true);
        }
    }
}
