import java.util.Arrays;

public class _4_median_of_two_sorted_arrays {

	public static void main(String[] args) {
		_4_median_of_two_sorted_arrays cs = new _4_median_of_two_sorted_arrays();
		cs.findMedianSortedArrays(new int[] { 1, 3 }, new int[] { 2 });
		cs.findMedianSortedArrays(new int[] { 1, 2 }, new int[] { 3, 4 });
		cs.findMedianSortedArrays(new int[] { 2 }, new int[] {});

	}

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int num1length = nums1.length;
		int num2length = nums2.length;
		int _size = num1length + num2length;
		int[] _newArray = new int[_size];
		int i = 0, j = 0, k = 0;
		while (i < num1length && j < num2length) {
			_newArray[k++] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
		}
		while (i < num1length) {
			_newArray[k++] = nums1[i++];
		}
		while (j < num2length) {
			_newArray[k++] = nums2[j++];
		}
		return _size % 2 == 0 ? (_newArray[_size / 2] + _newArray[_size / 2 - 1]) / 2.0 : _newArray[_size / 2];
	}

}
