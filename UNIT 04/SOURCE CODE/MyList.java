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
package com.dube.listinterface;

/**
 *
 * @author Enock Lukhetfo Dube <lukhetfomzomba@gmail.com>
 */
public interface MyList<T> {
    boolean IsEmpty ();
    boolean IsFull ();
    void Insert (T e);
    void Delete (T e);
    void ShowData ();
}
