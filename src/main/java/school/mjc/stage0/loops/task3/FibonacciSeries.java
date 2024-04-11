package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        System.out.println(0);
        System.out.println(1);
        for (int i =0,k = 1; k < lastFibonacci; k++, i++)
        {
            System.out.println(i+k);
        }
    }
}
