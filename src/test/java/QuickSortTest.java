import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QuickSortTest {

    @Test
    void Test() {
        int[] unsortedArray = new int[]{2,1,3,5,4,0,6};
        int[] unsortedArray2 = new int[]{3,1,5};
        int[] unsortedArray3 = new int[]{3,1,5,157,89,2,0,1};
        int[] arr0 = new int[0];
        int[] sortedArray = new int[]{1,2,3,4,5,6};
        int[] arr1 = new int[]{1};

        QuickSort.quickSort(unsortedArray,0, unsortedArray.length-1);
        Assertions.assertArrayEquals(new int[]{0,1,2,3,4,5,6}, unsortedArray);

        QuickSort.quickSort(unsortedArray2,0, unsortedArray2.length-1);
        Assertions.assertArrayEquals(new int[]{1,3,5}, unsortedArray2);

        QuickSort.quickSort(unsortedArray3,0, unsortedArray3.length-1);
        Assertions.assertArrayEquals(new int[]{0,1,1,2,3,5,89,157}, unsortedArray3);

        Assertions.assertArrayEquals(new int[0], arr0);
        Assertions.assertArrayEquals(new int[]{1,2,3,4,5,6}, sortedArray);
        Assertions.assertArrayEquals(new int[]{1}, arr1);
    }
}