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

package com.dube.jgraphvisualization;

/**
 *
 * @author Enock Lukhetfo Dube <eldube@uniswa.sz>
 */
import com.dube.impl.BinTree;
import com.dube.impl.BinTreeNode;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.geom.Rectangle2D;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JApplet;

import org.jgraph.JGraph;
import org.jgraph.graph.DefaultGraphCell;
import org.jgraph.graph.GraphConstants;

import org.jgrapht.ListenableGraph;
import org.jgrapht.ext.JGraphModelAdapter;
import org.jgrapht.graph.ListenableDirectedGraph;
import org.jgrapht.graph.DefaultEdge;

/**
 * A demo applet that shows how to use JGraph to visualize JGraphT trees.
 *
 * 
 */
public class JGraphAdapterDemo extends JApplet {
    private static final Color     DEFAULT_BG_COLOR = Color.decode( "#FAFBFF" );
    
    private static final int NODE_WIDTH = 700;
    private static final int NODE_HEIGHT = 400; 
    
    private static final Dimension DEFAULT_SIZE 
                                = new Dimension( NODE_WIDTH, NODE_HEIGHT );
           
    private JGraphModelAdapter m_jgAdapter;
    /**
     * @see java.applet.Applet#init().
     */
    @Override
    public void init(  ) {
        // create a JGraphT graph
        ListenableGraph g = new ListenableDirectedGraph( DefaultEdge.class );

        // create a visualization using JGraph, via an adapter
        m_jgAdapter = new JGraphModelAdapter( g );

        JGraph jgraph = new JGraph( m_jgAdapter );

        adjustDisplaySettings( jgraph );
        getContentPane().add( jgraph );
        resize( DEFAULT_SIZE );
        
        /*********************************************************/
        /*        USING OUR OWN BINARY SEARCH TREE MODULE        */
        /*********************************************************/
        BinTree T = new BinTree();
        T.insertNode(10);
        T.insertNode(20);
        T.insertNode(150);
        T.insertNode(100);
        T.insertNode(55);
        T.insertNode(120);
        T.insertNode(5);
        T.insertNode(3);
        T.insertNode(8);
         
        System.out.println("\n In-order traversal");
        T.traverse(2);
        /*********************************************************/
       
       //ADD EDGES FOR VISUALIZATION USING JGRAPH FUNCTIONS
       addGraphNodeEdges(T, g);
       
       //POSITION NODES FOR VISUALIZATION JGRAPH FUNCTIONS
       positionVertexAt( 10, 250, 40 );
       positionVertexAt( 5, 100, 100 );
       positionVertexAt( 8, 200, 180 );
       positionVertexAt( 3, 0, 180 );
       positionVertexAt( 20, 400, 100 );
       positionVertexAt( 150, 500, 180 );
       positionVertexAt( 100, 400, 240 );
       positionVertexAt( 120, 500, 320 );
       positionVertexAt( 55, 300, 320 );
    }


    private void adjustDisplaySettings( JGraph jg ) {
        jg.setPreferredSize( DEFAULT_SIZE );
        Color  c        = DEFAULT_BG_COLOR;
        String colorStr = null;

        try {
            colorStr = getParameter( "bgcolor" );
        }
         catch( Exception e ) {}

        if( colorStr != null ) {
            c = Color.decode( colorStr );
        }

        jg.setBackground( c );
    }


    

    private void positionVertexAt( Object vertex, int x, int y ) {
        DefaultGraphCell cell = m_jgAdapter.getVertexCell( vertex );
        Map              attr = cell.getAttributes(  );
        Rectangle2D        b    = GraphConstants.getBounds( attr );
        GraphConstants.setBounds( attr, new Rectangle2D.Double( x, y,
                                               b.getWidth(), b.getHeight() ));
         
        
        Map cellAttr = new HashMap(  );
        cellAttr.put( cell, attr );
        m_jgAdapter.edit( cellAttr, null, null, null );
    }
    
    
    
     private ListenableGraph addGraphEdges(BinTreeNode node,
                                                     ListenableGraph g ) {
         if  (node != null)
            {   
              addGraphEdges(node.getLeftChild(), g);
              
              if (node.getLeftChild() != null) 
                 g.addEdge(node.getData(), node.getLeftChild().getData());      
                      
              if (node.getRightChild() != null)
                 g.addEdge(node.getData(), node.getRightChild().getData());
                      
              addGraphEdges(node.getRightChild(), g);
            }
         return g;
     }
    
     
     private ListenableGraph addGraphNodes(BinTreeNode node, 
                                                   ListenableGraph g ) {
        
         if  (node != null)
            {   
             g.addVertex(node.getData());
              addGraphNodes(node.getLeftChild(), g);
             // g.addVertex(node.getData());           
              addGraphNodes(node.getRightChild(), g);
            }
         return g;
     }
     
          
    private ListenableGraph addGraphNodeEdges (BinTree T,
                                                    ListenableGraph g) {
        g = addGraphNodes(T.getRoot(),g);
        g = addGraphEdges(T.getRoot(),g);
        return g;
    }
    
}	
