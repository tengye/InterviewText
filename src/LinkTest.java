import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;

/**
 * Created by teng on 17/11/12.
 */
public class LinkTest {

    private static Note note1;
    private static Note note2;

    public static void main(String[] args) {
        LinkTest linkTest = new LinkTest();
        Note head = linkTest.init();
        Note head1 = linkTest.init1();

        Note[] notes = {head, head1};
        Note note = linkTest.mergeLists(notes);

        System.out.println(note.data+"----");
    }

    public Note init(){
        Note head = new Note();
        head.data = 1;
        note1 = new Note();
        note1.data = 2;
        head.next = note1;
        note2 = new Note();
        note2.data = 3;
        note1.next = note2;
        return head;
    }

    public Note init1(){
        Note head = new Note();
        head.data = 2;
        note1 = new Note();
        note1.data = 4;
        head.next = note1;
        note2 = new Note();
        note2.data = 6;
        note1.next = note2;
        return head;
    }


    // 删除链表中指点节点
    public Note deleteNote(Note header, Note note){
        if (header == null){
            return header;
        }
        // 如果要删除的是尾结点
        if (note.next == null){
            Note temp = new Note();
            temp.data = header.data;
            while (header.next != note){
                // 找到要删除节点的上一个节点
                temp.next = header.next;
                header = header.next;
            }
            return temp;
        }
        // 如果要删除的是头节点
        else if (note == header){
            header = header.next;
        }
        // 如果要删除的是中间节点
        else{
            // 找到要删除节点的下一个节点
            Note q = note.next;
            note.data = q.data;
            note.next = q.next;
        }

        return header;
    }

    //TODO 链表中删除指定数值的节点
    public static Note deleteValueNote1(Note header, int number){
        Stack<Note> stack = new Stack<>();
        while (header != null){
            if (header.data != number){
                stack.push(header);
            }
            header = header.next;
        }

        while (!stack.isEmpty()){
            // 从最后一个节点开始将节点组合成链表
            stack.peek().next = header;
            header = stack.pop();
        }
        return header;
    }

    public static void deleteValueNote2(Note header, int number){

        while (header != null){
            if (header.data == number){
                Note q = header.next;
                header.data = q.data;
                header.next = q.next;
            }
            header = header.next;
        }
    }
    //TODO 删除指定数值的节点
    public Note deleteNote(Note head, int number){
//         如果前面几个节点都是要删除的，找到第一个不用删除的节点
        while (head != null){
            if (head.data != number){
                break;
            }
            head = head.next;
        }

        Note pre = head;
        Note cur = head;

        // 删除后面节点中需要删除的节点
        while (cur != null){
            if (cur.data == number){
                pre.next = cur.next;
            }else {
                pre = cur;
            }
            cur = cur.next;
        }

        return head;
    }

    // 链表反转
    public Note resvert(Note head){
        Note prev = null;
        while(head!=null){
            Note tmp = head.next;
            head.next = prev;
            prev = head;
            head = tmp;
        }
        return prev;
        // 递归
//        if(head==null||head.next ==null)
//            return head;
//        Note prev = resvert(head.next);
//        head.next.next = head;
//        head.next = null;
//        return prev;
    }

    class Note{

        public Note() {
        }

        public Note(int data) {
            this.data = data;
        }

        Note next;
        int data;

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Note getNext() {
            return next;
        }

        public void setNext(Note next) {
            this.next = next;
        }
    }

    class StackLink{
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();


        public void push(int a){
            stack1.push(a);
        }

        public int pop(){
            if (stack2.empty()){
                while (!stack1.empty()){
                    stack2.push(stack1.pop());
                }
            }

            return stack2.pop();
        }
    }

    private Note re(Note header){
        Note pre = null;
        while (header != null){
            Note temp = header.getNext();
            header.next = pre;
            pre = header;
            header = temp;
        }
        return pre;
    }

    // 合并k个有序链表
    public Note mergeLists(Note[] nodeList){
        if (nodeList == null || nodeList.length == 0){
            return null;
        }
        // PriorityQueue中的元素在逻辑上构成了一棵完全二叉树，但是在实际存储时转换为了数组保存在内存中，
        // 而我们的PriorityQueue继承了接口Queue，表名这是一个队列，
        // 只是它不像普通队列（例如：LinkedList）在遍历输出的时候简单的按顺序从头到尾输出，
        // PriorityQueue总是先输出根节点的值，然后调整树使之继续成为一棵完全二叉树
        // 这样每次输出的根节点总是整棵树优先级最高的，要么数值最小要么数值最大。
        // 大根堆和小根堆
        PriorityQueue<Note> min = new PriorityQueue<>(1, new Comparator<Note>() {
            @Override
            public int compare(Note o1, Note o2) {
                return o1.data - o2.data;
            }
        });


        for (Note note : nodeList){
            if (note != null){
                min.add(note);
            }
        }

        Note header = new Note();
        Note cur = header;

        while (!min.isEmpty()){
            // poll() 方法用于检索并移除此队列的头，则返回null，如果此队列为空。
            Note temp = min.poll();

            cur.next = temp;
            cur = cur.next;
            System.out.print(header);
            if (temp.next != null){
                min.offer(temp.next);
            }
        }

        cur.next = null;

        return header.next;
    }

    // 判断链表是否成环以及环的长度



}
