package com.datmaster.constructor;

/**
 * Created by datmaster on 12/24/13.
 */


public class linkedRows {
    private double R;
    private double U;

    private int index[] = new int[4];
    /*
    * status
    * 0 - empty
    * 1 - ok (set U and R (if !poe U == 0. if !resistors R == 0))
    * 2 - error
    * 3 - init
    * */
    private int status;

    linkedRows() {
        setR(0);
        setU(0);
        setStatus(0);
    }

    public int[] getIndex() {
        return index;
    }

    public void setIndex(int b1, int e1, int b2, int e2) {
        this.index[0] = b1;
        this.index[1] = e1;
        this.index[2] = b2;
        this.index[3] = e2;

    }

    public void setEndIndex(int b2, int e2) {
        setIndex(getIndex()[0], getIndex()[1], b2, e2);
    }

    public void setR(double r) {
        this.R = r;
    }

    public void appendR(double r) {
        this.R += r;
    }

    public void appendU(double u) {
        this.U += u;
    }

    public void setU(double u) {
        this.U = u;
    }

    public double getR() {
        return this.R;
    }

    public double getU() {
        return this.U;
    }

    public void setStatus(int s) {
        this.status = s;
    }

    public int getStatus() {
        return this.status;
    }
}
