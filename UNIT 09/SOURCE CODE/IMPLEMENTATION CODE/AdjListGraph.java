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

import com.dube.graphinterface.MyGraph;
import java.util.ArrayList;

/**
 *
 * @author Enock Lukhetfo Dube <lukhetfomzomba@gmail.com>
 */
public class AdjListGraph implements MyGraph{
    private final ArrayList<GraphNode> Nodes;
    private final ArrayList<Integer> NodeValues;
    
    public AdjListGraph() {
        Nodes = new ArrayList();
        NodeValues = new ArrayList();
    }
    
    public boolean isEmpty () {
        return (this.getSize() == 0);
    }
    public int getSize () {
        return this.Nodes.size();
    }
    public ArrayList<Integer> getNodeValues() {
        return NodeValues;
    }
    public boolean isMember (int u) {
        //return this.getNodeValues().contains(u);
        boolean Found = false;
        if (this.isEmpty())
            return false;
        else
        {
        int Index = 0;
        while ( (!(Found)) && (Index < this.Nodes.size()) )
        {
            if ( this.Nodes.get(Index).getNodeVal() == u )
            {   
                Found = true;
                break;
            }
            else // Found = false;
                Index = Index + 1;
        }
        return Found;
        }
    }
    
    public boolean isAdjacent (int u, int v) {
        int Indexu;
        boolean found = false;
        if (!(this.isEmpty()))
            if ( (this.isMember (u)) && (this.isMember (v))) {
                Indexu = this.nodeIndex(u);
                if (!(Indexu == -1)) {
                    ArrayList<Integer> AdjListu =
                    this.Nodes.get(Indexu).getAdjList();
                    if (AdjListu.contains(v)) /* AdjListu contains u */
                        found = true;
                    else /* AdjListu does not contain v */
                        found = false;
                }
            }
        return found; //IsElement(v, G.Nodes[Indexu].AdjList);
    }
    public int nodeIndex (int u) {
        boolean Found;
        int Index;
        if (this.isEmpty())
            return -1;
        else {
            Found = false;
            Index = 0;
            while ( (!( Found)) && (Index < this.Nodes.size()) )
            {
                if ( this.Nodes.get(Index).getNodeVal() == u )
                {
                Found = true;
                break;
                }
                else
                {
                //Found = false;
                Index = Index + 1;
                }
            }
            if (Found == true)
                return Index;
            else
                return -1;
        }
    }
    
    public void addNode (int u) {
    if (!(this.isMember(u))) {
        GraphNode P = new GraphNode(u);
        Nodes.add(P);
        NodeValues.add(u);
        }
    }
    public void removeNode (int u) {
           
        int Indexu = this.nodeIndex (u);
        if (!(Indexu == -1))
        this.Nodes.remove(Indexu);
    }
    
    public void addEdge ( int u, int v) {
        int Indexu;
        if (!( this.isEmpty())) {
        if ( (this.isMember (u)) && (this.isMember(v) ))
        {
            Indexu = this.nodeIndex(u);
            //check if v already added
            if (Indexu != -1){
                ArrayList<Integer> AdjListu =this.Nodes.get(Indexu).getAdjList();
                boolean found = AdjListu.contains(v);
                if (!(found))
                    this.Nodes.get(Indexu).getAdjList().add(v);
            }
        }
       }
    }
    public void removeEdge (int u, int v) {
        int Indexu, Indexv;
        if (!( this.isEmpty()))
            if ( (this.isMember (u)) && (this.isMember(v))){
                Indexu = this.nodeIndex(u);
                Indexv = this.Nodes.get(Indexu).getAdjList().indexOf(v);
                if (Indexu != -1){
                    this.Nodes.get(Indexu).getAdjList().remove(Indexv);
                }
            }
        }
    

    public void Nodes () {
        System.out.println ("The nodes of the graph are: ... " );
        for (int i=0; i < this.getSize(); i++)
            System.out.print(this.Nodes.get(i).getNodeVal()+"\t");
        System.out.println();
    }
    public void Edges () {
       
        System.out.println( "The edges of the graph are : " );
        for (int i=0; i < this.Nodes.size(); i++){
            GraphNode P = this.Nodes.get(i);
            for (int j=0; j<this.Nodes.get(i).getAdjList().size(); j++){
                System.out.print( "(" + P.getNodeVal() +
                "," + P.getAdjList().get(j) + ")" + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void ShowGraph () {
        System.out.println( "The Adjacency list of the graph is : " );
        // for (auto gNode = G.Nodes.begin(); gNode != G.Nodes.end(); ++gNode)
        for (int i=0; i < this.getSize(); i++){
            GraphNode P = this.Nodes.get(i);
            System.out.print(P.getNodeVal() + "\t ===> ");
            for (int j=0; j < P.getAdjList().size(); j++){
                System.out.print(P.getAdjList().get(j).toString() + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}