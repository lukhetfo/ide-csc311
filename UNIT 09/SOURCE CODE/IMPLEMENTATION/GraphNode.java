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
package com.dube.impl;

import java.util.ArrayList;

/**
 *
 * @author Enock Lukhetfo Dube <lukhetfomzomba@gmail.com>
 */
public class GraphNode {
    private int NodeVal; // value label of node
    private ArrayList<Integer> AdjList; // list of adjacent nodes
    
    public GraphNode(int NodeVal, ArrayList AdjList) {
        this.NodeVal = NodeVal;
        this.AdjList = AdjList;
    }
    public GraphNode(int NodeVal) {
        this.NodeVal = NodeVal;
        this.AdjList = new ArrayList();
    }
    public void setNodeVal(int NodeVal) {
        this.NodeVal = NodeVal;
    }
    public void setAdjList(ArrayList AdjList) {
        this.AdjList = AdjList;
    }
    
    public int getNodeVal() {
        return NodeVal;
    }
    public ArrayList getAdjList() {
        return AdjList;
    }
}
