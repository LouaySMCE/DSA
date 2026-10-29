import com.sun.jdi.Value;
import java.security.Key;
import java.util.*;

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

    public static boolean isPalindrome(String s) {
        return isPalindrome(s, 0, s.length() - 1);
    }

    public static boolean isPalindrome(String s, int left, int right){

        if (left >= right) {
            return true;
        }

        if(s.charAt(left)!=s.charAt(right)){
            return false;
        }

        return isPalindrome(s, left +1, right -1);

    }

    public static int CharCounter(String s, char c){
        int counter =0;
        for(int i=0; i<s.length(); i++){
            if(c==s.charAt(i)){
                counter+=1;
            }
        }
        return counter;
    }

    // entire code to correct
    public static int FirstNonDupChar(String s){
        HashMap<Character, Integer> c_counter = new HashMap<>();
        List<Character> one_rec = new ArrayList<>();
        int count =1;
        for(int i=0; i<s.length(); i++){
            if(!c_counter.containsKey(s.charAt(i))){
                c_counter.put(s.charAt(i),count);
            }
            else{
                count+=1;
                c_counter.put(s.charAt(i),count);
            }
        }

        boolean all_dup = false;
        for(Integer i: c_counter.values()){
            if (i > 1) {
                all_dup = true;
                break;
            }
        }
        if(all_dup){
            return -1;
        }

        for (Map.Entry<Character, Integer> entry : c_counter.entrySet()) {  //only way I found to retrieve a key from a value
            if (entry.getValue() == 1) {
                one_rec.add(entry.getKey());
            }
        }

        int index =0;
        for(int i=0; i<s.length(); i++){
            for(char elm: one_rec){         // problem : the elements of the array may not be sorted because of the hashamap
                if(s.charAt(i)==elm){
                    index =i;
                }
            }
        }
        return index;
    }
}
