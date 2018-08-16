package com.example.springbootreactive.treestructure;

import java.util.List;

public class TreeBuilder {

    public static Tree<String> buildTree(List<String> directoryList){

        Tree<String> forest = new Tree<String>("/");
        Tree<String> current = forest;

        for(String tree : directoryList){
            Tree<String> root = current;

            for(String data : tree.split("/")){
                current = current.child(data);
            }

            current = root;
        }
        return forest;
    }
}
