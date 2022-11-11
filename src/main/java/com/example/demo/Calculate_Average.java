package com.example.demo;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Calculate_Average{

 List<Integer> numbers = Arrays.asList(21,35,61,72);

 double avg = numbers.stream().mapToDouble(num -> num).average().getAsDouble();

	System.out.println("Average by Stream API= " + avg);
}
