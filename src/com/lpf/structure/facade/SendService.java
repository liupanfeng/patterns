package com.lpf.structure.facade;

import com.lpf.structure.composite.DistrictNode;
import com.lpf.structure.composite.LeafNode;
import groovy.json.JsonOutput;

public class SendService {

    /**
     * 指定目的地，发送快递
     */
    public void doSend(){
        //根目录
        DistrictNode root = new DistrictNode("china");

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

        System.out.println("请选定目的地："+ JsonOutput.toJson(root));
        /*以下物流运输业务*/
        System.out.println("本次快递目的地：beijing-chanyangqu-sanlitun");
    }

    public void doSomeThine(){
        System.out.println("doSomeThine");
    }

}
