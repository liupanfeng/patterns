package com.lpf.structure.composite;

import groovy.json.JsonOutput;

public class CompositeClient {

    public static void main(String[] args) {
        //根目录
        DistrictNode root = new DistrictNode("root");

        //一线目录
        root.addChild(new DistrictNode("shang hai"));
        root.addChild(new DistrictNode("tian jin"));
        DistrictNode districtNode = new DistrictNode("bei jing");
        root.addChild(districtNode);

        //二级目录
        districtNode.addChild(new DistrictNode("hai dian qu"));
        districtNode.addChild(new DistrictNode("xi cheng qu"));
        DistrictNode districtNode2 = new DistrictNode("chao yang qu");
        districtNode.addChild(districtNode2);

        //三级目录
        districtNode2.addChild(new LeafNode("san li tun "));
        districtNode2.addChild(new LeafNode("guo mao"));

        System.out.println(JsonOutput.toJson(root));

    }
}
