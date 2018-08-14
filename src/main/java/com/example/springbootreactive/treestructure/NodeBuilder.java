package com.example.springbootreactive.treestructure;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NodeBuilder{

    public static List<Node> buildNode(List<String> sourceStrings){

        List<String> rootFolders = findAllRootFolders(sourceStrings);

        return rootFolders.stream().map(x-> new Node(null,x,sourceStrings)).collect(Collectors.toList());
    }

    /***
     * Which key has  only '/' thah can be considered as root folder
     * @param sourceStrings
     * @return
     */
    private static List<String> findAllRootFolders(List<String> sourceStrings){
        return sourceStrings.stream()
                .filter(x->x.indexOf("/") == x.lastIndexOf("/"))
                .collect(Collectors.toList());
    }

}
