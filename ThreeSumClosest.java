package october;

import java.util.Arrays;

public class ThreeSumClosest {
	public static int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int len = nums.length;
		int sum = nums[0] + nums[1] + nums[2];
		int min = nums[0] + nums[1] + nums[2] - target;
		for (int i = 0; i < len; i++) {
			if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
				int start = i + 1, end = len - 1;
				while (start < end) {
					int total = nums[start] + nums[end] + nums[i];
					if (total == target) {
						return target;
					}
					int temp = total - target;
					if (Math.abs(temp) < Math.abs(min)) {
						min = temp;
						sum = total;
					}

					if (total > target) {
						end--;
					} else {
						start++;
					}
					// while (start < end && nums[start] == nums[start + 1]) {
					// start++;
					// }
					//
					// while (start < end && nums[end] == nums[end - 1]) {
					// end--;
					// }
					// start++;
					// end--;
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(threeSumClosest(new int[] { 1, 2, 4, 8, 16, 32, 64,
				128 }, 82));
	}
}
