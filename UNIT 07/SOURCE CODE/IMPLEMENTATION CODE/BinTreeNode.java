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

/**
 *
 * @author Enock Lukhetfo Dube <lukhetfomzomba@gmail.com>
 */
public class BinTreeNode {
//data members
    private BinTreeNode leftChild;
    private int data;
    private BinTreeNode rightChild;

//constructor
public BinTreeNode(int nodeValue)
{
    data = nodeValue;
    leftChild = rightChild = null;
}


//getters
public int getData()
{
    return data;
}
public BinTreeNode getLeftChild()
{
    return leftChild;
}
public BinTreeNode getRightChild()
{
    return rightChild;
}
//setters
public void setData( int dataValue)
{
    data = dataValue;
}
public void setLeftChild(BinTreeNode node)
{
    leftChild = node;
}
public void setRightChild(BinTreeNode node)
{
    rightChild = node;
}
// is leafnode
public boolean isLeafNode()
{
    return ((leftChild==null) && (rightChild==null));
}
// insert node left or right
public BinTreeNode find(int NodeValue)
{
    if (NodeValue == data)
        return this;
    else if (NodeValue < data){
        if (this.leftChild == null)
                return null;
        else return (this.leftChild.find(NodeValue));
    }
    else {
    if (this.rightChild == null)
        return null;
    else return (this.rightChild.find(NodeValue));
    }
}

// insert node left or right
public void insert(int newNodeValue)
{
    //insert left child
    if (newNodeValue < data)
    {
        if (leftChild == null)
            leftChild = new BinTreeNode(newNodeValue);
        else
            leftChild.insert(newNodeValue);
    }
    else
    //insert right child
    if (newNodeValue > data){
        if (rightChild == null)
            rightChild = new BinTreeNode(newNodeValue);
        else
            rightChild.insert(newNodeValue);
    }
}
//remove node
public boolean remove(int value, BinTreeNode parent) {
    if (value < data) {
        if (leftChild != null)
            return leftChild.remove(value, this);
        else
            return false;
    } else if (value > data) {
        if (rightChild != null)
            return rightChild.remove(value, this);
        else
            return false;
    } else {
        if (leftChild != null && rightChild != null) {
            data = rightChild.leftMostNodeValue();
            rightChild.remove(data, this);
        } else if (parent.leftChild == this) {
            parent.leftChild = (leftChild != null) ?
            leftChild : rightChild;
        } else if (parent.rightChild == this) {
            parent.rightChild = (leftChild != null) ?
            leftChild : rightChild;
        }
        return true;
       }
}
//get left most child value
public int leftMostNodeValue() {
    if (leftChild == null)
        return data;
    else
        return leftChild.leftMostNodeValue();
    }
}
