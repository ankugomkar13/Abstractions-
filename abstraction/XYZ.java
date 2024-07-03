package org.example.abstraction;

public interface XYZ {
    void show();
    default  void display()
    {
        System.out.println("I am XYZ");
    }
}
