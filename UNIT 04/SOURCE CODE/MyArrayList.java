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
public class MyArrayList<T> implements MyList<T>{
    
    static int maxsize = 15;
    private int size;
    private T[] Item;

    public MyArrayList () { 
        this.size = 0;
        this.Item = (T[]) new Object[maxsize];    
    }
   
   public boolean IsEmpty () { return size==0;}
   public boolean IsFull () {return (this.size == maxsize); }
   
 
   public void Insert (T e)
   {
     if (!(this.IsFull()))
     {    this.Item[this.size] = e;
          this.size++;
     }
   }
 
   private void Swap (int i, int j)
   {                                
      T Temp = this.Item[i];
      this.Item[i] = this.Item[j];
      this.Item[j] = Temp;
    } 
   
 
   public void Delete (T e)
    { 
      int index = 0;    
    if  (!(this.IsEmpty()))
      {
        while ((index  < this.size) && (this.Item[index] != e) )
           index++;
        if ((this.Item[index] == e) && (index  <= this.size-1))
        {  
         Swap (index, this.size-1);
            
         this.size--;
        }
      }
    }
  
 public void ShowData ()
    { for (int index = 0; index < this.size; index++)
        System.out.println("\t" + this.Item[index]);
      System.out.println();   
    }
      
}

