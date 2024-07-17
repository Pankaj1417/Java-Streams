package org.example.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringGrouper {
    private List<String> fruits;
    public StringGrouper(List<String> fruits){
        this.fruits = fruits;
    }
    public static void main(String[] args) {

    }

//    Purpose: groupBy is used to partition elements of a stream into groups based on a classification function
//    (often called a classifier).
    public Map<Integer, List<String>> groupByLength(){
        return fruits.stream().collect(Collectors.groupingBy((String::length)));
    }

//    Purpose: partitionBy is a specialized form of groupBy where elements of a stream are partitioned into two groups
//    based on a predicate (which results in a boolean).
    public Map<Boolean, List<String>> partitionByLength(){
        return fruits.stream().collect(Collectors.partitioningBy((str -> str.length()%2 == 0)));
    }
}
