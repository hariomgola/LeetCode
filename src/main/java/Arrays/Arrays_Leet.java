package Arrays;

import Leet_Code_Daily.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Arrays_Leet {
    static void main() {
        Arrays_Leet ls = new Arrays_Leet();
        // ls.new _288().run();
        // ls.new _27().run();
        // ls.new _1470().run();
        // ls.new _26().run();
        // ls.new _80().run();
        // ls.new _189().run();
        // ls.new _485().run();
        // ls.new _414().run();
        // ls.new missing_ranges().run();
        // ls.new _169().run();
        ls.new _229().run();
    }

    // ************************** Array Manipulation *************************

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

    // *****
    class _1470 {
        // Different as decoding and encoding in single bit
        public void run() {
            String url = "http://leetcode.com/problems/shuffle-the-array/";
            Arrays_Leet._1470 cs = new Arrays_Leet._1470();
            cs.shuffle(new int[] { 2, 5, 1, 3, 4, 7 }, 3);
            cs.shuffle(new int[] { 1, 2, 3, 4, 4, 3, 2, 1 }, 4);
        }

        public int[] shuffle(int[] nums, int n) {
            int maxVal = 1001;
            for (int i = n - 1; i >= 0; i--) {
                nums[2 * i + 1] += (nums[n + i] % maxVal) * maxVal;
                nums[2 * i] += (nums[i] % maxVal) * maxVal;
                System.out.println(i + "  -  " + Arrays.toString(nums));

            }
            return nums;
        }

    }

    class _26 {
        public void run() {
            String url = "https://leetcode.com/problems/remove-duplicates-from-sorted-array/";
            Arrays_Leet._26 cs = new Arrays_Leet._26();
            cs.removeDuplicates(new int[] { 1, 1, 2 });
            cs.removeDuplicates(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 });
        }

        public int removeDuplicates(int[] nums) {
            int pointer = 1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[i - 1]) {
                    nums[pointer++] = nums[i];
                }
            }
            return pointer;
        }
    }

    class _80 {
        public void run() {
            String url = "https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/";
            Arrays_Leet._80 cs = new Arrays_Leet._80();
            cs.removeDuplicates(new int[] { 1, 1, 1, 2, 2, 3 });
        }

        public int removeDuplicates(int[] nums) {
            int pointer = 2;
            for (int i = 2; i < nums.length; i++) {
                if (nums[i] != nums[pointer - 2]) {
                    nums[pointer++] = nums[i];
                }
            }
            return pointer;
        }
    }

    class _189 {
        public void run() {
            String url = "https://leetcode.com/problems/rotate-array/";
            Arrays_Leet._189 cs = new Arrays_Leet._189();
            // cs.rotate(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 3);
            cs.rotate(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 3);
            /*
             * (Reverse the whole array)
             * 7 6 5 4 3 2 1 // let suppose if k3 is reverse the first k element and reverse
             * 5 6 7 1 2 3 4 // Here is the final answer
             */
        }

        public void rotate(int[] nums, int k) {
            int arrLength = nums.length;
            k = k % arrLength; // imp as if k > n like array is 1 k =2 so it will fail in these change this
                               // statement change k to 0
                               // if k>= n it doesn't harm anything it will return the same value
            reverseHelper(nums, 0, arrLength - 1);
            reverseHelper(nums, 0, k - 1);
            reverseHelper(nums, k, arrLength - 1);
            System.out.println(Arrays.toString(nums));

        }

        private void reverseHelper(int[] nums, int s, int l) {
            while (s < l) {
                int temp = nums[s];
                nums[s++] = nums[l];
                nums[l--] = temp;
            }
        }

    }

    // ************************** Finding & Counting *************************

    class _485 {
        public void run() {
            String url = "https://leetcode.com/problems/max-consecutive-ones/";
            Arrays_Leet._485 cs = new Arrays_Leet._485();
            cs.findMaxConsecutiveOnes(new int[] { 1, 1, 0, 1, 1, 1 });
        }

        public int findMaxConsecutiveOnes(int[] nums) {
            int maxCounter = 0;
            int startCounter = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 1) {
                    startCounter++;
                } else {
                    startCounter = 0;
                }
                maxCounter = maxCounter > startCounter ? maxCounter : startCounter;
            }
            return maxCounter;
        }
    }

    class _414 {
        public void run() {
            String url = "https://leetcode.com/problems/max-consecutive-ones/";
            Arrays_Leet._414 cs = new Arrays_Leet._414();
            // cs.thirdMax(new int[] { 3, 2, 1 });
            cs.thirdMax(new int[] { 5, 2, 8, 2, 9, 1, 5, 7, 3, 8, 4, 2, 6, 5, 9 });
        }

        public int thirdMax(int[] nums) {
            int counter = 0;
            for (int i = 0; i < nums.length; i++) {
                // will do a quick sort and take 0+2 from it
            }
            return nums[counter - 2];
        }
    }

    class missing_ranges {
        public void run() {
            String url = "https://algomaster.io/learn/dsa/missing-ranges";
            /**
             * You are given an inclusive range [lower, upper] and a sorted unique integer
             * array nums, where all elements are within the inclusive range.
             * 
             * A number x is considered missing if x is in the range [lower, upper] and x is
             * not in nums.
             * 
             * Return the shortest sorted list of ranges that exactly covers all the missing
             * numbers. That is, no element of nums is included in any of the ranges, and
             * each missing number is covered by one of the ranges.
             */
            Arrays_Leet.missing_ranges cs = new Arrays_Leet.missing_ranges();
            cs.findMissingRanges(new int[] { 0, 1, 3, 50, 75 }, 0, 99);
            cs.findMissingRanges(new int[] { -1 }, -1, -1);
            cs.findMissingRanges(new int[] { 1, 3, 5, 7 }, 0, 9);
        }

        public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
            List<List<Integer>> _range = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if (i == 0) {
                    if (lower != nums[i] || lower + 1 <= nums[i]) {
                        _range.add(Arrays.asList(lower + 1, nums[i] - 1));
                        // System.out.println(nums[i]);
                    }
                    continue;
                }
                if (i == (nums.length - 1)) {
                    if (nums[i] != upper || nums[i] + 1 <= upper) {
                        _range.add(Arrays.asList(nums[i] + 1, upper - 1));
                        // System.out.println(nums[i]);
                    }
                    continue;
                }
                if (nums[i] + 1 != nums[i + 1]) {
                    _range.add(Arrays.asList(nums[i] + 1, nums[i + 1] - 1));
                    // System.out.println(nums[i] + " = " + nums[i + 1]);
                }
            }
            System.out.println(_range);
            return _range;
        }
    }

    class _169 {
        public void run() {
            String url = "https://leetcode.com/problems/majority-element/";
            Arrays_Leet._169 cs = new Arrays_Leet._169();
            cs.majorityElement(new int[] { 3, 2, 3 });
            cs.majorityElement(new int[] { 2, 2, 1, 1, 1, 2, 2 });
        }

        public int majorityElement(int[] nums) {
            HashMap<Integer, Integer> _hs = new HashMap<>();
            _hs.put(null, nums[0]);
            for (int i = 0; i < nums.length; i++) {
                _hs.put(nums[i], _hs.containsKey(nums[i]) ? (_hs.get(nums[i]) + 1) : 1);
                if (_hs.get(nums[i]) > _hs.get(_hs.get(null))) {
                    _hs.put(null, nums[i]);
                }
            }
            return _hs.get(null);
        }
    }

    class _229 {
        public void run() {
            String url = "https://leetcode.com/problems/majority-element-ii/";
            Arrays_Leet._229 cs = new Arrays_Leet._229();
            cs.majorityElement(new int[] { 3, 2, 3 });
            cs.majorityElement(new int[] { 2, 2, 1, 1, 1, 2, 2 });
        }

        public List<Integer> majorityElement(int[] nums) {
            List<Integer> result = new ArrayList<>();
            if (nums.length <= 2) {
                for (int num : nums) {
                    result.add(num);
                }
                return result;

            } else {
                Arrays.sort(nums);
                int threshold = nums.length / 3;
                int lastpointer = 0;
                return null;
            }
        }
    }
}
