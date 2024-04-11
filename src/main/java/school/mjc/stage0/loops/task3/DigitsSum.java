package school.mjc.stage0.loops.task3;
/*Write a program that will find the sum of digits of a given number
passed as a method argument. There are some tips: if you concatenate int with
string you will be able to use string.length() and iterate till the end. you
shouldn't use other String methods, but length:
 */

public class DigitsSum {
    public void printDigitsSum(int t){

        String s = t+"";
        int l = s.length();
        int k = 1;
        for (int i = 0; i < l-1; i++)
        {
            k*=10;
        }
        int sum = 0;
        for (int i = 0; i < l; i++)
        {
            sum += t/k;
            t %= k;
            k/=10;
        }
        System.out.println(sum);
    }
}
