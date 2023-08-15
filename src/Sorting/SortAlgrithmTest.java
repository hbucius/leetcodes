package Sorting;

import Sorting.SortAlgrithm;

import java.util.Arrays;

public class SortAlgrithmTest {

    public static void run() {
//        testBubbleSort();
//        testInsertSort();
        testHeapSort();
    }

    private static void testHeapSort() {
        for (int i = 0; i < getArrays().length; i ++) {
            int [] standardArray = getArray(i);
            Arrays.sort(standardArray);
            int [] sortedArray = getArray(i);
            SortAlgrithm.heapSort(sortedArray);
            System.out.println(Arrays.toString(standardArray));
            System.out.println(Arrays.toString(sortedArray));
            assert (Arrays.equals(standardArray, sortedArray));
        }
    }


    private static void testShellSort() {
        for (int i = 0; i < getArrays().length; i ++) {
            int [] standardArray = getArray(i);
            Arrays.sort(standardArray);
            int [] sortedArray = getArray(i);
            SortAlgrithm.shellSort(sortedArray);
            System.out.println(Arrays.toString(standardArray));
            System.out.println(Arrays.toString(sortedArray));
            assert (Arrays.equals(standardArray, sortedArray));
        }
    }

    private static void testQuickSort() {
        for (int i = 0; i < getArrays().length; i ++) {
            int [] standardArray = getArray(i);
            Arrays.sort(standardArray);
            int [] sortedArray = getArray(i);
            SortAlgrithm.quickSort(sortedArray);
            System.out.println(Arrays.toString(standardArray));
            System.out.println(Arrays.toString(sortedArray));
            assert (Arrays.equals(standardArray, sortedArray));
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
            System.out.println(Arrays.toString(originalArray));
            System.out.println(Arrays.toString(sortedArray));
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
                {2,1,3},
                {2,2,2,0},
                {711111, 3,2,1,3,4,621},
                {7, 3,2,1,3,4,6},
                {3,4,5,6},
                {6,5,4,3}
        };
        return arrays;
    }
}
