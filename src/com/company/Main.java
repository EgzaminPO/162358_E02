package com.company;

import java.time.LocalTime;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.io.File;
public class Main {
    public static void main(String[] args) {
        //System.out.println("Witaj egzaminie!");

        //testy zad1 Integer
        Integer[] testInt = new Integer[10];
        Integer[] testIntf = new Integer[10];
        for(int i = 0; i < testInt.length; i++){
            testInt[i] = i;
        }
        for(int i = 0; i < testIntf.length; i++){
            testIntf[i] = i;
        }
        testIntf[3] = 0;

        for (Integer integer : testInt) {
            System.out.print(integer);
        }
        System.out.print(" -> ");

        System.out.println(isSorted(testInt));//true
        for (Integer integer : testIntf) {
            System.out.print(integer);
        }
        System.out.print(" -> ");
        System.out.println(isSorted(testIntf));//false


        //testy zad1 LocalTime
        LocalTime[] testTime = new LocalTime[3];
        LocalTime[] testTimef = new LocalTime[3];
        testTime[0] = LocalTime.of(10, 15);
        testTime[1] = LocalTime.of(10, 20);
        testTime[2] = LocalTime.of(10, 25);

        testTimef[0] = LocalTime.of(11, 25);
        testTimef[1] = LocalTime.of(10, 25);
        testTimef[2] = LocalTime.of(8, 25);

        for(int i = 0; i < testTime.length; i++){
            System.out.print(testTime[i].toString());
            if(!(i == testTime.length-1)){
                System.out.print(", ");
            } else {
                System.out.print(" -> ");
            }
        }
        System.out.println(isSorted(testTime));//true
        for(int i = 0; i < testTimef.length; i++){
            System.out.print(testTimef[i].toString());
            if(!(i == testTimef.length-1)){
                System.out.print(", ");
            } else {
                System.out.print(" -> ");
            }
        }
        System.out.println(isSorted(testTimef));//false


        String[] testString = new String[3];
        String[] testStringf = new String[3];
        testString[0] = "abc";
        testString[1] = "bbc";
        testString[2] = "cbc";

        testStringf[0] = "gbc";
        testStringf[1] = "zbc";
        testStringf[2] = "cbc";

        for(int i = 0; i < testString.length; i++){
            System.out.print(testString[i]);
            if(!(i == testString.length-1)){
                System.out.print(", ");
            } else {
                System.out.print(" -> ");
            }
        }
        System.out.println(isSorted(testString));//true

        for(int i = 0; i < testStringf.length; i++){
            System.out.print(testStringf[i]);
            if(!(i == testStringf.length-1)){
                System.out.print(", ");
            } else {
                System.out.print(" -> ");
            }
        }
        System.out.println(isSorted(testStringf));//false

        //Testy do zad2
        ArrayList<Integer> testIter = new ArrayList<>();
        for(int i = 0; i < 8; i++){
            testIter.add(i*3);
        }
        print(testIter);

        LinkedList<Integer> testIter2 = new LinkedList<>();
        for(int i = 0; i < 8; i++){
            testIter2.add(i*4);
        }
        print(testIter2);

        Stack<Integer> testIter3 = new Stack<>();
        for(int i = 0; i < 8; i++){
            testIter3.push(i*5);
        }
        print(testIter3);

        //test do zad3
        String lokalizacja = "A:\\Pulpit\\testEgz";
        File[] pliki = allSubdirs(lokalizacja);
        for(int i = 0; i < pliki.length; i++){
            System.out.println(pliki[i].toString());
        }
        //System.out.println(allSubdirs().toString());

    }


    public static  <T extends Comparable<T>> boolean isSorted(T[] tab){
    //niemalejąco, czyli stale albo rosnąco
        for(int i = 0; i < tab.length - 1; i++){
            if(tab[i].compareTo(tab[i+1])>0){
                return false;
            }
        }
            return true;
    }

    public static <E, I extends Iterable<E>> void print(I obj){
        System.out.print("[");
        ArrayList<String> wynik = new ArrayList<>();
        Iterator iter = obj.iterator();
        while(iter.hasNext()){
            wynik.add(iter.next().toString());
        }
        System.out.print(String.join(",",wynik));
        System.out.print("]\n");
    }

    public static File[] allSubdirs(String location){
        File plik = new File(location);
        File[] pliki = plik.listFiles();
        /*File[] wynik = pliki;
        for(int i = 0; i < pliki.length; i++){
            if(pliki[i].isDirectory()){
                wynik.push(pliki[i]);
            }
        }*/
        return pliki;

    }

}