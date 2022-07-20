package com.lpf.service.impl;

import com.lpf.service.IEffect;

public class EffectImpl implements IEffect {
    @Override
    public String renderEffect() {
        System.out.println("渲染美白特效成功");
        return "美白";
    }
}
