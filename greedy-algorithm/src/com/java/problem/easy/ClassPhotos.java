package com.java.problem.easy;

import java.util.ArrayList;
import java.util.Collections;

public class ClassPhotos {

    // Time: O(nlog(n)) | Space: O(1)
    public boolean classPhotos(
            ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
        Collections.sort(redShirtHeights);
        Collections.sort(blueShirtHeights);

        int redLastStudent = redShirtHeights.get(redShirtHeights.size() - 1);
        int blueLastStudent = blueShirtHeights.get(blueShirtHeights.size() - 1);
        if (redLastStudent > blueLastStudent) {
            for (int index = 0; index < redShirtHeights.size(); index++) {
                if (redShirtHeights.get(index) <= blueShirtHeights.get(index)) {
                    return false;
                }
            }
        } else {
            for (int index = 0; index < redShirtHeights.size(); index++) {
                if (redShirtHeights.get(index) >= blueShirtHeights.get(index)) {
                    return false;
                }
            }
        }
        return true;
    }
}
