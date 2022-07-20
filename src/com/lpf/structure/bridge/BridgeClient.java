package com.lpf.structure.bridge;

import com.lpf.structure.bridge.bag.BagAbstraction;
import com.lpf.structure.bridge.bag.SmallBag;
import com.lpf.structure.bridge.material.Material;
import com.lpf.structure.bridge.material.Paper;

public class BridgeClient {
    public static void main(String[] args) {
        /*袋子型号*/
        BagAbstraction bag = new SmallBag();

        /*袋子材质*/
        Material material = new Paper();
        bag.setMaterial(material);

        /*开始采摘*/
        bag.pick();
    }
}
