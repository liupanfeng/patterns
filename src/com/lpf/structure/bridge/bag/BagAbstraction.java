package com.lpf.structure.bridge.bag;

import com.lpf.structure.bridge.material.Material;

/**
 * 采摘容器
 */
public abstract class BagAbstraction {
    /**
     * 这个是容器的另外一组属性
     */
    protected Material material;

    /**
     * 另外一组属性，通过set方法注入进来
     * @param material
     */
    public void setMaterial(Material material){
        this.material = material;
    }

    /**
     * 采摘
     */
    public abstract void pick();

}
