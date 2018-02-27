import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by teng on 17/11/11.
 */
public class SortTest {

    // 1.插入排序
    // 2.

    public static void main(String[] args) {
        int a[] = {7,6,4,8,1,5,2,9,3};
//        int a[] = {1,3,5,6,4,7};
        SortTest sortTest = new SortTest();
//        final int[] sort = sortTest.guibingSort(a, 0, a.length - 1);
//        sortTest.paoSprt(a);
        sortTest.quickSort1(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));

//        Apple apple = Apple.SingletonHolder.getInstance();

//        String d = "123";
//        String b = new String("123");


//        System.out.println("=== " + d == b);
    }


    //TODO 插入排序
    // 先找第一个基准，然后依次遍历，找到要插入的位置
    public void insertSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i-1]){
                int temp = array[i];
                int j;// 要插入的位置
                for (j = i-1; j >= 0 && array[j] > temp; j--){
                    array[j+1] = array[j];
                }
                array[j+1]=temp;
            }
            for (int n = 0; n < array.length; n++) {
                System.out.print(array[n]);
            }
            System.out.println();
        }
    }
    // TODO 交换排序： 冒泡&快排

    // TODO 冒泡排序
    // N-1轮排序
    // 每i轮进行N-i
    public void paoSprt(int[] nums){
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length - i-1; j++) {
                if (nums[j] < nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
            System.out.println(Arrays.toString(nums));
        }
    }


    // TODO 快速排序
    /*
    1）选择一个基准元素,通常选择第一个元素或者最后一个元素,
    2）通过一趟排序讲待排序的记录分割成独立的两部分，其中一部分记录的元素值均比基准元素值小。另一部分记录的 元素值比基准值大。
    3）此时基准元素在其排好序后的正确位置
    4）然后分别对这两部分记录用同样的方法继续进行排序，直到整个序列有序*/
    public int partition(int[] array, int low, int hi){
        int key = array[low];
        while (low < hi){
            while (array[hi] >= key && hi > low){
                // 从后面向前扫描
                hi--;
            }

            int temp = array[low];
            array[low] = array[hi];
            array[hi] = temp;

            while (array[low] <= key && hi > low){
                low++;
            }

            int temp1 = array[hi];
            array[hi] = array[low];
            array[low] = temp1;
        }
        System.out.println(Arrays.toString(array));
        return hi;
    }
    public void quickSort(int[] array, int low, int hi){
        if (low < hi){
            // 2,4,3,8,1,5,7,9,6
            int index = partition(array, low, hi);
            quickSort(array, low, index - 1);
            quickSort(array, index+1, hi);
        }
    }


    // TODO 归并排序
    //将两个（或两个以上）有序表合并成一个新的有序表 即把待排序序列分为若干个子序列，每个子序列是有序的。
    // 然后再把有序子序列合并为整体有序序列
    public int[] guibingSort(int[] nums, int low, int high){
        int mid = (low + high)/2;
        if (low < high){
            guibingSort(nums, low, mid);
            guibingSort(nums, mid+1, high);
            merge(nums, low, mid, high);
        }
        return nums;
    }

    private void merge(int[] nums, int low, int mid, int high){
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid +1;
        int k = 0;  //新数组的下标
        while (i <= mid && j<= high){
            if (nums[i] < nums[j]){
                temp[k++] = nums[i++];
            }else {
                temp[k++] = nums[j++];
            }
        }
        while (i <= mid){
            temp[k++] = nums[i++];
        }
        while (j <= high){
            temp[k++] = nums[j++];
        }
        for (int k2 = 0; k2 < temp.length; k2++) {
            nums[k2+low] = temp[k2];
        }
    }


    public int pos(int[] array, int low, int high){
        int key = array[low];

        while (low < high){

            while (low < high && array[high] > key){
                high --;
            }

            int temp = array[low];
            array[low] = array[high];
            array[high] = temp;

            while (low < high && array[low] < key){
                low ++;
            }

            int temp1 = array[low];
            array[low] = array[high];
            array[high] = temp1;
        }
        return high;
    }


    public void quickSort1(int[] array, int low, int high){
        if (high > low){
            int index= pos(array, low, high);
            quickSort(array, low, index);
            quickSort(array, index+1, high);
        }
//        System.out.println(array.toString());
    }

}
