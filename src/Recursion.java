public class Recursion {

    // Fibonacci by loop
    public static void FibonacciLoop(int n) {
        int fib1 = 0;
        int fib2 = 1;
        System.out.println(fib1);
        System.out.println(fib2);
        for (int i = 0; i < n-1; i++) {
            int newfibo = fib1 + fib2;
            System.out.println(newfibo);
            fib1 = fib2;
            fib2 = newfibo;
        }
    }

    // Fibonacci by recursion
    static int fibo1 = 0;
    static int fibo2 = 1;
    static int count = 2;
    public static void FibonacciRec(int n) {
        if (count < n){
            int newfibo = fibo1 + fibo2;
            System.out.println(newfibo);
            fibo1 = fibo2;
            fibo2 = newfibo;
            count += 1;
            FibonacciRec(n);
        }
    }

    // Finding The nth Fibonacci number
    public static int FibonacciNum(int n){
        if(n<=1){
            return n;
        }
        else{
            return FibonacciNum(n-1)+FibonacciNum(n-2);
        }
    }

    public static int RecArraySum(int[] array, int index){
        if(index< array.length){
            return array[index]+ RecArraySum(array, index+1);
        }
        else{
            return 0;
        }
    }

    public static int RecursiveSearch(int[] array, int target, int index){
        if (index >= array.length){
            return -1;
        }
        if(array[index]==target){
            return index;
        }
        return RecursiveSearch(array, target,index+1);
    }
}

