import java.util.Arrays;

public class Main {
    public static int[] filterEvenIndexOddValue(int[] array) {

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && array[i] % 2 != 0) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && array[i] % 2 != 0) {
                result[index] = array[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] testArray1 = {7,8,9,10,11};

        int[] filterArray1 = filterEvenIndexOddValue(testArray1);

        System.out.println(Arrays.toString(filterArray1));
          for (int num: (filterArray1)) {
           System.out.print(num + " ");
          }
    }
}