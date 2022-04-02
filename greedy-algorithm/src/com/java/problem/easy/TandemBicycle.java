package com.java.problem.easy;

import java.util.Arrays;

public class TandemBicycle {

    // Time: O(nlong(n)) | Spcae: O(1)
    public int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
        Arrays.sort(redShirtSpeeds);
        Arrays.sort(blueShirtSpeeds);

        int totalSpeed = 0;
        int redIndex, blueIndex;
        int count = redShirtSpeeds.length;
        redIndex = blueIndex = redShirtSpeeds.length - 1;

        if (fastest) {
            while (count > 0) {
                int redShirtSpeed = redShirtSpeeds[redIndex];
                int blueShirtSpeed = blueShirtSpeeds[blueIndex];
                if (redShirtSpeed >= blueShirtSpeed) {
                    totalSpeed += redShirtSpeed;
                    redIndex -= 1;
                } else {
                    totalSpeed += blueShirtSpeed;
                    blueIndex -= 1;
                }
                count -= 1;
            }
        } else {
            while (count > 0) {
                int redShirtSpeed = redShirtSpeeds[redIndex];
                int blueShirtSpeed = blueShirtSpeeds[blueIndex];
                if (redShirtSpeed >= blueShirtSpeed) {
                    totalSpeed += redShirtSpeed;
                } else {
                    totalSpeed += blueShirtSpeed;
                }
                redIndex -= 1;
                blueIndex -= 1;
                count -= 1;
            }
        }
        return totalSpeed;
    }

    // Time: O(nlong(n)) | Spcae: O(1)
    public int tandemBicycle1(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
        Arrays.sort(redShirtSpeeds);
        Arrays.sort(blueShirtSpeeds);

        int totalSpeed = 0;
        int redIndex, blueIndex;
        int count = redShirtSpeeds.length;
        redIndex = blueIndex = redShirtSpeeds.length - 1;

        if (fastest) {
            while (count > 0) {
                int redShirtSpeed = redShirtSpeeds[redIndex];
                int blueShirtSpeed = blueShirtSpeeds[blueIndex];
                if (redShirtSpeed >= blueShirtSpeed) {
                    totalSpeed += redShirtSpeed;
                    redIndex -= 1;
                } else {
                    totalSpeed += blueShirtSpeed;
                    blueIndex -= 1;
                }
                count -= 1;
            }
        } else {
            while (count > 0) {
                int redShirtSpeed = redShirtSpeeds[redIndex];
                int blueShirtSpeed = blueShirtSpeeds[blueIndex];
                totalSpeed += Math.max(redShirtSpeed, blueShirtSpeed);
                redIndex -= 1;
                blueIndex -= 1;
                count -= 1;
            }
        }
        return totalSpeed;
    }
}
