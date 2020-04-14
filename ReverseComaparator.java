package com.company;

import java.util.Comparator;

public class ReverseComaparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1==4) return -1;
    if (o1<100) return  o1-o2 ;
        return o1;
    }



}
