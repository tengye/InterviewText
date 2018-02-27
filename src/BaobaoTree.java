import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by teng on 16/5/20.
 */
public class BaobaoTree {


    public static void main(String[] args) {


        double v = 26461f / 60095f;

        long t = 1492612098000l;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ssss"+null);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Date date = new Date(t);

        final String format;
        format= simpleDateFormat.format(date);
        System.out.print("format------>"+format+"\n");
        //        int[] nums = {3,1,5,6,2};
//
//        String s = "bca128762868749hkdjwhkhjfkd098098*((^*&^*%&d";
//        for (int i = 0; i < nums.length; i++) {
//
//            System.out.print(nums[i]);
//        }
//
//        Arrays.sort(nums);
//        System.out.print("-----" + "\n");
//        for (int i = 0; i < nums.length; i++) {
//
//
//        }


//        b , c , a , 1 , 2 , 8

//        int number = 0;
//        int english = 0;
//        int other = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//
//            char a = s.charAt(i);
//
//            if (a >= 0 || a <= 9){
//
//                number++;
//
//            }else if( a )
//
//
//
//        }



//        System.out.print(s.charAt(2));




//        int aa = 0x01110001;
//        int aa = -11;
//        0000 1011
//                1001
//        System.out.print((aa >> 2) );
        List<Integer> carList = new ArrayList<>();

        carList.add(1);

        for (int i = 0; i < carList.size(); i++) {

            int a = carList.get(i);
            System.out.println("a = " + a);
        }


        for (Integer integer : carList) {

            System.out.println("integer = " + integer);

        }

    }

    private static void textList() {
        List lst = new ArrayList();

        String str = "1";

        lst.add("a");

        int number = 2;

        operate(lst, str , number);

        for (int i = 0; i < lst.size(); i++) {
            System.out.print(i+": "+lst.get(i) + "\n");
        }


        System.out.println("List = "+lst+" number = " + number);

        System.out.println(str);
    }

    public static void operate(List list, String str, int number) {
        str.replace("1", "2");

        list.add("b");

        number += 1;

        System.out.println("operate list = " + list+" "+" number = " + number);

        list = new ArrayList();

        System.out.println("operate list = " + list);

        list.add("c");




    }


}
