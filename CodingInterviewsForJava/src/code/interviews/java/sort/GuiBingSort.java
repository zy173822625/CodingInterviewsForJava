package code.interviews.java.sort;

import java.util.Arrays;

/**
 * Created by Administrator on 2018/3/6.
 */
public class GuiBingSort {
    public static void main(String[] args)
    {
        Integer[] input = new Integer[]{3, 5, 6, 9 ,0 ,6, 1, 8, 7 ,2};

        GuiBingSort guiBingSort = new GuiBingSort();

        Integer[] temp = new Integer[input.length];
        Arrays.stream(guiBingSort.mergeSort(input, 0, input.length - 1, temp)).forEach(integer -> System.out.print(integer + " "));
    }

    private void mergeArray(Integer[] nums, int first, int mid, int last, Integer[] temp)
    {
        int i = first;
        int j = mid + 1;
        int m = mid;
        int n = last;
        int k = 0;

        while (i <= m && j <= n)
        {
            if (nums[i] <= nums[j])
            {
                temp[k++] = nums[i++];
            }
            else
            {
                temp[k++] = nums[j++];
            }
        }

        while (i <= m)
        {
            temp[k++] = nums[i++];
        }

        while (j <= n)
        {
            temp[k++] = nums[j++];
        }

        for (i = 0;i < k; i++)
        {
            nums[first + i] = temp[i];
        }
    }

    private Integer[] mergeSort(Integer[] nums, int first, int last, Integer[] temp)
    {
        if (first < last)
        {
            int mid = (first + last) / 2;

            mergeSort(nums, first, mid, temp);
            mergeSort(nums, mid + 1, last, temp);
            mergeArray(nums, first, mid, last, temp);
        }

        return nums;
    }
}
