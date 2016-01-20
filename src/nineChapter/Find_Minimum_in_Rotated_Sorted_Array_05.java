package nineChapter;

public class Find_Minimum_in_Rotated_Sorted_Array_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] tests = new int[]{0, 1, 2,3,4,5,6};
		
		int min = Find_Minimum_in_Rotated_Sorted_Array_05.findMin(tests);
		System.out.println(min);
	}

	public static int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        
        int start = 0, end = nums.length - 1;
        int target = nums[nums.length - 1];
        
        // find the first element <= target
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= target) {
                end = mid;
            } else {
                start = mid;
            }
        }
        if (nums[start] <= target) {
            return nums[start];
        } else {
            return nums[end];
        }
    }
}
