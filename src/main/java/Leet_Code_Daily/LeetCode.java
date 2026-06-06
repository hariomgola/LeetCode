package Leet_Code_Daily;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode {
    static void main(String[] args) {
        LeetCode ls = new LeetCode();
        // ls.new _1722().run();
        // ls.new _2452().run();
        // ls.new _2615().run();
        // ls.new _1559().run();
    }

    class _1722 {
        public void run() {
            String url = "https://leetcode.com/problems/words-within-two-edits-of-dictionary/description/";
            _1722 cs = new _1722();
            cs.minimumHammingDistance(new int[]{1, 2, 3, 4}, new int[]{2, 1, 4, 5}, new int[][]{{0, 1}, {2, 3}});
            cs.minimumHammingDistance(new int[]{1, 2, 3, 4}, new int[]{1, 3, 2, 4}, new int[][]{});
            cs.minimumHammingDistance(new int[]{5, 1, 2, 4, 3}, new int[]{1, 5, 4, 2, 3}, new int[][]{{0, 4}, {4, 2}, {1, 3}, {1, 4}});
        }

        public int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {
            return 0;
        }
    }

    class _2452 {
        public void run() {
            String url = "https://leetcode.com/problems/words-within-two-edits-of-dictionary/description/";
            _2452 cs = new _2452();
            cs.twoEditWords(new String[]{"word", "note", "ants", "wood"}, new String[]{"wood", "joke", "moat"});
            cs.twoEditWords(new String[]{"yes"}, new String[]{"not"});
        }

        public List<String> twoEditWords(String[] queries, String[] dictionary) {
            // Brute force approach
            List<String> _ls = new ArrayList<>();
            int wordLength = dictionary[0].length();
            for (int i = 0; i < queries.length; i++) {
                inner:
                for (int j = 0; j < dictionary.length; j++) {
                    int _counter = 0;
                    wordCheck:
                    for (int k = 0; k < wordLength; k++) {
                        if (queries[i].charAt(k) != dictionary[j].charAt(k)) {
                            _counter += 1;
                            if (_counter > 2) {
                                break wordCheck;
                            }
                        }
                    }
                    if (_counter <= 2) {
                        _ls.add(queries[i]);
                        break inner;
                    }
                }
            }
            System.out.println(_ls.toString());
            return _ls;
        }
    }

    class _2615 {
        public void run() {
            String url = "https://leetcode.com/problems/words-within-two-edits-of-dictionary/description/";
            _2615 cs = new _2615();
            cs.distance(new int[]{1, 3, 1, 1, 2});
            // cs.distance(new int[]{0, 5, 3});
        }

        public long[] distance(int[] nums) {
            HashMap<Integer, ArrayList<Integer>> _hs = new HashMap<>();
            long[] _nums = new long[nums.length];
            for (int i = 0; i < nums.length; i++) {
                if (_hs.get(nums[i]) == null) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(i);
                    _hs.put(nums[i], list);
                } else {
                    _hs.get(nums[i]).add(i);
                }
            }

            System.out.println(_hs.toString());

            for (int i = 0; i < nums.length; i++) {
                if (_hs.get(nums[i]) == null || _hs.get(nums[i]).size() == 1) {
                    _nums[i] = 0L;
                } else {
                    ArrayList<Integer> _inData = _hs.get(nums[i]);
                    Long _lnData = 0l;
                    for (Integer val : _inData) {
                        if (val != i) {
                            _lnData += Math.abs(i - val);
                            System.out.println(i + "|" + val);
                        }


                    }
                    _nums[i] = _lnData;
                }
            }
            return _nums;
        }
    }

    class _1559 {
        public void run() {
            String url = "https://leetcode.com/problems/detect-cycles-in-2d-grid/description/";
            _1559 cs = new _1559();
            cs.containsCycle(new char[][]{});
        }

        public boolean containsCycle(char[][] grid) {
            return true;
        }
    }
}
