package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>(5);
        ArrayList<String> listB = new ArrayList<>(5);
        ArrayList<String> listC = new ArrayList<>(10);
        Scanner scanner = new Scanner(System.in);
        int numberA = 1;
        int numberB = 1;


        System.out.println("Введите строки в список A: ");
        while (listA.size() < 5) {
            System.out.print(numberA + ": ");
            String s = scanner.nextLine();
            listA.add(s);
            numberA++;
        }
        listA.toArray();
        System.out.println("Список A: " + listA);
        System.out.println();

        System.out.println("Введите строки в список B: ");
        while (listB.size() < 5) {
            System.out.print(numberB + ": ");
            String s = scanner.nextLine();
            listB.add(s);
            numberB++;
        }
        listB.toArray();
        System.out.println("Список B: " + listB);
        System.out.println();

        Collections.reverse(listB);

        Iterator iteratorA = listA.iterator();
        Iterator iteratorB = listB.iterator();

        while (iteratorA.hasNext() || iteratorB.hasNext()) {
            listC.add((String) iteratorA.next());
            listC.add((String) iteratorB.next());
        }
        System.out.println("Список C: " + listC);
    }
}
