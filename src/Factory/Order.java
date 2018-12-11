package Factory;

import java.text.SimpleDateFormat;
import java.util.*;

public class Order {
    public static String getOrderIdByUUId() {

        int h1 =  UUID.randomUUID().toString().hashCode();
        int hashCodeV=  UUID.randomUUID().toString().hashCode();
        if (hashCodeV < 0) {//有可能是负数
            hashCodeV = -hashCodeV;
        }
        if (h1 < 0) {//有可能是负数
            h1 = -h1;
        }
        // 0 代表前面补充0
        // 4 代表长度为4
        // d 代表参数为正数型
        return String.format("%010d", h1) + String.format("%010d", hashCodeV);
    }

    public static String getRandomFileName() {


        String str = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        int rannum = (int) (new Random().nextDouble() * (999999 - 100000 + 1)) + 100000;// 获取6位随机数
        return str + rannum;// 
    }

    public static String rotateString(char[] str, int offset) {
        String a = new String(str);
        String t = a.substring((offset % a.length()),a.length());
        String m = a.substring(0,(offset % a.length()));
        return  t + m;
    }


    public static char[] rotateString2(char[] str, int offset) {
        // write your code here
        if (str == null || str.length == 0)
            return null;

        offset = offset % str.length;
        reverse(str, 0, str.length - offset - 1);
        reverse(str, str.length - offset, str.length - 1);
        reverse(str, 0, str.length - 1);
        return str;
    }

    public static void reverse(char[] str, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
        }
    }
    public static void main(String[] args) {
        char[] str = new char[5];
        str[0] = 'a';
        str[1] = 'b';
        str[2] = 'c';
        str[3] = 'd';
        str[4] = 'e';
        //str[5] = 'g';
        System.out.println(rotateString2(str,2));
/*
        Set coll = new HashSet<String>();
        for (int i = 0 ; i < 10; i++){
            String t = getRandomFileName();
           // System.out.println(t);
            if(coll.contains(t)){
                System.out.println(t);
            } 20181 20317 33 42 7 20295
            coll.add(t); //2018 1203 0531 50 35 3959249
        }
        System.out.println(coll.size());*/
    }
}
