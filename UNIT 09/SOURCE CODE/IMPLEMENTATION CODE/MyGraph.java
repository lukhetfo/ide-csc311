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
package com.dube.graphinterface;

/**
 *
 * @author Enock Lukhetfo Dube <lukhetfomzomba@gmail.com>
 */
public interface MyGraph {
    public boolean isEmpty ();
    public int getSize ();
    public boolean isMember (int u);
    public boolean isAdjacent (int u, int v);
    public int nodeIndex (int u);
    public void addNode (int u);
    public void removeNode (int u);
    public void addEdge ( int u, int v);
    public void removeEdge (int u, int v);
    public void Nodes ();
    public void Edges ();
    public void ShowGraph ();
}
