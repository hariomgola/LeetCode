package Arrays;

import Leet_Code_Daily.LeetCode;

import java.util.Arrays;

public class Arrays_Leet {
    static void main() {
        Arrays_Leet ls = new Arrays_Leet();
        // ls.new _288().run();
        // ls.new _27().run();
        ls.new _1470().run();
    }

    class _288 {
        public void run() {
            String url = "https://leetcode.com/problems/move-zeroes/";
            Arrays_Leet._288 cs = new Arrays_Leet._288();
            cs.moveZeroes(new int[] { 0, 1, 0, 3, 12 });
        }

        public void moveZeroes(int[] nums) {
            int insertPointer = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    int temp = nums[i];
                    nums[i] = nums[insertPointer];
                    nums[insertPointer] = temp;
                    insertPointer++;
                }
            }
            // System.out.println(Arrays.toString(nums));
        }
    }

    class _27 {
        public void run() {
            String url = "https://leetcode.com/problems/remove-element/description/";
            Arrays_Leet._27 cs = new Arrays_Leet._27();
            cs.removeElement(new int[] { 3, 2, 2, 3 }, 3);
            cs.removeElement(new int[] { 0, 1, 2, 2, 3, 0, 4, 2 }, 2);
        }

        public int removeElement(int[] nums, int val) {
            int valPtr = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    int temp = nums[i];
                    nums[i] = nums[valPtr];
                    nums[valPtr] = temp;
                    valPtr++;
                }
            }
            // System.out.println(Arrays.toString(nums) + valPtr);
            return valPtr;
        }
    }

    class _1470 {
        // Different as decoding and encoding in single bit
        public void run() {
            String url = "http://leetcode.com/problems/shuffle-the-array/";
            Arrays_Leet._1470 cs = new Arrays_Leet._1470();
            cs.shuffle(new int[] { 2, 5, 1, 3, 4, 7 }, 3);
            cs.shuffle(new int[] { 1, 2, 3, 4, 4, 3, 2, 1 }, 4);
        }

        public int[] shuffle(int[] nums, int n) {
            
            return new int[] {};
        }

    }
}
