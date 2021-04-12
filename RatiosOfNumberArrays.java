/**
* Take an array containing integer values as an input.
* Return the ratios of positive numbers, negative numbers, zeros, even and odd to the length of the array.
* The numbers should be rounded to 3 decimal places.
*
* ex. NumberRatio([-4,3,-9,0,4,1,5]) = [0.571, 0.286, 0.143, 0.429, 0.571]
*
* @author ahmadfajar
*/

class RatiosOfNumberArrays {

    static void positiveNegativeZero(int[] arr)
    {

        int len = arr.length;

        float positiveCount = 0;
        float negativeCount = 0;
        float zeroCount = 0;
        float evenCount = 0;
        float oddCount = 0;
        boolean isEven = false;

        // Traverse the array and count the total number of
        // positive, negative, and zero elements.
        for (int i = 0; i < len; i++) {
            if (arr[i] % 2 == 0){
                evenCount++;
            } else {
                oddCount++;
            }

            if (arr[i] > 0) {
                positiveCount++;
            }
            else if (arr[i] < 0) {
                negativeCount++;
            }
            else if (arr[i] == 0) {
                zeroCount++;
            }

        }

        System.out.printf("Positive: %1.3f ", positiveCount / len);
        System.out.printf("Negative: %1.3f ", negativeCount / len);
        System.out.printf("Zero: %1.3f ", zeroCount / len);
        System.out.printf("Even: %1.3f  ", (evenCount / (float) len));
        System.out.printf("Odd: %1.3f ", (oddCount / (float) len));
        System.out.println();
    }

    // Driver Code.
    public static void main(String args[])
    {

        // Test Case 1:
        int[] a1 = { -4,3,-9,0,4,1,5 };
        positiveNegativeZero(a1);
    }
}
