package com.lpf.service.impl;

import com.lpf.service.IEffect;

public class MakeUpEffectImpl implements IEffect {
    @Override
    public String renderEffect() {
        System.out.println("渲染美妆成功");
        return "美妆";
    }
}
