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

    // Better bubblesort, the looping stops if the rest of the array is sorted
    public static List<Integer> bubblesort(List<Integer> array){
        for(int i=0; i< array.size()-1; i++) {
            boolean swapped = false;   // if no values are swapped, the loop stops
            for (int j=0; j< array.size()-1-i; j++) {
                if (array.get(j) > array.get(j+1)) {
                    int temp = array.get(j);
                    array.set(j, array.get(j + 1));
                    array.set(j + 1, temp);
                    swapped = true;
                }
                }
            if(!swapped){
                break;
            }
        }
        return array;
    }

    public static List<Integer> selectionsort(List<Integer> array){
        for(int i=0;i<array.size()-1; i++){
            int minIndex = i;
            for(int j=i; j<array.size(); j++){
                if(array.get(minIndex)>array.get(j)){
                minIndex = j;}
            }
            int temp = array.get(i);
            array.set(i, array.get(minIndex));
            array.set(minIndex, temp);
        }
        return array;
    }

    public static List<Integer> insertionsort(List<Integer> array){
        for (int i = 1; i < array.size(); i++) {
            int temp = array.get(i);
            int j = i - 1;

            while (j>=0 && array.get(j) > temp) {
                array.set(j + 1, array.get(j));
                j--;
            }
            array.set(j+1, temp);
        }
        return array;
    }
}
