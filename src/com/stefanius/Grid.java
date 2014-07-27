package com.stefanius;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by stefanius on 12/07/14.
 */
public class Grid {
    protected int rows;
    protected int collumns;
    protected int noElements;

    protected HashMap<Integer, Cell> cells;

    public Grid(int rows, int collumns) {
        this.rows = rows;
        this.collumns = collumns;
        this.noElements = this.rows * this.collumns;
    }

    public Grid(int noElements) {
        this.noElements = noElements;
    }

    protected void create() {
        this.cells = new HashMap<Integer, Cell>();

        for (int c = 0; c < this.collumns; c++) {
            for (int r = 0; r < this.rows; r++) {
                this.cells.put(c * this.collumns + r, new Cell(c, r));

            }
        }
    }

    protected Cell allocateNeighbours(Cell cell) {
        int row = cell.getRow();
        int collumn = cell.getCollumn();

        int northRow = row - 1;
        int southRow = row + 1;
        int westCollumn = collumn -1;
        int eastCollumn = collumn +1;

        if(northRow >= 0){
            cell.setNorthNeighbour(this.cells.get(this.calculateHasmapKey(collumn, northRow)));
        }

        if(southRow < this.rows){
            cell.setNorthNeighbour(this.cells.get(this.calculateHasmapKey(collumn, southRow)));
        }

        if(westCollumn >= 0){
            cell.setNorthNeighbour(this.cells.get(this.calculateHasmapKey(westCollumn, row)));
        }

        if(eastCollumn < this.collumns){
            cell.setNorthNeighbour(this.cells.get(this.calculateHasmapKey(collumn, row)));
        }

        return cell;
    }

    /**
     *
     * @param collumn
     * @param row
     * @return
     */
    protected int calculateHasmapKey(int collumn, int row) {
        return collumn * this.collumns + row;
    }


    /**
     * @param collumn
     * @param row
     * @return
     */
    public Cell findCell(int collumn, int row) {
        return this.cells.get(collumn * this.collumns + row);
    }


}
