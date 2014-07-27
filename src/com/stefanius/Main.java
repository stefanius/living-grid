package com.stefanius;

public class Main {

    public static void main(String[] args) {
	// write your code he
        Grid grid = new Grid(5,5);

        grid.create();

        System.out.println(grid.findCell(3,2));

    }
}
