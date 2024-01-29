package org.example.tricks;

import org.w3c.dom.ls.LSOutput;

import java.io.FileNotFoundException;
import java.io.IOException;

class A{
    void show() throws Exception{
        System.out.println("print");
    }
}
class B extends A{
    void show() throws IndexOutOfBoundsException {
        System.out.println("print");
    }
}
public class WrapperConcept {

    public static void main(String[] args) throws FileNotFoundException {

        B b = new B();
        b.show();
    }
}
