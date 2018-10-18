package alogrithmTest.standard_answer;

public class LintCodeA_plus_B {

    /**
     * 计算两数之和不使用运算符
     * 知识点：全加器和半加器
     */

    public static int aplusb(int a, int b) {
        while (b != 0) {
            int _a = a ^ b;
            int _b = (a & b) << 1;
            a = _a;
            b = _b;
        }
        return a;

    }

    /**
     * 计算两数之差不使用运算符
     * 知识点：计算机补码，表示负数
     */

    public static int asubstrb(int a,int b){
        b = ~b + 1;
        return aplusb(a,b);
    }

    public static void main(String[] args) {
        int sum = aplusb(100,-10);
        int sub = asubstrb(98,-99);
        System.out.println(sum);
        System.out.println(sub);
    }

}
