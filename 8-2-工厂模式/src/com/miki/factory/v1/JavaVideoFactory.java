package com.miki.factory.v1;

public class JavaVideoFactory extends VideoFactory{

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
