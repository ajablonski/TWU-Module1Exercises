package com.twu.triangle;

public class RightTriangle {
    public static void main(String[] args) {
        System.out.println(new RightTriangle(8));

    }

    private int size;
    private StringBuilder sb = new StringBuilder();

    public RightTriangle(int size) {
        this.size = size;
    }

    public String toString() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
