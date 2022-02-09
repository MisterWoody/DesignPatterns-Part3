package com.codewithmosh.prototype;

public class Audio implements Component {
    @Override
    public Component clone() {
        // Logic for duplicating an Audio object
        return new Audio();
    }
}
