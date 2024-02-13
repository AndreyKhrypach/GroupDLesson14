import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class Lesson14Program {
    public static void main(String[] args) {
        int[] intArray = {2, 5, 1, 3, 8};
        System.out.println(Arrays.toString(intArray));
        ArrayUtils.reverse(intArray);
        System.out.println(Arrays.toString(intArray));

        int[] oldArray = { 2, 3, 4, 5 };
        System.out.println(Arrays.toString(oldArray));
        int[] newArray = ArrayUtils.add(oldArray, 1, 1);
        System.out.println(Arrays.toString(newArray));
    }
}
