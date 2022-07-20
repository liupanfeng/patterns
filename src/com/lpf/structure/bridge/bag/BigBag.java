package com.lpf.structure.bridge.bag;

/**
 * 采摘大袋
 */
public class BigBag extends BagAbstraction {

    public void pick(){
        this.material.draw();
        System.out.println("采摘了一大袋");
    }

}
