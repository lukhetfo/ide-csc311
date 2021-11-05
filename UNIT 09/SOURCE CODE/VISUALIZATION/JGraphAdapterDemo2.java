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
 * @author Enock Lukhetfo Dube <lukhetfomzomba@gmail.com>
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.geom.Rectangle2D;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.swing.JApplet;
import org.jgraph.JGraph;
import org.jgraph.graph.DefaultGraphCell;
import org.jgraph.graph.GraphConstants;
import org.jgrapht.ListenableGraph;
//import org.jgrapht.alg.spanning.KruskalMinimumSpanningTree;
//import org.jgrapht.alg.interfaces.ShortestPathAlgorithm;
//import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.event.TraversalListenerAdapter;
import org.jgrapht.ext.JGraphModelAdapter;
import org.jgrapht.graph.ListenableDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.traverse.BreadthFirstIterator;
import org.jgrapht.traverse.DepthFirstIterator;
import org.jgrapht.traverse.GraphIterator;
/**
* A demo applet that shows how to use JGraph to visualize JGraphT graphs.
*
*
*/
public class JGraphAdapterDemo2 extends JApplet {
private static final Color DEFAULT_BG_COLOR = Color.decode( "#FAFBFF" );
private static final Dimension DEFAULT_SIZE = new Dimension( 530, 320 );
//
private JGraphModelAdapter m_jgAdapter;
/**
* @see java.applet.Applet#init().
*/
@Override
public void init( ) {
// create a JGraphT graph
ListenableGraph g = new ListenableDirectedGraph( DefaultEdge.class );
// create a visualization using JGraph, via an adapter
m_jgAdapter = new JGraphModelAdapter( g );

JGraph jgraph = new JGraph( m_jgAdapter );
adjustDisplaySettings( jgraph );
getContentPane().add( jgraph );
resize( DEFAULT_SIZE );

/*********************START EXAMPLE 1: ******************************/
//ADD NODES
g.addVertex("10");
g.addVertex ("20");
g.addVertex ("30"); 
g.addVertex ("40"); 
g.addVertex ("20");
g.addVertex ("15"); 
g.addVertex ("35");
		


//ADD EDGES
g.addEdge("10","20"); 
g.addEdge ("10","40"); 
g.addEdge ("30","20");
g.addEdge ("30","10"); 
g.addEdge ("10","20"); 
g.addEdge ("10","40");	      
g.addEdge ("10","35"); 
g.addEdge ("40","35");
g.addEdge ("20","15");

g.addEdge ("40","15"); 
g.addEdge ("15","10");
g.addEdge ("15","30"); 
g.addEdge ("15","20"); 
g.addEdge ("15","40");
g.addEdge ("15","10"); 
g.addEdge ("35","15"); 
g.addEdge ("35","20");

//Breadth First Search
System.out.println( "Breadth First Search from Node 10:");
GraphIterator<String, String> iteratorBFS
= new BreadthFirstIterator<>(g, "10");
iteratorBFS.addTraversalListener(new TraversalListenerAdapter());

while (iteratorBFS.hasNext()) {
System.out.print( iteratorBFS.next()+ "\t");
}
System.out.println();
//Depth First Search
System.out.println( "Depth First Search from Node 10:");
GraphIterator<String, String> iteratorDFS
= new DepthFirstIterator<>(g, "10");
iteratorBFS.addTraversalListener(
new TraversalListenerAdapter());
while (iteratorDFS.hasNext()) {
System.out.print( iteratorDFS.next()+"\t");
}
System.out.println();
//position vertex/nodes
positionVertexAt( "10", 20, 100 );
positionVertexAt( "20", 150, 10 );
positionVertexAt( "30", 420, 10 );
positionVertexAt( "40", 200, 280 );
positionVertexAt( "15", 200, 200 );
positionVertexAt( "35", 420, 120 );
/********************END TEST EXAMPLE 1: *************************/
}

    private void adjustDisplaySettings( JGraph jg ) {
        jg.setPreferredSize( DEFAULT_SIZE );
        Color c = DEFAULT_BG_COLOR;
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
        Map attr = cell.getAttributes( );
        Rectangle2D b = GraphConstants.getBounds( attr );
        GraphConstants.setBounds( attr, new Rectangle2D.Double( x, y,
        b.getWidth(), b.getHeight() ));
        Map cellAttr = new HashMap( );
        cellAttr.put( cell, attr );
        m_jgAdapter.edit( cellAttr, null, null, null );
    }
}