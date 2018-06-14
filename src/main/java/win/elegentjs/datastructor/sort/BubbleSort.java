package win.elegentjs.datastructor.sort;

import java.util.Arrays;

/**
 *
 * 冒泡排序
 *
 */
public class BubbleSort {


    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i ++) {
            for (int j = 1; j < array.length - i; j ++) {
                if (array[j] < array[j - 1]) {
                    swap(array, j,  j - 1);
                }
            }
        }
    }



    private static void swap(int[] array, int j, int k) {
        int temp = array[j];
        array[j] = array[k];
        array[k] = temp;
    }


    public static void main(String[] args) {
        int[] array = {23, 1,23, 1, 2, 21, 455, 2, 123,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46,23, 1, 2, 21, 455, 2, 123,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46,23, 1, 2, 21, 455, 2, 123,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46,23, 1, 2, 21, 455, 2, 123,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46,23, 1, 2, 21, 455, 2, 123,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46,23, 1, 2, 21, 455, 2, 123,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46,23, 1, 2, 21, 455, 2, 123,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46,23, 1, 2, 21, 455, 2, 123,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46,23, 1, 2, 21, 455, 2, 123,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46,23, 1, 2, 21, 455, 2, 123,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 2, 123, 456,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46,23, 1, 2, 21, 455, 2, 123,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46,23, 1, 2, 21, 455, 2, 123,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46,23, 1, 2, 21, 455, 2, 123,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46,23, 1, 2, 21, 455, 2, 123,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46,23, 1, 2, 21, 455, 2, 123,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46,23, 1, 2, 21, 455, 2, 123,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46,23, 1, 2, 21, 455, 2, 123,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46,23, 1, 2, 21, 455, 2, 123,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46,23, 1, 2, 21, 455, 2, 123,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 2, 123, 456,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46,23, 1, 2, 21, 455, 2, 123,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46,23, 1, 2, 21, 455, 2, 123,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46,23, 1, 2, 21, 455, 2, 123,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46,23, 1, 2, 21, 455, 2, 123,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46,23, 1, 2, 21, 455, 2, 123,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46,23, 1, 2, 21, 455, 2, 123,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46,23, 1, 2, 21, 455, 2, 123,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46,23, 1, 2, 21, 455, 2, 123,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46,23, 1, 2, 21, 455, 2, 123,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 2, 123, 456,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 2, 21, 455, 2, 123,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46,23, 1, 2, 21, 455, 2, 123,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46,23, 1, 2, 21, 455, 2, 123,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46,23, 1, 2, 21, 455, 2, 123,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46,23, 1, 2, 21, 455, 2, 123,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46,23, 1, 2, 21, 455, 2, 123,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46,23, 1, 2, 21, 455, 2, 123,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46,23, 1, 2, 21, 455, 2, 123,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46,23, 1, 2, 21, 455, 2, 123,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46,23, 1, 2, 21, 455, 2, 123,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 2, 123, 456,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1, 23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1,23, 1, 2, 21, 455, 2, 123, 456, 32, 213, 90, 43, 89, 23, 46, 12, 0, -1};

        long start = System.currentTimeMillis();

        bubbleSort(array);

        long end = System.currentTimeMillis();

        System.out.println("cost time: " + (end - start) + " mills.");

        System.out.println(Arrays.toString(array));
    }

}
