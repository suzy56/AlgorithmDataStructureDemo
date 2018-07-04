package alogrithmTest.day0610;

public class LeetCodeDigitCounts {

    /*
 * @param : An integer
 * @param : An integer
 * @return: An integer denote the count of digit k in 1..n
 */

    /**
     * 从 k开始到n循环计算每个数字中包含k的个数，最后累加起来
     * @param k
     * @param n
     * @return
     */

    public int digitCounts(int k, int n) {
        // write your code here
        int cnt = 0;
        for (int i = k; i <= n; i++) {
            cnt += singleCount(i, k);
        }
        return cnt;
    }

    public int singleCount(int i, int k) {
        if (i == 0 && k == 0)
            return 1;
        int cnt = 0;
        while (i > 0) {
            if (i % 10 == k) {
                cnt++;
            }
            i = i / 10;
        }
        return cnt;
    }


    public static void main(String[] args) {
        int ss = new LeetCodeDigitCounts().digitCounts(2,302);
        System.out.println(ss);
    }
}
