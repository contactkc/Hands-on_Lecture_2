package test_cases;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class pascal_triangleTest {
    hands_on_lecture_2.pascal_triangle triangle = new hands_on_lecture_2.pascal_triangle();

    @Test
    void testGenerate_oneRow() {
        assertEquals(List.of(List.of(1)), triangle.generate(1));
    }

    @Test
    void testGenerate_twoRows() {
        assertEquals(List.of(
                List.of(1),
                List.of(1, 1)
        ), triangle.generate(2));
    }

    @Test
    void testGenerate_fiveRows() {
        assertEquals(List.of(
                List.of(1),
                List.of(1, 1),
                List.of(1, 2, 1),
                List.of(1, 3, 3, 1),
                List.of(1, 4, 6, 4, 1)
        ), triangle.generate(5));
    }
}