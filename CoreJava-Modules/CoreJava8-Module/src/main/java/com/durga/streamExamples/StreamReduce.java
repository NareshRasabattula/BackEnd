package com.durga.streamExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author DurgaNaresh
 * @Created 19/05/2023 - 5:43 PM
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success.
 */
public class StreamReduce {

    public static String getLastElementUsingReduce(List<String> valuesList){
        Stream<String> stream = valuesList.stream();
        System.out.println("stream:"+ stream.toString());
        return stream.reduce((first,second) -> second).orElse(null);
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        stringList.add("D");
        System.out.println(getLastElementUsingReduce(stringList));
    }
}
