package leetcode;

/*
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are
(i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max = 0;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            int area = 0;
            if (height[i] < height[j]) {
                area = height[i] * (j - i);
                i++;
            } else {
                area = height[j] * (j - i);
                j--;
            }
            if (max < area) max = area;
        }
        return max;
    }
}
