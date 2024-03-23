import java.util.Arrays;

public class TrappingRainWater {

    public static void main(String[] args) {
        System.out.println(trap(new int[]{4, 2, 0, 3, 2, 5}));
    }

    public static int trap(int[] height) { //THIS IS A BS SOLUTION, WILL IMPROVE LATER
        int result = 0;

        for (int i = 1; i < height.length - 1; i++) {

            int rightMax = height[i + 1];
            for (int j = (i + 1); j < height.length; j++) {
                if (height[j] >= rightMax) {
                    rightMax = height[j];
                }
            }
            int leftMax = height[i - 1];
            for (int j = i - 1; j >= 0; j--) {
                if (height[j] >= leftMax) {
                    leftMax = height[j];
                }
            }

            int min = Math.min(rightMax, leftMax);
            int drops = min - height[i];

            if (drops > 0) {
                result += drops;
            }

        }

        return result;
    }

}
