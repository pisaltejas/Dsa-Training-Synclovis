public class NextPowerOfTwo {

    public static void main(String[] args) {
        int n = 20; 
        System.out.println("Next highest power of 2 for " + n + " is " + findNextPowerOfTwo(n));
    }

    public static int findNextPowerOfTwo(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Input must be a positive number.");
        }
        
   
        if ((n & (n - 1)) == 0) {
            return n;
        }


        int powerOfTwo = 1;
        while (powerOfTwo < n) {
            powerOfTwo <<= 1;
        }

        return powerOfTwo;
    }
}
