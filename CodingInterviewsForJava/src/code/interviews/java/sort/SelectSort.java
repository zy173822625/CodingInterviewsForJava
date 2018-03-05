package code.interviews.java.sort;

import java.util.Arrays;

/**
 * Created by Administrator on 2018/3/5.
 */
public class SelectSort {

    public static void main(String[] args)
    {
        Integer[] input = new Integer[]{3, 5, 6, 9 ,0 ,6, 1, 8, 7 ,2};

        SelectSort selectSort = new SelectSort();
        Arrays.stream(selectSort.insertSort(input)).forEach(integer -> System.out.print(integer + " "));
    }

    private Integer[] insertSort(Integer[] nums)
    {
        int i,j,min;
        int n = nums.length;

        for(i = 0; i < n; i++)
        {
            min = i;

            for (j = i + 1; j < n; j++)
            {
                if (nums[j] < nums[min])
                {
                    min = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }

        return nums;
    }
}
