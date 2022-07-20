package com.lpf.structure.adapter;

/**
 * 适配器
 * 通过适配器，我调用的是Adaptee 的逻辑，但是外部不知道这个事情，它看到的是target类型方法
 * 适配器内部做了处理，
 * 实现的方式是:通过集成被适配者 然后实现target接口的方式
 */
public class ClassAdapter extends Adaptee implements IEffect{

    @Override
    public void render() {
        doRender();
    }
}
