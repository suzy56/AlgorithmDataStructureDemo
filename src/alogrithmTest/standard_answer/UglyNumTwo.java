package alogrithmTest.standard_answer;

import java.util.ArrayList;

/**
 * 设计一个算法，找出只含素因子2，3，5 的第 n 小的数。

 符合条件的数如：1, 2, 3, 4, 5, 6, 8, 9, 10, 12...
 */
public class UglyNumTwo {

    /**
     * 大于lastNumber丑数（2） * 2 = 丑数
     * 大于lastNumber丑数（3） * 3 = 丑数  =》  取最小更新 lastNumber
     * 大于lastNumber丑数（5） * 5 = 丑数
     * @param n
     * @return
     */
    public static int solution(int n){
        ArrayList<Integer> uglyList = new ArrayList<>();
        uglyList.add(1);
        int p2 = 0, p3 = 0, p5 = 0;
        //int lastNumber = 1;
        for (int i = 0; i < n ; i++) {
            int lastNumber = uglyList.get(i - 1);
            while (uglyList.get(p2) * 2 <= lastNumber ) p2++;
            while (uglyList.get(p3) * 3 <= lastNumber ) p3++;
            while (uglyList.get(p5) * 5 <= lastNumber ) p5++;
            uglyList.add(Math.min(Math.min(uglyList.get(p2) * 2 ,uglyList.get(p3) * 3 ),uglyList.get(p5) * 5 ));
            //lastNumber = uglyList.get(i+1);
        }

        return uglyList.get(n-1);
    }

    public static void main(String[] args) {
        System.out.println( solution(11));
    }
}
