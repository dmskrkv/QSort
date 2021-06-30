public class QuickSort {

    public static void quickSort(int[] arr, int leftBorder, int rightBorder) {
        if (arr == null || arr.length == 0)
            return;

        if (leftBorder >= rightBorder)
            return;

        int middle = arr[(leftBorder + rightBorder) / 2];


        int i = leftBorder;
        int j = rightBorder;
        while (i < j) {
            while (arr[i] < middle) {
                i++;
            }

            while (arr[j] > middle) {
                j--;
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        quickSort(arr, leftBorder, j);
        quickSort(arr, i, rightBorder);
    }
}