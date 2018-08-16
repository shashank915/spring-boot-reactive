package com.example.springbootreactive;


import com.example.springbootreactive.treestructure.Tree;
import com.example.springbootreactive.treestructure.TreeBuilder;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TreeStructureTest {

    @Test
    public void test(){
        List<String> directoryList = Arrays.asList(
                "CSE/",
                "CSE/DS",
                "CSE/DS/Images",
                "CSE/DS/Images/a.jpg",
                "CSE/DS/Videos/",
                "CSE/DS/Videos/a.mp4",
                "CSE/DBMS/",
                "CSE/DBMS/Images",
                "CSE/DBMS/Videos",
                "CSE/DBMS/Images/b.jpg",
                "CSE/DBMS/Videos/b.mp4",
                "ME/",
                "ME/Heat/",
                "ME/Heat/Images/c.jpg",
                "ME/Heat/Videos/c.mp4"
        );

        Tree forest = TreeBuilder.buildTree(directoryList);
        System.out.println(forest);
    }
}
