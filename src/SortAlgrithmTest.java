import java.util.Arrays;

public class SortAlgrithmTest {

    public static void run() {
//        testBubbleSort();
//        testInsertSort();
        testQuickSort();
    }

    private static void testQuickSort() {
        for (int i = 0; i < getArrays().length; i ++) {
            int [] originalArray = getArray(i);
            Arrays.sort(originalArray);
            int [] sortedArray = getArray(i);
            SortAlgrithm.quickSort(sortedArray);
            System.out.println(Arrays.toString(sortedArray));
            System.out.println(Arrays.toString(originalArray));
            assert (Arrays.equals(originalArray, sortedArray));
        }
    }


    private static void testDiviedMergeSort() {
        for (int i = 0; i < getArrays().length; i ++) {
            int [] originalArray = getArray(i);
            Arrays.sort(originalArray);
            int [] sortedArray = getArray(i);
            SortAlgrithm.divedAndMerge(sortedArray);
            System.out.println(Arrays.toString(sortedArray));
            System.out.println(Arrays.toString(originalArray));
            assert (Arrays.equals(originalArray, sortedArray));
        }
    }

    private static void testChooseSort() {
        for (int i = 0; i < getArrays().length; i ++) {
            int [] originalArray = getArray(i);
            Arrays.sort(originalArray);
            int [] sortedArray = getArray(i);
            SortAlgrithm.chooseSort(sortedArray);
            System.out.println(Arrays.toString(sortedArray));
            System.out.println(Arrays.toString(originalArray));
            assert (Arrays.equals(originalArray, sortedArray));
        }
    }

    private static void testBubbleSort() {
        for (int i = 0; i < getArrays().length; i ++) {
            int [] originalArray = getArray(i);
            Arrays.sort(originalArray);
            int [] bubbleSortArray = getArray(i);
            SortAlgrithm.bubbleSort(bubbleSortArray);
            System.out.println(Arrays.toString(bubbleSortArray));
            System.out.println(Arrays.toString(originalArray));
            assert (Arrays.equals(originalArray, bubbleSortArray));
        }
    }

    private static void testInsertSort() {
        for (int i = 0; i < getArrays().length; i ++) {
            int [] originalArray = getArray(i);
            Arrays.sort(originalArray);
            int [] insertSortArray = getArray(i);
            SortAlgrithm.insertSort(insertSortArray);
            System.out.println(Arrays.toString(insertSortArray));
            System.out.println(Arrays.toString(originalArray));
            assert (Arrays.equals(originalArray, insertSortArray));
        }
    }

    public static int[] getArray(int index) {
      int[] array = getArrays()[index];
      return Arrays.copyOf(array, array.length);
    }

    public static int[][] getArrays() {
        int[][] arrays = new int[][] {
                {},
                {3},
                {7, 3,2,1,3,4,6},
                {3,4,5,6},
                {6,5,4,3}
        };
        return arrays;
    }
}
