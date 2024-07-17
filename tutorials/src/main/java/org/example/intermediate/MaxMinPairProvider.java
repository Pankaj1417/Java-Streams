package org.example.intermediate;

import java.util.List;
import java.util.Optional;

public class MaxMinPairProvider {
    private List<Integer> numbers;
    public MaxMinPairProvider(List<Integer> numbers){
        this.numbers = numbers;
    }

//    Given a list of integers, find the maximum and minimum values
    MaxMinPair getMaxMinPair(){
    if(numbers == null || numbers.isEmpty()) return new MaxMinPair(Integer.MAX_VALUE,Integer.MIN_VALUE);
        MaxMinPair maxMinPair = new MaxMinPair();
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        maxMinPair.setMax(max.get());
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        maxMinPair.setMin(min.get());
        return maxMinPair;
    }
    class MaxMinPair {
        int max;
        int min;

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }

        public MaxMinPair(int max, int min){
            this.max = max;
            this.min = min;
        }
        public MaxMinPair(){

        }

    }
}
