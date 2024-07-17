package org.example.advance;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AdvanceStringOperations
{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Calculate sum
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        // Calculate average
        double average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0); // Default value if list is empty

        // Calculate maximum
        int max = numbers.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(0); // Default value if list is empty

        // Calculate minimum
        int min = numbers.stream()
                .mapToInt(Integer::intValue)
                .min()
                .orElse(0); // Default value if list is empty

        // Print results
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        // Alternatively, using IntSummaryStatistics to get all statistics in one go
        IntSummaryStatistics stats = numbers.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();

        System.out.println("\nUsing IntSummaryStatistics:");
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Maximum: " + stats.getMax());
        System.out.println("Minimum: " + stats.getMin());
    }
    //Given a list of lists of integers, flatten it into a single list of integers.
    public void flatteinginList(String[] args) {
        List<List<Integer>> nestedLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9),
                Arrays.asList(10)
        );

        // Flatten the nested lists into a single list of integers
        List<Integer> flattenedList = nestedLists.stream()
                .flatMap(List::stream) // Flattens each inner list into a stream of integers
                .collect(Collectors.toList()); // Collects all integers into a list

        List<Integer> flattenedList2 = nestedLists.stream()
                .flatMap(list -> list.stream()) // Flattens each inner list into a stream of integers
                .collect(Collectors.toList());
        // Print the flattened list
        System.out.println("Flattened List: " + flattenedList);
        System.out.println(flattenedList2);
    }
    public void generalMaths(){
        List<Integer> numbers = Arrays.asList(5, 8, 12, 3, 15, 7, 1, 10, 14, 2);
        int sum = numbers.stream().reduce(0,(a,b)-> a+b);
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        System.out.println(min.get());
        System.out.println(max.get());
        System.out.println(sum);
    }
}
