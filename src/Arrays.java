import java.util.List;

public class Arrays {
    public static int min(List<Integer> array){
        int mini = array.getFirst();
        for(int elm : array){
            if(elm<mini){
                mini = elm;
            }
        }
        return mini;
    }
}
