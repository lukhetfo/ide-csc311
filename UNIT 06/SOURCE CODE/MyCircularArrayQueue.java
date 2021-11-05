

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

import com.dube.queueinterface.MyQueue;

/**
 *
 * @author Enock Lukhetfo Dube <lukhetfomzomba@gmail.com>
 */
public class MyCircularArrayQueue implements MyQueue{

static int MaxQueue = 5;

// data members - usually private
private int[] Items;
private int Front;  //index of front element
private int Rear ;  //index of rear element
private int Count ; //number of elements   

    
public MyCircularArrayQueue(){
 this.Front  = -1;
 this.Rear   = -1;
 this.Count  = 0;
 this.Items = new int[MaxQueue];  
}

public boolean IsEmpty () { return (this.Count==0);}
public boolean IsFull () {return (Count  == MaxQueue); }

public void Enqueue (int e) { 
    if ((Front == 0 && Rear == MaxQueue-1) || 
            (Rear == (Front-1)%(MaxQueue-1))) 
    { 
        System.out.println("\nQueue is Full"); 
        return; 
    } 
  
    else if (Front == -1) /* Insert First Element */
    { 
        Front = Rear = 0; 
        Items[Rear] = e; 
        Count++;
    } 
  
    else if (Rear == MaxQueue-1 && Front != 0) 
    { 
        Rear = 0; 
        Items[Rear] = e;
        Count++;
    } 
  
    else
    { 
        Rear++; 
        Items[Rear] = e; 
    } 
}   
   
                            
public int Dequeue (){ 
    if (Front == -1) 
    { 
        System.out.println("\nQueue is Empty"); 
        return -1; 
    } 
  
    int data = Items[Front]; 
    Items[Front] = -1; 
    if (Front == Rear) 
    { 
        Front = -1; 
        Rear = -1; 
    } 
    else if (Front == MaxQueue-1) 
        Front = 0; 
    else
        Front++; 
  return data;
}

 public int QueueFront () {  
     if (this.Count > 0){
       if (this.Front == -1)
             return (this.Items[0]);
         else
             return (this.Items[Front]);  
     }            
     return -1;
 }


public void ShowData ()
{   
    if (Front == -1) 
    { 
        System.out.println("\nQueue is Empty"); 
        return; 
    } 
    System.out.println("\nElements in Circular Queue are: "); 
    if (Rear >= Front) 
    { 
        for (int i = Front; i <= Rear; i++) 
            System.out.print(Items[i]  +"\t"); 
    } 
    else
    { 
        for (int i = Front; i < Count; i++) 
            System.out.print(Items[i] +"\t"); 
  
        for (int i = 0; i <= Rear; i++) 
            System.out.print(Items[i]+"\t"); 
    } 
}

}

