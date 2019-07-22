package com.stackroute.Pe3;

import java.util.Collections;
import java.util.List;

public class ConsecutiveNumbers {
    /**
     * Checks whether a series is consecutive
     * @param series
     * @return Returns true if the series is consecutive
     */
    boolean isNumbersConsecutive(List<Long> series) {
        if (series == null || series.isEmpty()) {
            System.out.println("Invalid Input");
            return false;
        }
        Collections.sort(series);
        for (int i = 0; i < series.size() - 1; i++) {
            if (Math.abs(series.get(i) - series.get(i + 1)) != 1L) {
                return false;
            }
        }
        return true;
    }
}
