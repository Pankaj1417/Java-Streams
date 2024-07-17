package org.example.basics.reduction;

import java.util.List;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args) {

    }
//    Given a list of integers, find the product of all elements.
    long getProductOfNumbers(List<Integer> numbers){
        return numbers.stream().reduce(1,(a,b)-> a*b);
    }
}
