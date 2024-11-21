package ar.edu.tecnica;

/**
 * @author Alison Ramos
 * 
 */

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        ejemploList();
        ejemploSet();
        ejemploMap();
        ejemploQueue();
        ejemploDeque();
        loadSortedSet();
        loadSortedMap();
        ejemploSort();
        ejemploReverse();
        ejemploShuffle();
        ejemploSwap();
        ejemploFill();
        ejemploMin();
        ejemploMax();
    }

    public static void ejemploList() {
        // ArrayList
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        
        System.out.println("ArrayList: " + numeros);
    }

    public static void ejemploSet() {
        // HashSet
        HashSet<Integer> numeros = new HashSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(2);        
        System.out.println("HashSet: " + numeros);
    }

    public static void ejemploQueue() {
        // PriorityQueue
        PriorityQueue<Integer> numeros = new PriorityQueue<>();
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        
        System.out.println("PriorityQueue (poll): " + numeros.poll());
    }

    public static void ejemploDeque() {
        // ArrayDeque
        ArrayDeque<Integer> numeros = new ArrayDeque<>();
        numeros.add(1);
        numeros.addFirst(0); 
        numeros.addLast(2);  
        
        System.out.println("ArrayDeque: " + numeros);
    }

    public static void ejemploMap() {
        // HashMap
        HashMap<String, Integer> numeros = new HashMap<>();
        numeros.put("Uno", 1);
        numeros.put("Dos", 2);
        
        System.out.println("HashMap: " + numeros);
    }

    public static void loadSortedSet() {
        // TreeSet
        TreeSet<Integer> numeros = new TreeSet<>();
        numeros.add(3);
        numeros.add(1);
        
        System.out.println("TreeSet: " + numeros); 
    }

    public static void loadSortedMap() {
        // TreeMap
        TreeMap<String, Integer> numeros = new TreeMap<>();
        numeros.put("B", 2);
        numeros.put("A", 1);
        
        System.out.println("TreeMap: " + numeros);
    }

    public static void ejemploSort() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);

        Collections.sort(list); 
        
       System.out.println("Sorted List: " + list);
    }

    public static void ejemploReverse() {
       ArrayList<Integer> list = new ArrayList<>();
       list.add(1);
       list.add(2);
       list.add(3);

       Collections.reverse(list);
       System.out.println("Reversed List: " + list);
    }

    public static void ejemploShuffle() {
       ArrayList<Integer> list = new ArrayList<>();
       list.add(1);
       list.add(2);
       list.add(3);

       Collections.shuffle(list);
       System.out.println("Shuffled List: " + list);
    }

    public static void ejemploSwap() {
       ArrayList<Integer> list = new ArrayList<>();
       list.add(1);
       list.add(2);

       Collections.swap(list, 0, 1); 

       System.out.println("Swapped List: " + list);
    }

    public static void ejemploFill() {
       ArrayList<Integer> list = new ArrayList<>(Collections.nCopies(5, 0)); 
       Collections.fill(list, 9); 

       System.out.println("Filled List: " + list);
    }

    public static void ejemploMin() {
       ArrayList<Integer> numeros = new ArrayList<>();
       numeros.add(2);
       numeros.add(33);
       numeros.add(-32);

       var min = Collections.min(numeros);

       System.out.println("""
               El mínimo es:
               """ + min);
    }

    public static void ejemploMax() {
       ArrayList<Integer> numeros = new ArrayList<>();
       numeros.add(2);
       numeros.add(33);
       numeros.add(-32);

       var max = Collections.max(numeros);

       System.out.println("""
               El máximo es:
               """ + max);
    }
}

