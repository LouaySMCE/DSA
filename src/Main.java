import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        FibonacciClass.FibonacciLoop(5);
        System.out.println(FibonacciClass.FibonacciNum(6));
        System.out.println(0);
        System.out.println(1);
        FibonacciClass.FibonacciRec(6);
        */
        List<Integer> list = new ArrayList<>(List.of(7,12,9,11,3,0));
        System.out.println(Arrays.min(list));
}
}
