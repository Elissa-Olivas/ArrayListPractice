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

    }
}
