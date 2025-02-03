package hands_on_lecture_2;

import java.util.ArrayList;
import java.util.List;

public class spiral_matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        
        // checks if matrix is empty/null
        if (matrix == null || matrix.length == 0) {
            return res;
        }
        
        int rows = matrix.length, cols = matrix[0].length;
        int left = 0, right = cols-  1, top = 0, bottom = rows - 1;

        // iterate while there are layers to traverse
        while (left <= right && top <= bottom) {
            // traverse left to right for top row
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            top++; // move top boundary down

            // traverse top to bottom on right column
            for (int i = top; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            right--; // move right boundary left

            // check if there are remaining rows to traverse
            if (top <= bottom) {
                // traverse from right to left along the bottom row
                for (int i = right; i >= left; i--) {
                    res.add(matrix[bottom][i]);
                }
                bottom--; // move bottom boundary up
            }

            // check if there are remaining columns to traverse
            if (left <= right) {
                // traverse from bottom to top along left column
                for (int i = bottom; i >= top; i--) {
                    res.add(matrix[i][left]);
                }
                left++; // move left boundary right
            }
        }

        return res;
    }
}