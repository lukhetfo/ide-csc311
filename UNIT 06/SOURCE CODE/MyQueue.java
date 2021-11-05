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
package com.dube.queueinterface;

/**
 *
 * @author Enock Lukhetfo Dube <lukhetfomzomba@gmail.com>
 */
public interface MyQueue {
    public boolean IsEmpty  ();
    boolean IsFull   ();
    public void  Enqueue  (int e);
    public int  Dequeue  (); 
    public int QueueFront ();
    public void  ShowData ();   
}
