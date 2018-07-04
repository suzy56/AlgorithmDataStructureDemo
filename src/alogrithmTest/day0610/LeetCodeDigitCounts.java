package alogrithmTest.day0610;

public class LeetCodeDigitCounts {

    /*
 * @param : An integer
 * @param : An integer
 * @return: An integer denote the count of digit k in 1..n
 */
    public int digitCounts(int k, int n) {
        int i = 1;
        int carry = 0;
        int sum = 0;
        while(n - (int)Math.pow(10,i) > 0){
            i ++;
        }
        int j = 0;
        while(i >= 0){
            carry =n / (int)Math.pow(10,i);
           // System.out.println((int)Math.pow(10,i));
            //System.out.println(n /(int)Math.pow(10,i));
            if(carry <= 1 && n >= (int)Math.pow(10,i-1)*k ){
                int sub = n -  (int)Math.pow(10,i-1)*k;
                if(sub > (int)Math.pow(10,i-1)){
                    sum += (int)Math.pow(10,i-1);
                }
                if(n == (int)Math.pow(10,i)){
                    sum += sub + 1;
                }
            }else{
                sum += (int)Math.pow(10,i-1)*carry;
            }
            i--;
            j++;

        }

        if(n % 10 >= k && j > 1){
            sum += 1;
        }

        return sum;
    }

    public static void main(String[] args) {
        int ss = new LeetCodeDigitCounts().digitCounts(1,100);
        System.out.println(ss);
    }
}
