package com.lpf.structure.facade;

import com.lpf.structure.bridge.bag.BagAbstraction;
import com.lpf.structure.bridge.bag.SmallBag;
import com.lpf.structure.bridge.material.Material;
import com.lpf.structure.bridge.material.Paper;

public class PickService {

    /**
     * 采摘水果
     */
    public void doPick(){
        //袋子型号
        BagAbstraction pickBag = new SmallBag();

        //袋子材质
        Material material = new Paper();
        pickBag.setMaterial(material);

        //开始采摘
        pickBag.pick();
    }

    public void doSomeThine(){
        System.out.println("doSomeThine");
    }

}
