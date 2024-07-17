package org.example.basics.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        List<Integer> list = new ArrayList<>(Arrays.asList(100,1,2,3,4,4354,6656,76));
       main.print(main.getEvens(list));
    }
    public void print(List<Integer> list){
        for(int x : list){
            System.out.println(x);
        }
    }

    //Function to filter out odd numbers from list
    List<Integer> getEvens(List<Integer> numbers){
        return numbers.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
    }
    //Given a list of integers, filter out the even numbers and then double each of
    // the remaining numbers. Return the resulting list.
    // List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    // Expected output: [2, 6, 10, 14, 18]
    List<Integer> getOddNumbersFromList(List<Integer> numbers){
        return numbers.stream().filter(n -> n%2 != 0).map(n -> n*2).collect(Collectors.toList());
    }

}
