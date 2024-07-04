public class W3A5 {
  public static void main(String[] args) {
    // input
    int[] inputArr = { 2, 7, 11, 15 };
    // print answer (if it don't match or throw error, return [-1,-1])
    int[] answer = twoSum(inputArr, 9);
    System.out.println(java.util.Arrays.toString(answer));
  }

  private static int[] twoSum(int[] nums, int target) {
    if (nums.length < 2)
      return new int[] { -1, -1 };
    for (int i = 0; i < nums.length; i++)
      for (int j = 0; j < nums.length; j++) {
        if (i == j)
          continue;
        else if (nums[i] + nums[j] == target)
          return new int[] { i, j };
      }
    return new int[] { -1, -1 };
  }

  /*
   * For example:
   * twoSum([2, 7, 11, 15], 9);
   * Should returns:
   * [0, 1]
   * Because:
   * nums[0]+nums[1] is 9
   */
}
