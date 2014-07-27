package com.stefanius;

/**
 * Created by stefanius on 12/07/14.
 */
public class Cell {
    protected int collumn;
    protected int row;

    protected Cell southNeighbour;
    protected Cell northNeighbour;
    protected Cell eastNeighbour;
    protected Cell westNeighbour;

    /**
     * @param collumn
     * @param row
     */
    public Cell(int collumn, int row) {
        this.collumn = collumn;
        this.row = row;
    }

    public int getCollumn() {
        return collumn;
    }

    public void setCollumn(int collumn) {
        this.collumn = collumn;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public Cell getSouthNeighbour() {
        return southNeighbour;
    }

    public void setSouthNeighbour(Cell southNeighbour) {
        this.southNeighbour = southNeighbour;
    }

    public Cell getNorthNeighbour() {
        return northNeighbour;
    }

    public void setNorthNeighbour(Cell northNeighbour) {
        this.northNeighbour = northNeighbour;
    }

    public Cell getEastNeighbour() {
        return eastNeighbour;
    }

    public void setEastNeighbour(Cell eastNeighbour) {
        this.eastNeighbour = eastNeighbour;
    }

    public Cell getWestNeighbour() {
        return westNeighbour;
    }

    public void setWestNeighbour(Cell westNeighbour) {
        this.westNeighbour = westNeighbour;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "collumn=" + collumn +
                ", row=" + row +
                '}';
    }
}
