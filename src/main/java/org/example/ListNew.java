package org.example;

import javax.swing.*;
import java.util.List;

import static java.util.List.*;


//1. List

public class ListNew {
    public void printValues(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }


    //2. List
    public void printParameters(List<Integer> numbers, int num) {
        numbers.add(num);
        System.out.println(numbers);
    }


    //3. List
    public void printIntegerAndList(List<Integer> number, int index) {
        if (index < number.size()) {
            for (int i = index; i < number.size(); i++) {
                System.out.println(number.get(i));
            }
        }
        else System.out.println("Index depasit");
    }

    //4. List
    public void printAllInList(List<Integer> number){
        for (int i = number.size() -1; i >= 0; i--){
            System.out.println(number.get(i));
        }
    }

    //5. List

    public void addStringParametersToList(List<String> list, int position, String str) {

    }

    }











