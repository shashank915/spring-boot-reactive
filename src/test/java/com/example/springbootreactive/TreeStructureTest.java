package com.example.springbootreactive;

import com.example.springbootreactive.treestructure.NodeBuilder;
import lombok.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TreeStructureTest {

    @Test
    public void test(){

        List<String> sourceStrings = Arrays.asList("CSE/","CSE/DS/","CSE/DS/Images/","CSE/DS/Images/a.jpg",
                "CSE/DS/Videos/","CSE/DS/Videos/a.mp4","CSE/DBMS/","CSE/DBMS/Images/","CSE/DBMS/Videos/"
        ,"CSE/DBMS/Images/a.jpg","CSE/DBMS/Videos/a.mp4");

        System.out.println(NodeBuilder.buildNode(sourceStrings));
    }
}
