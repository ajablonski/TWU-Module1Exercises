package com.twu.diamond;

public class DiamondWithName extends Diamond {
    public static void main(String[] args) {
        System.out.println(new DiamondWithName(3, "Alex"));
    }

    private String name;
    private String[] rows;

    public DiamondWithName(int size, String name) {
        super(size);
        this.name = name;
    }

    public String[] getRows() {
        if (this.rows == null) {
            this.rows = super.getRows();
            this.rows[getSize() - 1] = name;
        }
        return this.rows;
    }
}
