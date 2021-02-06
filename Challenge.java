public class Challenge {
	public static int getAbsSum(int[] nums) {
		int sum=0;
        for (int i : nums) {
            sum+=Math.abs(Integer.valueOf(i));
        }
        return sum;
	}
}