package dynamicProgramming.fibonacci;

public class Main {
    public static void main(String[] args){
        fibonacci a = new memoizationFibonacci(10);
        System.out.println(a.relFib);
    }

}
