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

/**
 *
 * @author Enock Lukhetfo Dube <lukhetfomzomba@gmail.com>
 */
public class Node<T> {
   T data;
   Node next; 

    public Node() {
    }

    public Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(T data) {
        this.data = data;
        this.next = null;
    } 
}

