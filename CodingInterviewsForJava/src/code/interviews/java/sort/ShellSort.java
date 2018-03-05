package code.interviews.java.sort;

import java.util.Arrays;

/**
 * Created by Administrator on 2018/3/5.
 */
public class ShellSort {

    public static void main(String[] args)
    {
        Integer[] input = new Integer[]{3, 5, 6, 9 ,0 ,6, 1, 8, 7 ,2};

        ShellSort shellSort = new ShellSort();
        Arrays.stream(shellSort.shellSort(input)).forEach(integer -> System.out.print(integer + " "));
    }

    private Integer[] shellSort(Integer[] nums)
    {
        int j, gap;
        int n = nums.length;

        for (gap = n / 2; gap > 0 ;gap /= 2)
        {
            for (j = gap ; j < n ; j++)
            {
                if (nums[j] < nums[j - gap])
                {
                    int k = j - gap;
                    int temp = nums[j];

                    while (k >= 0 && temp < nums[k])
                    {
                        nums[k + gap] = nums[k];
                        k -= gap;
                    }

                    nums[k + gap] = temp;
                }
            }
        }

        return nums;
    }
}
