package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        // Parse strings to integers
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);

        // Calculate function values
        int funcValueX = calculateFunction(x);
        int funcValueY = calculateFunction(y);

        // If function values are different, sort based on function values
        if (funcValueX != funcValueY) {
            return Integer.compare(funcValueX, funcValueY);
        } else {
            // If function values are equal, sort elements in ascending order
            return Integer.compare(x, y);
        }
    }

    // Function to calculate 5x^2 + 3
    private int calculateFunction(int x) {
        return 5 * x * x + 3;
    }
}
