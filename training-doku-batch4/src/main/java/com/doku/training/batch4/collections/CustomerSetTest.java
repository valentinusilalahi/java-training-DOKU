package com.doku.training.batch4.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class CustomerSetTest {
    public static void main(String[] args) {
        Set<Customer> customers = new HashSet<Customer>();
        Customer id1 = new Customer();
        id1.setId(1l);
        customers.add(id1);
        Customer id2 = new Customer();
        id2.setId(2l);
        customers.add(id2);
        Customer c = new Customer();
        c.setId(1l);
        customers.add(c); //mereplace id1 karena mempunyai id yang sama
//        System.out.println(customers.toArray());
//        Iterator<Customer> i = customers.getIterator();
//        while(i.hasNext()){
//            Customer current = i.next();
//            System.out.println("keranjang no-" + current.hashCode()
//                    + " idnya:" + current.getId());
//        }

        //Creating HashSet and adding elements
        HashSet<String> set=new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
//Traversing elements
        Iterator<String> itrs=set.iterator();
        while(itrs.hasNext()){
            System.out.println(itrs.next());
        }

        LinkedHashSet<String> hashSet=new LinkedHashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
