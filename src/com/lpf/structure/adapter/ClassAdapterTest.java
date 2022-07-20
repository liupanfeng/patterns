package com.lpf.structure.adapter;

public class ClassAdapterTest {

    public static void main(String[] args) {
        IEffect iEffect=new ClassAdapter();
        iEffect.render();
    }
}
