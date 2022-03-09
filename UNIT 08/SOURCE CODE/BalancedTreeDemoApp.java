
package com.dube.main;

import com.dube.impl.BTree;

/**
 *
 * @author Enock Lukhetfo Dube <lukhetfomzomba@gmail.com>
 */
public class BalancedTreeDemoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // example 1:
        
        // A B-Tree with minimum degree 3
	BTree T1 = new BTree(3); 
	
	T1.insert(10);
	T1.insert(20);
	T1.insert(5);
	T1.insert(6);
	T1.insert(12);
	T1.insert(30);
	T1.insert(7);
	T1.insert(17);

	System.out.println( "Traversal of the constucted tree is ");
	T1.traverse();

	int k = 6;
	if ((T1.search(k) != null)) 
		System.out.println( "\nPresent \n"); 
        else
                System.out.println( "\nNot Present \n");

	k = 15;
	if (T1.search(k) != null)
		System.out.println( "\nPresent \n");
        else
                System.out.println( "\nNot Present \n");

	System.out.println();

	// example 2:
	BTree T2 = new BTree(3); // A B-Tree with minium degree 3
	T2.insert(10);
	T2.insert(20);
	T2.insert(50);

	T2.insert(30);
	T2.insert(40);
	T2.insert(60);
	T2.insert(70);
	T2.insert(80);
	T2.insert(90);

	System.out.println( "in-order Traversal of the constucted tree is ");
	T2.traverse();
	System.out.println();
	
	System.out.println( "pre-order Traversal of the constucted tree is ");
	T2.preOrderTraverse();
	System.out.println();	
    }    
}
