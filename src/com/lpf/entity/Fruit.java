package com.lpf.entity;


import com.lpf.action.visit.Visit;

/**
 * 水果接口
 */
public interface Fruit {

    int price();

    void draw();

    int accept(Visit visit);

}
