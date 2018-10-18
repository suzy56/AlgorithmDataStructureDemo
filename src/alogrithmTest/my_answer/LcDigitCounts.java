package alogrithmTest.my_answer;

/**
 * 计算从k 到 n 包含数字k的个数
 *
 * 首先拆解成每一个数字去计算包含k的个数
 * 再把每个数字的个数累加起来
 *
 */


public class LcDigitCounts {

    public int digitAllCounts(int k, int n){
        int cnt = 0;
        for(int i=k; i<=n; i++){
            cnt += digitSingleCounts(k,i);
        }
        return cnt;
    }

    public int digitSingleCounts(int k,int i){
        int cnt = 0;
        if(k == 0 && i ==0){
            cnt = 1;
        }
        while ( i > 0 ){
            if(i % 10 == k){
                cnt += 1;
            }
            i = i/10;
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(new LcDigitCounts().digitAllCounts(0,0));
    }

}
