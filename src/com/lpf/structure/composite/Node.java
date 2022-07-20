package com.lpf.structure.composite;

import java.util.List;

public abstract class Node {

    private String name;

    public Node(String name){
        this.name = name;
    }

    /**
     * 获取子节点
     * @return
     */
    public abstract List<Node> getChildren();

    public String getName() {
        return name;
    }

}
