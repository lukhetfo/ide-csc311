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
package com.dube.impl;

import com.dube.stackinterface.MyStack;

/**
 *
 * @author Enock Lukhetfo Dube <lukhetfomzomba@gmail.com>
 */
public class MyLinkedStack<T> implements MyStack<T> {
 Node<T> top;

 public  MyLinkedStack() {
        top = null;
 }
 
public boolean IsEmpty () 
{return (top == null); }

public boolean IsFull () {
       return false; 
   }
public void Push (T e){
  Node<T> NewNode = new Node(e,top);
  top = NewNode;
}   

public void Pop ()
{   if (!(this.IsEmpty()))
    this.top = this.top.next;
}

public void ShowData ()
{ while ( this.top != null)                   
 {  System.out.println("\t" + this.top.data);                                 
    this.top = this.top.next;
 }
 System.out.println();
}
   
}
