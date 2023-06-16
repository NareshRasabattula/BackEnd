package com.durga.streams;

import com.durga.utils.ArithmeticUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author DurgaNaresh
 * @Created 28/05/2023 - 3:37 PM
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success.
 */
public class StreamSumCalculator {

    public static Integer getSumUsingCustomAccumulator(List<Integer> integers){
          return integers.stream()
                  .reduce(0, ArithmeticUtils::add);
    }

    public static Integer getSumUsingJavaAccumulator(List<Integer> integers){
        return  integers.stream()
                .reduce(0, Integer::sum);
    }

    public static Integer getSumUsingReduce(List<Integer> integers){
        return integers.stream()
                .reduce(0,(a,b) -> a +b);
    }

    public static Integer getSumUsingCollect(List<Integer> integers){
        return integers.stream()
                .collect(Collectors.summingInt(Integer:: intValue));
    }

    public static Integer getSumUsingSum(List<Integer> integers){
        return integers.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static Integer getSumOfMapValues(Map<Object, Integer> map){
        return map.values()
                .stream()
                .mapToInt(Integer::valueOf)
                .sum();
    }

    public static Integer getSumIntegerFromString(String str){
        Integer sum = Arrays.stream(str.split(" "))
                .filter((s) -> s.matches("\\d+"))
                .mapToInt(Integer::valueOf)
                .sum();
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        Integer sum1 = StreamSumCalculator.getSumUsingCustomAccumulator(integers);
        System.out.println("getSumUsingCustomAccumulator:"+sum1);
        Integer sum2 = StreamSumCalculator.getSumUsingJavaAccumulator(integers);
        System.out.println("getSumUsingJavaAccumulator:"+sum2);
        Integer sum3 = StreamSumCalculator.getSumUsingReduce(integers);
        System.out.println("getSumUsingReduce:"+sum3);
        Integer sum4 = StreamSumCalculator.getSumUsingCollect(integers);
        System.out.println("getSumUsingCollect:"+sum4);
        Integer sum5 = StreamSumCalculator.getSumUsingSum(integers);
        System.out.println("getSumUsingSum:"+sum5);
        Item item1 = new Item(1, 10);
        Item item2 = new Item(2, 15);
        Item item3 = new Item(3, 25);
        Item item4 = new Item(4, 40);

        List<Item> items = Arrays.asList(item1, item2, item3, item4);


    }
}
