package org.example.basics.sort;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

    }
//    Given a list of strings, sort them in reverse alphabetical order.
    public List<String> sortInReverseOrder(List<String> words){
        //return words.stream().sorted((a,b)-> b.compareTo(a)).collect(Collectors.toList());
        return words.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
}
