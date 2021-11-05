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
package com.dube.clientapp;

import com.dube.impl.MyArrayList;
import com.dube.impl.MyLinkedList;
import com.dube.listinterface.MyList;

/**
 *
 * @author Enock Lukhetfo Dube <lukhetfomzomba@gmail.com>
 */
public class UOListDemoApp {

    public static void main(String[] args) {
        
        //MyArrayList<Object> L = new MyArrayList();
	//MyLinkedList<Object> L = new MyLinkedList();  
        
        MyList<String> L = new MyArrayList();
        //MyList<String> L = new MyLinkedList();
	L.Insert ("musa"); 
        L.Insert ("Lucky");  
        L.Insert ("jane");
	L.ShowData ();
              
        L.Delete("Lucky");
        L.ShowData ();
               
	L.Delete ("musa"); 
	L.ShowData ();
	    
    }
    
}
