package com.twu.triangle;

public class VerticalLine {
    public static void main(String[] args) {
        System.out.println(new VerticalLine(3));
    }

    private int size;
    private StringBuilder sb = new StringBuilder();

    public VerticalLine(int size) {
        this.size = size;
    }

    public String toString() {
        for (int i = 0; i < size; i++) {
            sb.append("*\n");
        }
        return sb.toString();
    }
}
