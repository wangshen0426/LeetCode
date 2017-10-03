package seventeen_nine;

public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		int[] a1 = { 1, 2 };
		int[] a2 = { 3 };
		System.out.println(findMedianSortedArrays(a1, a2));
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int len1 = nums1.length, len2 = nums2.length, i = 0, j = 0, index = 0;

		int[] rs = new int[len1 + len2];
		while (index < rs.length && i < len1 && j < len2) {
			if (nums1[i] < nums2[j]) {
				if (i < len1) {
					rs[index++] = nums1[i++];
				} else {
					rs[index++] = nums2[j++];
				}

			} else {
				if (j < len2) {
					rs[index++] = nums2[j++];
				} else {
					rs[index++] = nums1[i++];
				}

			}
		}

		if (i < len1) {
			for (int m = i; m < len1; m++) {
				rs[index++] = nums1[m];
			}
		} else if (j < len2) {
			for (int m = j; m < len2; m++) {
				rs[index++] = nums2[m];
			}
		}
		return (len1 + len2) % 2 == 0 ? ((double) rs[(len1 + len2) / 2] + (double) rs[(len1 + len2) / 2 - 1]) / 2
				: rs[(len1 + len2) / 2];
	}
}
