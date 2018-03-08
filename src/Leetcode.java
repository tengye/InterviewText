import java.util.*;

/**
 * Created by teng on 17/12/18.
 */
public class Leetcode {

    public static void main(String[] args) {
        Leetcode leetcode = new Leetcode();
        int[] array = {1,2,3,4,5,6,7,8,9};
        final int i = leetcode.erFenFind(array, 9);
        final int b = Apple.b;
        System.out.println("-- "+i);
    }

    // 截取相同的最长字符串
    public int lengthOfLongestSubstring(String s) {
        int len;
        if (s == null || (len = s.length()) == 0) return 0;
        int preP = 0, max = 0;
        int[] hash = new int[128];
        for (int i = 0; i < len; ++i) {
            char c = s.charAt(i);
            if (hash[c] > preP) {
                preP = hash[c];
            }
            int l = i - preP + 1;
            hash[c] = i + 1;
            if (l > max) max = l;
        }
        return max;
    }

    // 二分法查找
    public int erFenFind(int[] array, int key){
        int start = 0;
        int end = array.length + 1;

        while (start <= end){
            int mid = (start + end)/2;
            if (key < mid){
                end = mid;
            }else if (key > mid){
                start = mid;
            }else {
                return mid;
            }
        }
        return -1;
    }

    // 最小栈的实现
    class MinStack{

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> minStack = new Stack<>();

        public void push(int a){
            stack.push(a);
            if (minStack.empty() || minStack.peek() <= a){
                minStack. push(a);
            }
        }

        public void pop(){
            if (stack.peek().equals(minStack.peek())){
                minStack.pop();
            }
            stack.pop();
        }

        public void min(){
            minStack.peek();
        }
    }
    // 获取二叉树的深度
    public int treeDeep(TwoTree.Node node){
        int deep = 0;

        if (node != null){
            int left = treeDeep(node.getLeftNode());
            int right = treeDeep(node.getRightNode());
            deep = left > right ? left+1:right+1;
        }
        return deep;
    }


    // 获取二叉树第K层的节点数
    public int treeK(TwoTree.Node node, int k){

        if (node == null || k < 0){
            return 0;
        }else if (k == 1){
            return 1;
        }else {
            int left = treeK(node.getLeftNode(), k-1);
            int right = treeK(node.getRightNode(), k-1);
            return left+right;
        }
    }
    // 二叉树遍历
    public void treeFor(TwoTree.Node node){

        // 前序
        if (node.getLeftNode() != null){
            treeFor(node.getLeftNode());
        }

        // 中序

        if (node.getRightNode() != null){
            treeFor(node.getRightNode());
        }

        // 后序
    }

    // 两个有序链表合并成一个有序链表


}
