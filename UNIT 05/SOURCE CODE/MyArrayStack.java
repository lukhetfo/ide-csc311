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
package com.dube.impl;

import com.dube.stackinterface.MyStack;

/**
 *
 * @author Enock Lukhetfo Dube <lukhetfomzomba@gmail.com>
 */
public class MyArrayStack<T> implements MyStack<T>{
    
    static int maxsize = 15;
    private int size;
    private T[] Item;

    public MyArrayStack () { 
        this.size = 0;
        this.Item = (T[]) new Object[maxsize];    
    }
   
 /**
 * Determines is stack is empty
 * @param 
 * @return return true is size(number of items) in stack is 0, and false otherwise
 */ 
   public boolean IsEmpty () { return size==0;}
   
 /**
 * Determines if stack is full and cannot add more items
 * @param 
 * @return return true is size(number of items) in stack is maxsize, and false otherwise
 */
   public boolean IsFull () {
       return (this.size == maxsize); 
   }
   
 /**
 * Add a new item e into the stack
 * @param  e - the item to be added to the stack
 * 
 */
   public void Push (T e)
   {
     if (!(this.IsFull()))
     {    
       this.Item[this.size] = e;
       this.size += 1; 
     }
   }
 
   public void Pop () {   
    if  (!(this.IsEmpty()))
         this.size--;
      }
    
  
  public int TopIndex () {
     if (!(this.IsEmpty()))
      return (this.size-1);
     else 
      return -1;
 }

/**
 * Display all items values on the list to standard output
 */
public void  ShowData () {       
        while (!(this.IsEmpty())) 
        {
            System.out.println( this.Item[this.TopIndex()] + "\t");
             this.Pop();
        }
	System.out.println();	
    }
}

