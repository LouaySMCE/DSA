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
}
