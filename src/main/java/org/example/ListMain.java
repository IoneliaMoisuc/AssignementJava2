package org.example;


import java.util.ArrayList;
import java.util.List;


public class ListMain {
    public static void main (String[]args){
        ListNew list = new ListNew();
        List<Integer> integerList = new ArrayList<>();
        integerList.add(6);
        integerList.add(12);
        integerList.add(20);
        integerList.add(30);

        list.printValues(integerList);
        list.printParameters(integerList, 2);

        list.printIntegerAndList(integerList,1);
        list.printAllInList(integerList);



    }
}
