package win.elegentjs.datastructor.sort.simple;

import win.elegentjs.util.ArrayUtil;

import static win.elegentjs.util.PrintUtil.*;

import java.util.Arrays;


/**
 *
 * 冒泡排序
 *
 * 思路：
 *  从第二个开始跟前面的元素两两比较，如果前面比后面的大，位置交换，一轮下来会将最大的冒到最后面
 *  共进行N -1 轮上述过程，排序完成
 *
 *  时间复杂度：O(N * N)
 *  空间复杂度：O(N)
 *
 *  算法中新增了stop变量，用于优化排序性能，当一轮排序发现并未有任何元素发生交换，说明元素已经有序，
 *  可以直接终止排序，优化排序性能
 *
 */
public class BubbleSort {

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i ++) {
            boolean stop = true;
            for (int j = 1; j < array.length - i; j ++) {
                if (array[j - 1] > array[j]) {
                    stop = false;
                    ArrayUtil.swap(array, j - 1, j);
                }
            }

            if (stop) {
                break;
            }
        }
    }


    public static void main(String[] args) throws NoSuchMethodException {
        ArrayUtil.sort(BubbleSort.class.getMethod("sort", int[].class));
    }

}
