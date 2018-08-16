package com.example.springbootreactive.treestructure;

public interface Visitable<T> {
    void accept(Visitor<T> visitor);
}
