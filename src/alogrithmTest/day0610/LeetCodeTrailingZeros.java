package alogrithmTest.day0610;

/**
 *  Description
 *  Write an algorithm which computes the number of trailing zeros in n factorial.
 *  Example
        11! = 39916800, so the out should be 2
        Challenge
        O(log N) time
 */
public class LeetCodeTrailingZeros {

    /**
     *   尾数为0 需要乘10  = 2 * 5
     *   1 * 2 * 3 * 4 *5 * 6 * 7......* n
     *   判断 n/5 取整 的结果可以得知 n 以内有多少5的倍数
     *   由于 还有 25 = 5 * 5 ，750 = 5 * 5 * 2  这样的情况存在
     *   所以在商的基础上循环除5，直到最小公约数不存在5为止
     *
     * @param n
     * @return
     */
    public long solution(long n){
        long sum = 0;
        while(n != 0){
            sum += n / 5;
            n /= 5;
        }
        return sum;
    }

    public static void main(String[] args) {
        long re = new LeetCodeTrailingZeros().solution(11);
        System.out.println(re);
    }
}
