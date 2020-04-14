package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

	ArrayList<Integer> arrayList= new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
       for (int i=0;i<6;i++){
         arrayList.add(scanner.nextInt());
       }
        System.out.println(arrayList);
        Collections.sort(arrayList, new ReverseComaparator());
        System.out.println(arrayList);
        int countUnique= 0;
        for (int i=0;i<arrayList.size()-1;i++)
        {
            if (arrayList.get(i).equals(arrayList.get(i + 1))) { }
            else {countUnique++;}
        }
        System.out.println("Количество уникальных чисел: "+countUnique);
    }
}
