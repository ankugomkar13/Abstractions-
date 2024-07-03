package org.example.abstraction;

public class mainDemo implements XYZ,ABC{
    @Override
    public void show() {
        System.out.println("My method");
    }

    @Override
    public void display() {
        XYZ.super.display();
        ABC.super.display();
    }

    public static void main(String args[])
    {
        mainDemo ma = new mainDemo();
        ma.display();
        ma.show();

    }

}
