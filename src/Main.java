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
        List<Integer> list = new ArrayList<>(List.of(7,12,9,11,3,6,7,2,1,6));
        System.out.println(MyArrays.bubblesort(list));
        System.out.println("=======================");
        System.out.println(MyArrays.selectionsort(list));
}
}
