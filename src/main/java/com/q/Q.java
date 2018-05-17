package com.q;

public class Q {
    private boolean someState;

    public Q(boolean state) {
        this.someState = state;
        System.out.println("-------------------QAutoConfiguration-------------------");
    }

    public boolean isSomeState() {
        return someState;
    }
}
