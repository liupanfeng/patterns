package com.lpf.structure.Proxy;

import com.lpf.service.IEffect;
import com.lpf.service.impl.MakeUpEffectImpl;

public class ProxyOrder  implements IEffect {
    /**
     * 代理类持有被代理的对象 ，进行操作的时候，执行的是持有的代理类的相应逻辑
     */
    private IEffect orderService = new MakeUpEffectImpl();

    @Override
    public String renderEffect() {
        System.out.println("开始渲染美妆");
        orderService.renderEffect();
        System.out.println("渲染美妆结束");
        return "增加了美妆特效";
    }
}
