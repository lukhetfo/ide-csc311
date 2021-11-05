/*
 *******************************************************
 * 2019 (C) EL Dube Enteprises
 * Free and Open Source License Granted by the developer 
 *
 * Developed By: Enock Lukhetfo Dube
 *               Department of Computer Science
 *               University of Eswatini
 *******************************************************
 */
package com.duble.impl;

import java.util.Stack;

/**
 *
 * @author Enock Lukhetfo Dube <lukhetfomzomba@gmail.com>
 */
public class BinTree {

//data member
private BinTreeNode root;
//constructor
public BinTree(){
    root = null;
}
public BinTree(BinTreeNode X){
    this.root = X;
}
public boolean isEmpty() {
    return root == null;
}
public BinTreeNode getRoot() {
    return root;
}
//insert node
public void insertNode(int newNodeValue) {
    if (root == null) // inserting into an empty tree
        root = new BinTreeNode(newNodeValue);
    else
        root.insert(newNodeValue); //current tree not empty
}
//remove node
public boolean removeNode(int value) {
    if (root == null)
        return false;
    else {
        if (root.getData() == value) {
            BinTreeNode auxRoot = new BinTreeNode(0);
            auxRoot.setLeftChild(root);
            boolean result = root.remove(value, auxRoot);
            root = auxRoot.getLeftChild();
            return result;
        } else { 
            return root.remove(value, null);}
    }
}


//find node containing specified value
public Object findNode(int e) {
    if (this.root == null)
        return null;
    else
        return (this.root.find(e));
}
//tree traversal


public void traverse (int order) {
    if (order == 2) //in-order traversal
        inOrderHelper(root);
    else if (order == 1) // pre-order traversal
        System.out.println("CODE YET TO BE IMPLEMENTED");
    else if (order == 3)  // post-order traversal
        System.out.println("CODE YET TO BE IMPLEMENTED");
    else
        inOrderHelper(root);
}
public void iterativeTraverse (int order) {
    if (order == 2) // in-order traversal
        iterativeInOrderTraversal();
    else if (order == 1) // pre-order traversal
        System.out.println("CODE YET TO BE IMPLEMENTED");
    else if (order == 3) // post-order traversal
        System.out.println("CODE YET TO BE IMPLEMENTED");
    else if (order == 4) // level order traversal
        System.out.println("CODE YET TO BE IMPLEMENTED");
    else
        iterativeInOrderTraversal(); //default: in-order traversal
}
// in-order traversal helper
private void inOrderHelper(BinTreeNode node)
{
    if (node != null)
    {
    inOrderHelper(node.getLeftChild());
    System.out.printf("%d ", node.getData());
    inOrderHelper(node.getRightChild());
    }
}
//iterative inorder traversal
public void iterativeInOrderTraversal()
{
    BinTreeNode P = root;
    Stack<BinTreeNode> S = new Stack<>();
    while (P != null)
    {
        //push leftshell of root onto the stack
        while (P.getLeftChild() != null)
        {
        S.push(P);
        P = P.getLeftChild();
        }
        boolean done = false;
        do {
            System.out.printf("%d ", P.getData());
            if (P.getRightChild() == null){
                if (!(S.isEmpty()) )
                P = S.pop();
                else {
                done = true;
                P = null;
                }
            }else{
                P = P.getRightChild();
                done = true;
                }
            }
            while (!(done));
        }
  }
}
