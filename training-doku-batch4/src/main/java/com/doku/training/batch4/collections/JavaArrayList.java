package com.doku.training.batch4.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class JavaArrayList {
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
//Traversing list through Iterator
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        LinkedList<String> al=new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        Iterator<String> iterator=al.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
