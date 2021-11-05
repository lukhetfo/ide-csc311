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
package com.dube.stackinterface;

/**
 *
 * @author Enock Lukhetfo Dube <lukhetfomzomba@gmail.com>
 */
public interface MyStack<T> {
    boolean IsEmpty ();
    void Push (T e);
    void Pop ();
    void ShowData ();
}
