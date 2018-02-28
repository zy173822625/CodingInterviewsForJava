package code.interviews.java.sort;

import java.util.Arrays;

/**
 * Created by Administrator on 2018/2/28.
 */
public class InsertSort {
    public static void main(String[] args)
    {
        Integer[] input = new Integer[]{3, 5, 6, 9 ,0 ,6, 1, 8, 7 ,2};

        InsertSort insertSort = new InsertSort();
        Arrays.stream(insertSort.sort01(input)).forEach(
                integer -> System.out.print(integer + " ")
        );
    }

    private Integer[] sort01(Integer[] nums)
    {
        int i,j;
        int n = nums.length;
        int target;

        for (i = 1; i < n; i++)
        {
            target = nums[i];
            j = i;
            while (j > 0 && target < nums[j - 1])
            {
                nums[j] = nums[j - 1];
                j--;
            }
            nums[j] = target;
        }
        return nums;
    }
}
