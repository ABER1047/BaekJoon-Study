public class PermutationWithoutList 
{
    public static void permute(int[] nums, int start) 
    {
        // base case: start가 배열의 길이와 같으면 하나의 순열이 완성된 것
        if (start == nums.length) 
        {
            // 순열을 출력
            printArray(nums);
        }
        else
        {
            // 각 위치에서 다른 위치와 교환하여 순열 생성
            for (int i = start; i < nums.length; i++) 
            {
                // 현재 위치와 i 위치의 요소를 교환
                swap(nums, start, i);
                // 다음 위치에 대해 재귀 호출
                permute(nums, start + 1);
                // 원래 배열 상태로 복구 (백트래킹)
                swap(nums, start, i);
            }
        }
    }
    
    // 두 배열 요소를 교환하는 메서드
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // 배열을 출력하는 메서드
    private static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i ++) 
        {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        int[] nums = {1, 2, 3};
        permute(nums, 0);
    }
}
