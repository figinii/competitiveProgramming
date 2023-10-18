package dynamicProgramming.fibonacci;

public class canonicalFibonacci extends fibonacci{
    public canonicalFibonacci(long num){
        this.num = num;
        this.relFib = fib(num);
    }


    private long fib(long n){
        if(n<= 2)
            return n;
        else
            return fib(n-1) + fib(n-2);
    }
}
