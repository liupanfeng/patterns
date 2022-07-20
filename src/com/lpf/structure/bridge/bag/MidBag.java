package com.lpf.structure.bridge.bag;

/**
 * 采摘中型袋
 * Material
 */
public class MidBag extends BagAbstraction {

    public void pick(){
        this.material.draw();
        System.out.println("采摘了一中型袋");
    }

}
