package com.example.dadriaunna01.takehomeassignment08_dadriaunnaw;

/**
 * Created by cmltdstudent on 3/26/17.
 */

public class Makeup {

    private String makeupCategory;
    private int size;
    private boolean designer;

    public Makeup(String makeupCategory, int size, boolean designer) {
        this.makeupCategory = makeupCategory;
        this.size = size;
        this.designer = designer;


    }

    public String getMakeupCategory() {
        return makeupCategory;
    }

    public int getSize() {
        return size;
    }

    public boolean isDesigner() {
        return designer;
    }

}
