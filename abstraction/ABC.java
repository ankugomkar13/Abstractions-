package org.example.abstraction;

public interface ABC {
    void show();
    default  void display()
    {
        System.out.println("I am ABC");
    }
}
