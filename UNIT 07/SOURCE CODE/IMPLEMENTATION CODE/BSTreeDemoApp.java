/*
 *******************************************************
 * 2019 (C) EL Dube Enterprises
 * Free and Open Source License Granted by the developer 
 *
 * Developed By: Enock Lukhetfo Dube
 *               Department of Computer Science
 *               University of Eswatini
 *******************************************************
 */
package com.dube.main;

import com.duble.impl.BinTree;

/**
 *
 * @author Enock Lukhetfo Dube <lukhetfomzomba@gmail.com>
 */
public class BSTreeDemoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinTree T = new BinTree();
        T.insertNode(90);
        T.insertNode(45);
        T.insertNode(30);
        T.insertNode(15);
        T.insertNode(80);
        T.insertNode(200);
        T.insertNode(130);
        T.insertNode(80);
        T.insertNode(250);
        T.insertNode(300);
        T.insertNode(60);
        T.insertNode(30);
        T.insertNode(35);
        System.out.println(" Recursive in-order traversal");
        T.traverse(2);
        System.out.println();
        
        System.out.println(" \n Iterative in-order traversal");
        T.iterativeTraverse(2);
        System.out.println();
        
        System.out.print("\n After Deleting Node 45:");
        //remove node and view resulting tree

        T.removeNode(45);
        System.out.println("in-order traversal");
        T.traverse(2);
        System.out.println();
         System.out.println();
          
    }
    
}
