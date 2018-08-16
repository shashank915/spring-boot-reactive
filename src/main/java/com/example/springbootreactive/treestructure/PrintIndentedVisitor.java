package com.example.springbootreactive.treestructure;

public class PrintIndentedVisitor implements Visitor<String> {

    private final int indent;

    public PrintIndentedVisitor(int indent) {
        this.indent = indent;
    }

    @Override
    public Visitor<String> visitTree(Tree<String> tree) {
        return new PrintIndentedVisitor(indent + 2);
    }

    @Override
    public void visitData(Tree<String> parent, String data) {
        for (int i = 0; i < indent; i++) { // TODO: naive implementation
            System.out.print(" ");
        }

        System.out.println(data);
    }
}
