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

import com.dube.impl.MyArrayStack;
import com.dube.impl.MyLinkedStack;
import com.dube.stackinterface.MyStack;

/**
 *
 * @author Enock Lukhetfo Dube <lukhetfomzomba@gmail.com>
 */
public class StackDemoApp {

    public static void main(String[] args) {
        
                
        MyStack<Integer> S = new MyLinkedStack();
        //MyStack<Integer> S = new MyArrayStack();
        S.Push (30); S.Push (10); S.Push (5); 
        S.Push (20); S.Push (70); 
        S.ShowData(); 

        S.Pop(); S.ShowData();
        S.Push (90); S.Push (120); S.Push(80); 
        S.ShowData();	    
    }
    
}
