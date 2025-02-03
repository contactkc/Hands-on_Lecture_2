package test_cases;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class spiral_matrixTest {
    hands_on_lecture_2.spiral_matrix sm = new hands_on_lecture_2.spiral_matrix();

    @Test
    void testSingleElementMatrix() {
        int[][] matrix = {{1}};
        assertEquals(List.of(1), sm.spiralOrder(matrix));
    }

    @Test
    void testSingleRowMatrix() {
        int[][] matrix = {{1, 2, 3, 4}};
        assertEquals(List.of(1, 2, 3, 4), sm.spiralOrder(matrix));
    }

    @Test
    void testSingleColumnMatrix() {
        int[][] matrix = {
                {1},
                {2},
                {3},
                {4}
        };
        assertEquals(List.of(1, 2, 3, 4), sm.spiralOrder(matrix));
    }

    @Test
    void testSquareMatrix() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        assertEquals(List.of(1, 2, 3, 6, 9, 8, 7, 4, 5), sm.spiralOrder(matrix));
    }

    @Test
    void testRectangularMatrix() {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        assertEquals(List.of(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7), sm.spiralOrder(matrix));
    }

    @Test
    void testTallMatrix() {
        int[][] matrix = {
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8}
        };
        assertEquals(List.of(1, 2, 4, 6, 8, 7, 5, 3), sm.spiralOrder(matrix));
    }
}