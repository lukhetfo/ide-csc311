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

import com.dube.listinterface.MyList;

/**
 *
 * @author Enock Lukhetfo Dube <lukhetfomzomba@gmail.com>
 */
public class MyLinkedList<T> implements MyList<T>{
 Node<T> head;

 public  MyLinkedList() {
        head = null;
 }
 
public boolean IsEmpty () 
{return (head == null); }

public boolean IsFull () {
       return false; 
   }
public void Insert (T e){
  Node<T> NewNode = new Node(e,head);
  head = NewNode;
}   

public void Delete (T e)
{  Node CurrNode = head;
   Node PrevNode = null;
 
    while ((CurrNode != null) && (CurrNode.data != e) )
    { // searching for node to delete 
     PrevNode = CurrNode;
     CurrNode = CurrNode.next;  
    }  
     if ((CurrNode != null) && (CurrNode.data == e ))
     { 
          if  (PrevNode == null)  // deleting first node
              head = CurrNode.next;
         else
              PrevNode.next = CurrNode.next;
     }
}

public void ShowData ()
{ while ( this.head != null)                   
 {  System.out.println("\t" + head.data);                                 
    this.head = this.head.next;
 }
 System.out.println();
}
   
}
