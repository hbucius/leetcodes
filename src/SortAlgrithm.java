public class SortAlgrithm {


    //快排， 是否稳定呢
    static void quickSort(int [] array) {
        quickSortHelper(array, 0, array.length - 1);
    }

    //5，6，2，4，9，5
    //5，4，2，5，9，6
    static void quickSortHelper(int [] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int middle = quickSortPivot(array, left, right);
        quickSortHelper(array, left, middle - 1);
        quickSortHelper(array, middle + 1, right);
    }

    static int quickSortPivot(int [] array, int left, int right) {
        if (left >= right) {
            return left;
        }
        // 5, 3
        // i = 0, j = 0
        // 3, 5
        int i = left;
        int j = right - 1;
        int value = array[right];
        while (i <= j) {
            while (array[i] <= value && i <= j && i <= right) {
                i += 1;
            }
            while (array[j] >= value && i <= j && j >= 0) {
                j -= 1;
            }
            if (i != j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        return j;
    }

    //归并排序, 算法复杂度 O(nlogn)
    //显然是稳定的
    //思想是：先平分，再merge，用递归，算是一遍pass把
    static void divedAndMerge(int[] array) {
        divedAndMergeSort(array, 0, array.length - 1);
    }

    static void divedAndMergeSort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        int middle = (start + end) / 2;
        divedAndMergeSort(array, start, middle);
        divedAndMergeSort(array, middle + 1, end);
        divedAndMergeMerge(array, start, middle, end);
    }

    static void divedAndMergeMerge(int[] array, int left, int middle, int right) {
        // left -> middle
        // middle + 1 -> right
        int[] mergedArray = new int[right - left + 1];
        int i = left;
        int j = middle + 1;
        int k = 0;
        while (i <= middle && j <= right) {
            if (array[i] < array[j]) {
                mergedArray[k] = array[i];
                i ++;
            } else {
                mergedArray[k] = array[j];
                j ++;
            }
            k += 1;
        }
        if (i > middle) {
            for (;j <= right; j++) {
                mergedArray[k] = array[j];
                k ++;
            }
        } else if (j > right) {
            for (;i <= middle; i++) {
                mergedArray[k] = array[i];
                k ++;
            }
        }
        System.arraycopy(mergedArray, 0, array, left, mergedArray.length);
    }


    //选择排序，涉及到交换，是不稳定的。
    static void chooseSort(int [] array) {
        int length = array.length;
        for (int i = 0; i < length - 1; i ++) {
            int minValue = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int j = i; j < length; j ++) {
                if (array[j] < minValue) {
                    minIndex = j;
                    minValue = array[j];
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    // 插入排序 https://www.runoob.com/w3cnote/insertion-sort.html
    // 主题的思想是在排序好的数字找到一个合适的位置，并且插入这个数字, 居然一遍没作对
    // 稳定排序
    static void insertSort(int[] array) {
        int length = array.length;
        for (int i = 1; i < length; i ++) {
            int temp = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > temp) {
                array[j] = array[j - 1];
                j -= 1;
            }
            if (j != i) {
                array[j] = temp;
            }
        }
    }

    //冒泡排序，见图： https://zhuanlan.zhihu.com/p/156070651
    //主题思想是：把最大的数，一个一个交换比较，挪到最后面
    //稳定性：是稳定的算法
    static void bubbleSort(int [] array) {
        int length = array.length;
        for (int i = length - 2; i >= 0; i --) {
            for (int j = 0; j <= i; j ++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

