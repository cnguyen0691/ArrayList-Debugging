package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // create an array list
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("Initial size of al: " + al.size());

        // add elements to the array list
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        System.out.println("Size of al after additions: " + al.size());
        al.add(1, "A2");
        System.out.println("Size of al after inserting A2: " + al.size());

        // display the array list
        System.out.println("Contents of al: " + al);
        Collections.sort(al);

        System.out.println("Contents of al: " + al);
        Collections.shuffle(al);

        System.out.println("Contents of al: " + al);
        int searchIndex = Collections.binarySearch(al, "Z");
        if (searchIndex >=0){
            System.out.println("D has been found: " + searchIndex);
        }else{
            System.out.println("D has been found: " + searchIndex);
        }

        // Remove elements from the array list
        al.remove("F");
        al.remove("G");
        al.remove(2);
        System.out.println("Size of al after deletions: " + al.size());
        System.out.println("Contents of al: " + al);
    }
}

