package org.vistula.homework.day2.ddd.original;

public class PercentGrader {
    private int percentage;

    public PercentGrader(int percentage) {
        this.percentage = percentage;
    }

    public int WhatGradeIsIt() {
        if (percentage >= 95 && percentage <= 100) {
            return 6;
        } else if (percentage >= 85 && percentage <= 95) {
            return 5;
        } else if (percentage >= 75 && percentage <= 85) {
            return 4;
        } else if (percentage >= 65 && percentage <= 75) {
            return 3;
        } else if (percentage >= 55 && percentage <= 65) {
            return 2;
        } else if (percentage >= 0 && percentage <= 55) {
            return 1;
        } else return 0;
    }
}