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
package com.dube.bintreeinterface;

/**
 *
 * @author Enock Lukhetfo Dube <lukhetfomzomba@gmail.com>
 */
public interface MyBinTree {
    public boolean isEmpty ();
    public void insertNode(int e);
    public boolean removeNode(int e);
    public Object findNode(int e);
    public void traverse(int order);
    public void iterativeTraverse(int order); 
}
