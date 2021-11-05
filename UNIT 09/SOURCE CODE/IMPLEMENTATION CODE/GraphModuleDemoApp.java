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
package com.dube.main;

import com.dube.impl.AdjListGraph;


/**
 *
 * @author Enock Lukhetfo Dube <lukhetfomzomba@gmail.com>
 */
public class GraphModuleDemoApp {

    public static void main(String[] args) {
        
        /****************************************************/
        /* TESTING ADJACENCY LIST REPRESENTATION OF GRAPH */
        /****************************************************/
        AdjListGraph G = new AdjListGraph();
        G.addNode(10);G.addNode (20);
        G.addNode (30); G.addNode (40); G.addNode (20);
        G.addEdge(10,20); G.addEdge (10,40); G.addEdge (30,20);
        G.addEdge (30,10); G.addEdge (10,20); G.addEdge (10,40);
        G.addNode (15); G.addNode (35);
        G.addEdge (10,35); G.addEdge (40,35);G.addEdge (20,15);
        G.addEdge (30,8);G.addEdge (40,15); G.addEdge (15,10);
        G.addEdge (15,30); G.addEdge (15,20); G.addEdge (15,40);
        G.addEdge (15,10); G.addEdge (35,15); G.addEdge (35,20);
        G.ShowGraph (); System.out.println();
        G.Nodes(); System.out.println();
        G.Edges(); System.out.println();
       
        //deleting edges
        System.out.println("deleting edge between (10 ,20) and (30,10)" );
        G.removeEdge (10, 20);
        G.removeEdge (15, 30);
        //G.removeEdge (15, 30); // try deleting same edge again
        G.ShowGraph ();
        System.out.println();
        
        //deleting nodes
        System.out.println( "deleting nodes 30 and 20 ");
        G.removeNode (30);
        G.removeNode (20);
        //G.removeNode (30); // try deleting same node again
        G.ShowGraph ();
        System.out.println();
    }
    
}
