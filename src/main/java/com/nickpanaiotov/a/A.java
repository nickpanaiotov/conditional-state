package com.nickpanaiotov.a;

public class A {
    private boolean someState;

    public A(boolean someState) {
        System.out.println("Bean A Initialized!");
        this.someState = someState;
    }

    public boolean isSomeState() {
        return someState;
    }

    @Override
    public String toString() {
        return "A{" +
                "someState=" + someState +
                '}';
    }
}
