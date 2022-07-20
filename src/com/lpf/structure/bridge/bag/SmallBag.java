package com.lpf.structure.bridge.bag;

/**
 * 采摘一小袋
 * Material
 */
public class SmallBag extends BagAbstraction {

    public void pick(){
        this.material.draw();
        System.out.println("采摘了一小袋");
    }

}
