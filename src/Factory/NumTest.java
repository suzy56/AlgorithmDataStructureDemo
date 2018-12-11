
import java.util.*;

public class NumTest{



    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){

            String str = sc.nextLine();

            str =MarkNum(str);

            System.out.println(str);

        }

    }



    public static String MarkNum(String pInStr) {

        char[] arr = pInStr.toCharArray();

        StringBuffer sb = new StringBuffer();
        int lastflag = 0;  // 0 数字 1字母
        for (int i = 0; i < arr.length; i++) {

            if ((arr[i] - '0' >= 0) && (arr[i] - '0' <= 9)) { // 判断为数字

                if(lastflag == 1){
                    sb.append("*"+ arr[i]);
                }
                sb.append(arr[i]);
                lastflag = 0;
            }else if(lastflag == 0){
                lastflag = 1;
                sb.append("*"+ arr[i]);  //两边都加上*

            }else{
                sb.append(arr[i]);
                lastflag = 1;
            }



        }

        return sb.toString();  //两个数字中间有** 替换掉

    }



}
