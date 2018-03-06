import java.util.*;

/**
 * Created by teng on 17/11/9.
 */
public class TwoTree {





    public Node init() {
        //注意必须逆序建立，先建立子节点，再逆序往上建立，因为非叶子结点会使用到下面的节点，
        // 而初始化是按顺序初始化的，不逆序建立会报错
        Node M = new Node(99, null, null);
        Node J = new Node(8, null, null);
        Node H = new Node(4, null, null);
        Node G = new Node(2, null, null);
        Node F = new Node(7, null, J);
        Node E = new Node(5, H, null);
        Node D = new Node(1, null, G);
        Node C = new Node(9, F, M);
        Node B = new Node(3, D, E);
        Node A = new Node(6, B, C);
        return A;   //返回根节点
    }


    public void printNode(Node node){
        System.out.print(node.getDate());
    }


    public void traversal(Node root){
        //TODO 先序遍历
//        printNode(root);
        if (root.getLeftNode() != null){
            traversal(root.getLeftNode());
        }

        //TODO 中序遍历
//        printNode(root);

        if (root.getRightNode() != null){
            traversal(root.getRightNode());
        }

        //TODO 后序遍历
        printNode(root);
    }


    public int findDeep(Node A){
        int deep = 0;

        if (A != null) {
            int left = findDeep(A.leftNode);
            int right = findDeep(A.rightNode);
            deep = left > right ? left+1 : right+1;
        }
        return deep;
    }


    // TODO 二叉树第k层的节点数
    public int k_nodes(Node A , int k){
        if (A == null || k < 0){
            return 0;
        }else if (k == 0){
            return 1;
        }else {
            final int left = k_nodes(A.getLeftNode(), k - 1);
            final int right = k_nodes(A.getRightNode(), k - 1);
            System.out.println(k+"层---- > "+left+"---"+right);
            return left + right;
        }
    }


    private void hashMapTest(){
        HashMap<Object, Integer > hashMap = new HashMap<>();
        final Node key = new Node(1);
        hashMap.put(new Node(1), 1);
        hashMap.put(new Node(2), 2);
        hashMap.put(new Node(1), 3);
        hashMap.put(new Node(2), 4);
        hashMap.put(new Node(1), 5);

        final Set<Map.Entry<Object, Integer>> entries = hashMap.entrySet();

        for (Map.Entry<Object, Integer> entry : entries) {
            System.out.println(entry.getKey()+"---- > "+entry.getValue());
        }

        System.out.println(hashMap.get(key));
        System.out.println(hashMap.size());
//
//        final Iterator<Map.Entry<Object, Integer>> iterator = entries.iterator();
//        while (iterator.hasNext()){
//            final Map.Entry<Object, Integer> entry = iterator.next();
//            System.out.println(entry.getKey()+"---- > "+entry.getValue());
//        }

    }


    public static void main(String[] args) {
        TwoTree tree = new TwoTree();
        Node rootNode = tree.init();
//        tree.traversal(rootNode);
//        tree.hashMapTest();
        System.out.println("---"+tree.k_nodes(rootNode, 2));
    }



    public class Node implements Cloneable{
        private int date;
        private Node leftNode;
        private Node rightNode;


//        @Override
//        public int hashCode() {
//            return date;
//        }
//
//        @Override
//        public boolean equals(Object obj) {
//            return super.equals(obj);
//        }

        public Node(int date) {
            this.date = date;
        }

        public Node(int date, Node leftNode, Node rightNode) {
            this.date = date;
            this.leftNode = leftNode;
            this.rightNode = rightNode;
        }

        public int getDate() {
            return date;
        }

        public void setDate(int date) {
            this.date = date;
        }

        public Node getLeftNode() {
            return leftNode;
        }

        public void setLeftNode(Node leftNode) {
            this.leftNode = leftNode;
        }

        public Node getRightNode() {
            return rightNode;
        }

        public void setRightNode(Node rightNode) {
            this.rightNode = rightNode;
        }
    }

}
