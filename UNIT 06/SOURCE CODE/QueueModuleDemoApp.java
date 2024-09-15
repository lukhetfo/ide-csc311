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

import com.dube.impl.MyCircularArrayQueue;

/**
 *
 * @author Enock Lukhetfo Dube <lukhetfomzomba@gmail.com>
 */
public class QueueModuleDemoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MyCircularArrayQueue Q = new MyCircularArrayQueue();
        Q.Enqueue (30); Q.Enqueue (10); Q.Enqueue (5); 
        Q.Enqueue (20); Q.Enqueue (70); 
        Q.Enqueue (30); Q.Enqueue (10); 
        Q.ShowData();
        Q.Dequeue();
        Q.Dequeue();
        Q.ShowData();
        Q.Dequeue();
        Q.Enqueue (200);
        Q.Enqueue (600);
        Q.ShowData();
    }
    
}

