package com.example.springbootreactive.treestructure;

public interface Visitor<T> {

    Visitor<T> visitTree(Tree<T> tree);

    void visitData(Tree<T> parent, T data);
}
