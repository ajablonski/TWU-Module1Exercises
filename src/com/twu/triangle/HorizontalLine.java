package com.twu.triangle;


public class HorizontalLine {
    public static void main(String[] args) {
        HorizontalLine hl = new HorizontalLine(8);
        System.out.println(hl);
    }

    private int size;
    private StringBuilder sb = new StringBuilder();

    public HorizontalLine(int size) {
        this.size = size;
    }

    public String toString() {
        for (int i = 0; i < size; i++) {
            sb.append("*");
        }
        return sb.toString();
    }
}
