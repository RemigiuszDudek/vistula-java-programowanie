package org.vistula.homework.day2.aaa.corrected;

public class PercentGrader {
    double percent;

    public PercentGrader(double percent) {
        this.percent = percent;
    }

    public int grade() {
        if (percent > 95 && percent <= 100) {
            return 6;
        } else if (percent > 85 && percent <= 95) {
            return 5;
        } else if (percent > 75 && percent <= 85) {
            return 4;
        } else if (percent > 65 && percent <= 75) {
            return 3;
        } else if (percent > 55 && percent <= 65) {
            return 2;
        } else if (percent >= 0 && percent <= 55) {
            return 1;
        } else {
            return 0;
        }
    }
}
