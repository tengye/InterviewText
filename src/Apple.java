import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by teng on 17/5/14.
 */
public class Apple implements Serializable{

    int a = 0;

    static  int b = 1;

    public static void main(String[] args) {
//        int a[] = {2,3,4,8,1,5,7,9,6};
//        Apple apple = new Apple();
//        apple.maopao(a);
//        short c = 1;
//        int b = 2;
////        c = (short) (c+b);
//        c+=b;
//        final int format = (int)((1519367382000L - 1516775382000L)/86400000);
//        apple.QuickSort(a, 0,a.length-1);
//        Queue<Integer> mQueue = new ArrayDeque<>();


//        TreeMap<Stu, String> map = new TreeMap<>();
//        map.put(new Stu(), "two");
//        map.put(new Stu(), "three");
//        map.put(new Stu(), "one");
//
//
//        for (Map.Entry<Stu, String> s : map.entrySet()) {
//            System.out.println(s.getKey()+" ------ "+ s.getValue());
//        }
        System.out.println( foo(8)+"===");

    }

    private static int foo(int n){
        if (n <= 2){
            return 1;
        }else {
            return foo(n-1) + foo(n-2);
        }
    }



    private void maopao(int[] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i -1; j++) {
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }


//    private int[] CharuSort(int array[]){
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] < array[i-1]){
//                int temp = array[i];
//                int j;
//                for (j = i-1; j >= 0 && array[j] > temp; j--) {
//                    array[j+1] = array[j];
//                }
//                array[j+1] = temp;
//            }
//        }
//        return array;
//    }

    private void exChange(int a , int b){
        int temp = a;
        a = b;
        b = temp;
    }

    private int position(int[] arry, int low, int high){
        int key = arry[low];
        while (low < high){

            while (arry[high] <= key && high > low){
                high --;
            }

            int temp = arry[high];
            arry[high] = arry[low];
            arry[low] = temp;

            while (arry[low] >= key && high > low){
                low ++;
            }

            temp = arry[high];
            arry[high] = arry[low];
            arry[low] = temp;
        }
        return high;
    }


    public void QuickSort(int[] arry, int low, int high){
        if (low < high) {
            int pos = position(arry, low, high);
            QuickSort(arry, low, pos - 1);
            QuickSort(arry, pos + 1, high);
            System.out.println(Arrays.toString(arry));
        }
    }

    private static volatile Apple apple = null;

    public static Apple getInstance(){
        if (apple == null) {
            synchronized (Apple.class){
                if (apple == null) {
                    apple = new Apple();
                }
            }
        }
        return apple;
    }

    public static class SingletonHolder{
        private static final Apple INSTANCE = new Apple();

        public static Apple getInstance(){
            return SingletonHolder.INSTANCE;
        }
    }

//    private static class SingletonHolder{
//
//        private static final Apple INSTANCE = new Apple();
//
//
//
//    }



    class StackQueue extends B{

        Stack<Integer> stack1 = new Stack<>();

        Stack<Integer> stack2 = new Stack<>();

        void push(int a){
            stack1.push(a);
        }

        int pop(){
            if (stack2.empty()){
                while (!stack1.empty())
                    stack2.push(stack1.pop());
            }
            return stack2.pop();
        }

        @Override
        void c() {

        }

        @Override
        public void d() {
            super.d();
        }

    }

    abstract class B {

        abstract void c();

        protected void d(){

        }

    }



}
