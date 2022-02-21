package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List someApprentices = new ArrayList();
        someApprentices.add("Collin");
        someApprentices.add("Amanda");
        someApprentices.add("Ruqayyah");
        someApprentices.add("Julia");
        List moreApprentices = new ArrayList(someApprentices);
        moreApprentices.add("Karri");
        moreApprentices.add("Ehab");

        System.out.println(moreApprentices);

        List<String> stringsOnly = new ArrayList<>();
        stringsOnly.add("House");
        stringsOnly.add("car");
        stringsOnly.add(String.valueOf(true));
        System.out.println(stringsOnly);

        //create arraylist named allStrings with only String type parameter.
        //add the contents of your stringOnly array list to allStrings
        //Add another string object to your allStrings at index 2.
        List<String> allStrings = new ArrayList<>();
        allStrings.addAll(stringsOnly);
        allStrings.add(2, "Person");
        System.out.println(allStrings);
    }
}
