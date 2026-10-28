import java.util.List;
import java.util.Objects;

public class DoubleInt {
    public static boolean isdup(List<Integer> array){
        for(int i=0; i<array.size();i++){
            for(int j=i+1; j<array.size();j++){
                if(Objects.equals(array.get(i), array.get(j))){
                    return true;
                }
            }
        }
        return false;
    }
}
