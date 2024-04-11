package school.mjc.stage0.loops.task3;
/*1. Range sum.
Write a program that will print the sum between numbers given as method arguments:


*/
public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {

        for (int i = firstBoarder, sum = 0; i <=secondBoarder; i++)
            sum +=i;
    }
}
