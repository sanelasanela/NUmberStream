/*
Step 1: Filter a list of numbers and only output the even numbers.

Step 2: Use 'map' and double each number in the list.

Step 3: Sort the list in ascending order.

Step 4: Perform a 'reduce' operation to calculate the sum of all numbers in the list.

Step 5: Use 'forEach' and output each processed number.

Step 6: Collect the processed numbers into a new list using 'collect'.

 */

package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

            // Step 1: Filter a list of numbers and only output the even numbers.
            List<Integer> numbers = Arrays.asList(11, 256, 483, 214, 5, 86);
            List<Integer> evenNumbers = numbers.stream()
                    .filter(number -> number % 2 == 0)
                    .collect(Collectors.toList());
            System.out.println("Even numbers: " + evenNumbers);


           //count number in List
            long count = numbers.stream().count();
            System.out.println("Count is: " + count);



            // Use 'map' and double each number in the list
            List<Integer> doubledNumbers = numbers.stream()
                    .map(number -> number * 2)
                    .collect(Collectors.toList());
            System.out.println("Doubled numbers: " + doubledNumbers);


            // Step 3: Sort the list in ascending order
            List<Integer> sortedNumbers = numbers.stream()
                    .sorted()
                    .collect(Collectors.toList());
            System.out.println("Sorted numbers: " + sortedNumbers);


            // Perform a 'reduce' operation to calculate the sum of all numbers in the list
            int sum = numbers.stream()
                    .reduce(0, Integer::sum);
            System.out.println("Sum is: " + sum);


            //  Use 'forEach' and output each processed number.
            System.out.print("Processed fff: ");
            numbers.stream()
                    .map(number -> number * 2)
                    .forEach(number -> System.out.print(number + " "));
            System.out.println();


            // Collect the processed numbers into a new list using 'collect'.
            List<Integer> processedNumbers = numbers.stream()
                    .map(number -> number * 2)
                    .collect(Collectors.toList());
            System.out.println("Processed numbers kkkkkkcollected into a new list: " + processedNumbers);
        }

    }
