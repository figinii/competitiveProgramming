package dynamicProgramming.fibonacci;

public class memoizationFibonacci extends fibonacci {
    public memoizationFibonacci(long num) {
        this.num = num;
        long[] memo = new long[(int)num];
        initializeArr(memo);
        this.relFib = fib(num, memo);
    }

    private long fib(long n, long[] arr) {
        int i = (int)(n - 1); // to compensate for arr numeration starting from 0

        if(n <= 2){
            return 1;
        }else if (arr[i] == 0) {
            arr[i] = fib(n - 1, arr) + fib(n - 2, arr);
        }
        return arr[i];
    }

    private void initializeArr(long[] arr) {
        for (long i : arr)
            i = 0;
    }
}