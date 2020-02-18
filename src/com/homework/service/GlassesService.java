package com.homework.service;

import com.homework.model.Glasses;

public class GlassesService {
    public Glasses glasses1;
    public Glasses glasses2;
    public Glasses glasses3;
    public Glasses glasses4;
    public Glasses glasses5;

    public GlassesService() {
        glasses1 = new Glasses("Rectangle", "white", 20, 8);
        glasses2 = new Glasses("Square", "blue", 30, 30);
        glasses3 = new Glasses("Rectangle", "blue", 20, 8);
        glasses4 = new Glasses("Rectangle", "white", 20, 8);
        glasses5 = new Glasses("Square", "blue", 30, 30);
    }
}
