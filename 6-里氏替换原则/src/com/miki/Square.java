package com.miki;

/**
 * 正方形实体类
 */
public class Square extends Rectangle{

    //边长
    //正方形只有边长
    private long sideLength;

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public long getLength() {
        //return super.getLength();
        return getSideLength();
    }

    @Override
    public void setLength(long length) {
//        super.setLength(length);
        setSideLength(length);
    }

    @Override
    public long getWidth() {
        //return super.getWidth();
        return getSideLength();
    }

    @Override
    public void setWidth(long width) {
//        super.setWidth(width);
        setSideLength(width);
    }
}
