package com.twu.diamond;

import com.twu.triangle.HorizontalLine;

public class Diamond {
    public static void main(String[] args) {
        System.out.println(new Diamond(3));
    }

    private String[] rows;
    private int size;

    public Diamond(int size) {
        this.size = size;
    }

    private String getRow(int rowNumber) {
        StringBuilder sb = new StringBuilder();
        if (rowNumber < size) {
            int leadingSpaces = size - rowNumber - 1;
            int numberStars = rowNumber * 2 + 1;
            for (int i = 0; i < leadingSpaces; i++) {
                sb.append(" ");
            }
            sb.append(new HorizontalLine(numberStars));
            return sb.toString();
        } else {
            int maxRow = 2 * (size - 1);
            return getRow(maxRow - rowNumber);
        }
    }

    public int getSize() {
        return size;
    }

    public String[] getRows() {
        if (rows == null) {
            int rowCount = size * 2 - 1;
            rows = new String[rowCount];
            for (int i = 0; i < rows.length; i++) {
                rows[i] = getRow(i);
            }
        }
        return rows;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (String row : getRows())  {
            sb.append(row);
            sb.append("\n");
        }

        return sb.toString();
    }
}
