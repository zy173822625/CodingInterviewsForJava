package code.interviews.java.sort;

import java.util.Arrays;

/**
 * Created by Administrator on 2018/2/28.
 */
public class MpSort {

    public static void main(String[] args)
    {
        Integer[] input = new Integer[]{3, 5, 6, 9 ,0 ,6, 1, 8, 7 ,2};

        MpSort mpSort = new MpSort();
        Arrays.stream(mpSort.sort02(input)).forEach(
                integer -> System.out.print(integer + " ")
        );


    }

    private Integer[] sort01(Integer[] nums)
    {
        for (int i = 0;i < nums.length - 1; i++)
        {
            for (int j = 0; j < nums.length - i - 1; j++)
            {
                if (nums[j] > nums[j + 1])
                {
                    Integer temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] =temp;
                }
            }
        }
        return nums;
    }

    private Integer[] sort02(Integer[] nums)
    {
        int i,j;
        boolean flag = true;
        int n = nums.length;
        while (flag)
        {
            flag = false;
            for (j = 0; j < n - 1; j++)
            {
                if (nums[j] > nums[j + 1])
                {
                    Integer temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] =temp;
                    flag = true;
                }
            }
            n--;
        }

        return nums;
    }
}
