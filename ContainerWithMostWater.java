package seventeen_nine;

public class ContainerWithMostWater {
	public static int maxArea(int[] height) {
		int len = height.length, l = 0, r = len - 1, max = 0;
		while (l < r) {
			max = Math.max(max, Math.min(height[l], height[r]) * (r - l));
			if (height[l] < height[r]) {
				l++;
			} else {
				r--;
			}
		}
		return max;

	}

}
