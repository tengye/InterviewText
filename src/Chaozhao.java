/**
 * Created by teng on 17/12/10.
 */
public class Chaozhao {

    //二分查找，递归版本
    int BinarySearch2(int a[], int value, int low, int high)
    {
        int mid = low+(high-low)/2;
        if(a[mid]==value)
            return mid;
        else if(a[mid]>value)
            return BinarySearch2(a, value, low, mid-1);
        else if(a[mid]<value) {
        return BinarySearch2(a, value, mid + 1, high);
    }
        return 0;
    }

}
