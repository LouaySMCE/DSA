import java.util.List;
import java.util.Objects;
import java.util.HashSet;
import java.util.Set;

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

    public static boolean isdup_hash(List<Integer> array){
        Set<Integer> seen = new HashSet<>();
        for(int elm:array){
            if (!seen.add(elm)){
                return true;
            }
        }
        return false;
    }

}
