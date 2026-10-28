import java.util.List;

public class MyArrays {

    public static int min(List<Integer> array){
        int mini = array.getFirst();
        for(int elm : array){
            if(elm<mini){
                mini = elm;
            }
        }
        return mini;
    }

    public static List<Integer> bubblesort(List<Integer> array){
        for(int i=0; i< array.size()-1; i++) {
            for (int j=0; j< array.size()-i-1; j++) {
                if (array.get(j) > array.get(j+1)) {
                    int temp = array.get(j);
                    array.set(j, array.get(j + 1));
                    array.set(j + 1, temp);
                }
            }
        }
        return array;
    }
}
