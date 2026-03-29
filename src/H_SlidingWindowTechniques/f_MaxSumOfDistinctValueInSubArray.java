package H_SlidingWindowTechniques;
import java.util.*;

public class f_MaxSumOfDistinctValueInSubArray {
    public long maximumSubarraySumByHash(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        long sum = 0;
        long max = 0;
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            // If duplicate found → shrink window
            while (set.contains(nums[j])) {
                set.remove(nums[i]);
                sum -= nums[i];
                i++;
            }
            // Add current element
            set.add(nums[j]);
            sum += nums[j];

            // Maintain window size = k
            if (j - i + 1 == k) {
                max = Math.max(max, sum);
                // Remove leftmost element
                set.remove(nums[i]);
                sum -= nums[i];
                i++;
            }
        }

        return max;
    }

    public long maximumSubarraySum(int[] nums, int k) {
        long max = 0;
        int[] freq = new int[100001];
        long sum;

        for (int i = 0; i <= nums.length - k; i++) {
            sum = 0;
            boolean distinct = true;
            for (int x = 0; x < 100001; x++) {
                freq[x] = 0;
            }

            for (int j = i; j < i + k; j++) {
                if (freq[nums[j]] > 0) {
                    distinct = false;
                    break;
                }
                freq[nums[j]]++;
                sum += nums[j];
            }

            if (distinct) {
                max = Math.max(max, sum);
            }
        }

        return max;
    }
    public long maximumSubarraySumOptimal(int[] nums, int k) {
            int[] freq = new int[100001]; // adjust size if needed

            long sum = 0, max = 0;
            int i = 0;

            for (int j = 0; j < nums.length; j++) {

                // include current element
                freq[nums[j]]++;
                sum += nums[j];

                // if duplicate → shrink window
                while (freq[nums[j]] > 1) {
                    freq[nums[i]]--;
                    sum -= nums[i];
                    i++;
                }

                // maintain window size = k
                if (j - i + 1 == k) {
                    max = Math.max(max, sum);

                    // slide window forward
                    freq[nums[i]]--;
                    sum -= nums[i];
                    i++;
                }
            }

            return max;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of array");
        int size= sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the element :");
        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Enter the Window Size :");
        int k=sc.nextInt();
        f_MaxSumOfDistinctValueInSubArray obj=new f_MaxSumOfDistinctValueInSubArray();
        System.out.println(obj.maximumSubarraySum(arr,k));
        System.out.println(obj.maximumSubarraySumByHash(arr,k));
        System.out.println(obj.maximumSubarraySumOptimal(arr,k));
    }
}
