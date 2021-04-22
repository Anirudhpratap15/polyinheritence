package com.coforge.poly.PolyAndInheritence;


public class App 
{
    public static void main( String[] args )
    {
        Overloading o =new Overloading();
        new Overloading("compile time poly");
        System.out.println(o.add(2,5));
        o.add(5.5,9);
    }
}
