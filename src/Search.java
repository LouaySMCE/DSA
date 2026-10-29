public class Search {
    public static int BinarySearch(int target , int[] array){
        int left = 0;
        int right = array.length -1;

        while(left <= right) {      // Pattern: increaminting right and left => while loop to compare both
            int mid = (left + right) / 2;
            if(array[mid]==target){
                return mid;
            }
            else if(array[mid]<target){
                left = mid +1;
            }
            else if(array[mid]>target){
                right = mid -1;
            }
        }
        return -1;
}

    public static boolean IsPrime (int n){
        // we will just ignore 1, it's not a prime number
        if(n<=2){
            return true;
        }
        int nRoot = (int) Math.sqrt(n);
        for(int i=2; i<=nRoot; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean IsPrime_opti (int n){
        // we will just ignore 1, it's not a prime number
        if(n<=3){
            return true;
        }
        if(n%2==0 || n%3==0){
            return false;
        }

        int nRoot = (int) Math.sqrt(n);

        for(int i=5; i<= nRoot; i=i+6){
            if(n%i==0 || n%(i+2)==0){  //we skip all even numbers and every 3 and 6 multiples
                return false;
            }
        }
        return true;
    }
}
