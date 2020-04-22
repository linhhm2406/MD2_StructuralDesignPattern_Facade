package com.codegym;

import java.util.List;

public class RandomListFacade {
    RandomList random = new RandomList();
    ListFilter listFilter =new ListFilter();
    ListPrinter listPrinter =new ListPrinter();
    List<Integer> list;
    List<Integer> filterOdd;

    public void printRandomEvenList(){
        list = random.generateList(50,0,49);
        filterOdd = listFilter.filterOdd(list);
        listPrinter.printList(filterOdd);
    }

    public static void main(String[] args) {
    }
}
