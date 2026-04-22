package Leet_Code_Daily;

import java.util.ArrayList;
import java.util.List;

public class LeetCode {
    static void main(String[] args) {
        LeetCode ls = new LeetCode();
        // ls.new _1722().run();
        // ls.new _2452().run();
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
}
