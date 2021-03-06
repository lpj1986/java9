package win.elegentjs.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MiddleNum {

    // 思路：将两个独立有序数组合并为一个有序数组，再取中位数
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] sumArray = new int[nums1.length + nums2.length];

        int loop = nums1.length > nums2.length ? nums1.length : nums2.length;

        int p1 = 0;
        int p2 = 0;

        int sumIndex = 0;

        for (int index = 0; index < loop; index ++) {

            if (p1 >= nums1.length) {
                sumArray[sumIndex ++] = nums2[p2];
                p1 ++;
                p2 ++;
                continue;
            } else if (p2 >= nums2.length) {
                sumArray[sumIndex ++] = nums1[p1];
                p1 ++;
                p2 ++;
                continue;
            }

            if (nums1[p1] <= nums2[p2]) {
                sumArray[sumIndex ++] = nums1[p1];
                sumArray[sumIndex ++] = nums2[p2];
            } else {
                sumArray[sumIndex ++] = nums2[p2];
                sumArray[sumIndex ++] = nums1[p1];
            }

            p1 ++;
            p2 ++;

        }


        int len = sumArray.length;

        if (len % 2 == 0) {
            return (sumArray[len / 2] + sumArray[len / 2 - 1]) / 2.0;
        }

        return sumArray[len / 2];


    }



    // 统计字符出现次数的算法题
    public int numJewelsInStones(String J, String S) {

        int total = 0;

        for (int index = 0; index < S.length(); index ++) {
            char c = S.charAt(index);

            if (J.contains(c + "")) {
                total ++;
            }

        }

        return total;
    }


    // 先求解位数组成的集合
    public static int subtractProductAndSum(int n) {

        List<Integer> list = new ArrayList<>();

        while(n > 0) {
            list.add(n % 10);
            n = n / 10;
        }

        int sum = 0;
        int multi = 0;

        for (Integer item : list) {
            sum += item;
            multi *= item;
        }

        return multi - sum;


    }

    public int[] decompressRLElist(int[] nums) {

        List<Integer> result = new ArrayList<>();

        for (int index = 0; index < nums.length; index += 2) {

            for (int j = 0; j < nums[index]; j ++) {
                result.add(nums[index + 1]);
            }

        }

        int[] array = new int[result.size()];

        for (int index = 0; index < result.size(); index ++) {
            array[index] = result.get(index);
        }

        return array;
    }


    public static int findNumbers(int[] nums) {
        int total = 0;

        for (int index = 0; index < nums.length; index ++) {

            int bits = 0;

            int val = nums[index];
            while(val > 0) {
                val /= 10;
                bits ++;
            }

            total += (bits % 2 == 0) ? 1 : 0;
        }

        return total;

    }


    // 首先要理解什么是回文？即正读反读都一样，采用暴力破解法，即穷举字符串组合，并判断是否是回文
    public String longestPalindrome(String s) {

        String result = "";

        for (int i = 0; i < s.length(); i ++) {
            for (int j = i + 1; j <= s.length(); j ++) {
                String sub = s.substring(i, j);

                if (isCycleString(sub) && sub.length() >= result.length()) {
                    result = sub;
                }

            }
        }


        return result;

    }


    private boolean isCycleString(String s) {

        boolean result = true;
        for (int index = 0; index < s.length() / 2; index ++) {
            char c = s.charAt(index);
            char lastC = s.charAt(s.length() - 1 - index);

            if (c != lastC) {
                result = false;
                break;
            }
        }

        return result;

    }

    public static void main(String[] args) {
        String result = new MiddleNum().longestPalindrome("a");
        System.out.println(result);
    }

}
