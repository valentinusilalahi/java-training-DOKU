package com.doku.training.batch4.collections;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("z");
        System.out.println("isi dari list : ");
        for(int i=0; i< list.size();i++) {
            System.out.println("index ke-" + i + ":" + list.get(i) );
        }
    }
}
