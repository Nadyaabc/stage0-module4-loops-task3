package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int a = (first<second? first:second);
        int ans = 1;
        for (int i = 1; i <= a;i++ )
        {
            if (first % i == 0 && second % i == 0) ans = i;
        }
        System.out.println(ans);
    }
}
