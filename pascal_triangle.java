package hands_on_lecture_2;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class pascal_triangle {
    // hashmap to store previous result of triangle results for memoization
    private Map<Integer, List<List<Integer>>> map = new HashMap<>() {{
        // base case with 1 row of pascal triangle
        put(1, List.of(List.of(1)));
    }};

    public List<List<Integer>> generate(int numRows) {
        // checks if result for numRows is already computed and in hashmap
        List<List<Integer>> hash = map.getOrDefault(numRows, null);
        
        // returns cached result if available
        if (hash != null) {
            return hash;
        }

        // recursively generates the previous rows of triangle
        List<List<Integer>> prev = generate(numRows - 1);
        
        // gets last row to compute new row
        List<Integer> lastRow = prev.get(numRows - 2);
        List<Integer> newRow = new ArrayList<>(numRows);
        
        // first element is always = 1
        newRow.add(1);

        // loop to compute middle elements through summation of adjacent elements from previous rows
        for (int i = 1; i < numRows - 1; i++) {
            newRow.add(lastRow.get(i - 1) + lastRow.get(i));
        }
        // last element is always = 1
        newRow.add(1);

        // creates new list to store updated triangle
        List<List<Integer>> res = new ArrayList<>(prev);
        res.add(newRow);

        // store the computed result in the hashmap
        map.put(numRows, res);

        return res;
    }
}