package october;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		int len = nums.length;
		List<List<Integer>> rs = new ArrayList<>();

		for (int i = 0; i < len - 2; i++) {
			if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
				int start = i + 1, end = len - 1;
				while (start < end) {

					if ((nums[start] + nums[end] + nums[i]) == 0) {
						rs.add(Arrays.asList(nums[start], nums[end], nums[i]));
						while (start < end && nums[start] == nums[start + 1]) {
							start++;
						}
						while (start < end && nums[end] == nums[end - 1]) {
							end--;
						}
						start++;
						end--;
					} else if ((nums[start] + nums[end] + nums[i]) < 0) {
						start++;
					} else {
						end--;
					}
				}
			}
		}

		return rs;
	}

	public static void main(String[] args) {
		// [-1, 0, 1, 2, -1, -4]
		/*
		 * [ [-1, 0, 1], [-1, -1, 2] ]
		 */
		List<List<Integer>> rs = threeSum(new int[] { 0, 0, 0, 0 });
		System.out.println(rs);

	}
}
