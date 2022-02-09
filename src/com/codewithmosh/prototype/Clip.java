package com.codewithmosh.prototype;

public class Clip implements Component {
    @Override
    public Component clone() {
        // Logic for duplicating a Clip object
        return new Clip();
    }
}
