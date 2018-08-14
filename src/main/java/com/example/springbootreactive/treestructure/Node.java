package com.example.springbootreactive.treestructure;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Setter(AccessLevel.NONE)
//@NoArgsConstructor
//@AllArgsConstructor
public class Node{
    private Node parent;
    private boolean root;
    private List<Node> children = new ArrayList<>();
    private String data;

    public Node(){}

    public Node(String data){
        this.data = data;
        this.root = true;
    }

    public Node(Node parent, String data, List<String> predecessors){

        if(parent == null){
            root = true;
        }
        else {
            this.parent = parent;
        }
        this.data = data;

        if(predecessors != null) {
            //retrieveing children
            this.children = findChildren(findPredessors(this.data,predecessors));
        }
        System.out.println(this);
    }

    private List<Node> findChildren(List<String> predecessors){

         return predecessors.stream().filter(x-> !x.equals(this.data) && x.startsWith(this.data))
                .map(y-> new Node(this,y,predecessors))
                .collect(Collectors.toList());
    }

    private List<String> findPredessors(String data, List<String> allData){
        return allData.stream().filter(x->x.startsWith(data) && !x.equals(data)).collect(Collectors.toList());
    }
}
