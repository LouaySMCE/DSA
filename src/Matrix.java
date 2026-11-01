import java.util.ArrayList;
import java.util.List;

public class Matrix {
    public static List<Integer> SpiralOrder(int[][] matrix){
        List<Integer> result = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {

            // Traverse right
            // Update top
            for(int i=left; i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;

            // Traverse down
            // Update right
            for(int i=top; i<= bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;

            // Traverse left
            // Update bottom
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add((matrix[bottom][i]));
                }
                bottom--;
            }

            // Traverse up
            // Update left
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }
}
