import com.sun.jdi.Value;

import java.security.Key;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class StringOpr {
    public static boolean AnagramCheck(String s, String t){
        char[] s2 = s.toCharArray();
        char[] t2 = t.toCharArray();

        if(s2.length!=t2.length){
            return false;
        }
        // 1st Bubble sorting
        for(int i=0; i< s2.length-1; i++){
            for(int j=0; j< s2.length -1-i; j++){
                if(s2[j+1]<s2[j]){
                    char temp = s2[j];
                    s2[j] = s2[j+1];
                    s2[j+1] = temp;
                }
            }
        }
        // 2nd Bubble sorting
        for(int i=0; i< t2.length-1; i++){
            for(int j=0; j< t2.length -1-i; j++){
                if(t2[j+1]<t2[j]){
                    char temp = t2[j];
                    t2[j] = t2[j+1];
                    t2[j+1] = temp;
                }
            }
        }

        return Arrays.equals(s2, t2);

    }

    public static boolean AnagramCheckHashMap(String s, String t){
        HashMap<String, Integer> s2_counter = new HashMap<String, Integer>();
        HashMap<String, Integer> t2_counter = new HashMap<String, Integer>();
        char[] s2 = s.toCharArray();
        char[] t2 = t.toCharArray();

        if(s2.length!=t2.length){
            return false;
        }

        for(char elm : s2){
            if(!s2_counter.containsKey(String.valueOf(elm))) {
                s2_counter.put(String.valueOf(elm), 1);
            }
            else{
                s2_counter.put(String.valueOf(elm), s2_counter.get(String.valueOf(elm)) + 1);
            }
        }

        for(char elm : t2){
            if(!t2_counter.containsKey(String.valueOf(elm))) {
                t2_counter.put(String.valueOf(elm), 1);
            }
            else{
                t2_counter.put(String.valueOf(elm), t2_counter.get(String.valueOf(elm)) + 1);
            }
        }

        return s2_counter.equals(t2_counter);
    }
}
