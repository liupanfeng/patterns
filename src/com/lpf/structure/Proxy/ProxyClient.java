package com.lpf.structure.Proxy;

import com.lpf.service.IEffect;

public class ProxyClient {

    public static void main(String[] args) {
        IEffect orderService = new ProxyOrder();
        orderService.renderEffect();
    }

}
