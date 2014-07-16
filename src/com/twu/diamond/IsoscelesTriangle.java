package com.twu.diamond;

import com.twu.triangle.HorizontalLine;

public class IsoscelesTriangle {
    public static void main(String [] args) {
        System.out.println(new IsoscelesTriangle(3));
    }

    private int rows;
    private StringBuilder sb = new StringBuilder();

    public IsoscelesTriangle(int rows) {
        this.rows = rows;
    }

    public String toString() {
        int leadingSpaces;
        int numberStars;
        for (int i = 1; i <= rows; i++) {
            leadingSpaces = rows - i;
            numberStars = i * 2 - 1;
            for (int j = 0; j < leadingSpaces; j++) {
                sb.append(" ");
            }
            sb.append(new HorizontalLine(numberStars));
            sb.append("\n");
        }

        return sb.toString();
    }
}
