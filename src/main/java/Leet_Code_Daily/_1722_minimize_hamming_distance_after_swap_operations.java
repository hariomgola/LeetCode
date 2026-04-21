package Leet_Code_Daily;


import java.util.HashSet;

public class _1722_minimize_hamming_distance_after_swap_operations {
    static void main(String[] args) {
        run();
    }

    public static void run() {
        _1722_minimize_hamming_distance_after_swap_operations cs = new _1722_minimize_hamming_distance_after_swap_operations();
        // cs.minimumHammingDistance(new int[]{1, 2, 3, 4}, new int[]{2, 1, 4, 5}, new int[][]{{0, 1}, {2, 3}});
        cs.minimumHammingDistance(new int[]{5, 1, 2, 4, 3}, new int[]{1, 5, 4, 2, 3}, new int[][]{{0, 4}, {4, 2}, {1, 3}, {1, 4}});
    }

    public int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {
      return 0;
    }
}


/**
 * You are given two integer arrays, source and target, both of length n. You are also given an array allowedSwaps where each allowedSwaps[i] = [ai, bi] indicates that you are allowed to swap the elements at index ai and index bi (0-indexed) of array source. Note that you can swap elements at a specific pair of indices multiple times and in any order.
 * The Hamming distance of two arrays of the same length, source and target, is the number of positions where the elements are different. Formally, it is the number of indices i for 0 <= i <= n-1 where source[i] != target[i] (0-indexed).
 * Return the minimum Hamming distance of source and target after performing any amount of swap operations on array source.
 * Example 1:
 * Input: source = [1,2,3,4], target = [2,1,4,5], allowedSwaps = [[0,1],[2,3]]
 * Output: 1
 * Explanation: source can be transformed the following way:
 * - Swap indices 0 and 1: source = [2,1,3,4]
 * - Swap indices 2 and 3: source = [2,1,4,3]
 * The Hamming distance of source and target is 1 as they differ in 1 position: index 3.
 */