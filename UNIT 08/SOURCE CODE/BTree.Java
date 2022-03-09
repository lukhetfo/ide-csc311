
package com.dube.impl;

/**
 *
 * @author Enock Lukhetfo Dube <lukhetfomzomba@gmail.com>
 */
public class BTree {
    private BTreeNode root; // Pointer to root node
    private int t; // Minimum degree

    // Constructor (Initializes tree as empty)
public BTree(int _t)
{ root = null; t = _t; }

// function to traverse the tree
public void traverse()
{ if (root != null) root.traverse(); }


//additional traversal function
public void preOrderTraverse()
{ if (root != null) root.preOrderTraverse(); }

// function to search a key in this tree
public BTreeNode search(int k)
{ return (root == null)? null : root.search(k); }

// The main function that inserts a new key in this B-Tree
public void insert(int k)
{
	// If tree is empty
	if (root == null)
	{
		// Allocate memory for root
		root = new BTreeNode(t, true);
		//root.keys[0] = k; // Insert key
                root.setKeys(k, 0);
		//root.n = 1; // Update number of keys in root
                root.setN(1);
	}
	else // If tree is not empty
	{
		// If root is full, then tree grows in height
		if (root.getN() == 2*t-1)
		{
			// Allocate memory for new root
			BTreeNode s = new BTreeNode(t, false);

			// Make old root as child of new root
			//s.C[0] = root;
                          s.setC(root,0);
			// Split the old root and move 1 key to the new root
			s.splitChild(0, root);

			// New root has two children now. Decide which of the
			// two children is going to have new key
			int i = 0;
			if (s.getKeys(0) < k)
				i++;
			//s.C[i].insertNonFull(k);
                          s.getC(i).insertNonFull(k);
			// Change root
			root = s;
		}
		else // If root is not full, call insertNonFull for root
			root.insertNonFull(k);
	}
}


    
}
