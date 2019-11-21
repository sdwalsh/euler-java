package io.mirango;

public class Problem1 {
    public static int answer() {
        return multiplesOfThreeAndFive();
    }

    private static int multiplesOfThreeAndFive() {
        int total = 0;
        for(int x = 1; x < 1000; x++) {
            if(x % 3 == 0 || x % 5 == 0) {
                total += x;
            }
        }
        return total;
    }
}
