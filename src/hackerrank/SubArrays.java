import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args) {
        //read input 
        Scanner sc = new Scanner(System.in);
        int size = 0;
        size = sc.nextInt();
        int [] array = new int[size];
        int index = 0;
        int counter = 0;
        while(sc.hasNextInt()){
             //save to array 
           //  if(sc.nextInt() >= -10000 && sc.nextInt() < 10000)
            array [index] = sc.nextInt();
            index ++;
        }
    
        //iterate once and find index of negative integers 
        for(int i=0; i<size-1; i++){
            //check constraint
            if(size >= 1 && size <= 100){
                
            if(i > 0){
                //get the integer just before the negative integer
                int previous = array[i-1];
                int current = array[i];
                int next = array[i+1];
                System.out.println("prev: " + previous + " curr: " + current + " next:" + next);
                //sum the integer (i-1), the actual negative integer (i) and the next (i+1) integer
                int sum = previous + current + next;
                // sum previous and current. if not negative return 0
                int sumOfPreviousAndCurrent = previous + current;
                if(sumOfPreviousAndCurrent < 0){
                counter++;
                }
                //sum current and next.
                int sumOfCurrentAndNext = current + next;
               if(sumOfCurrentAndNext < 0){
                    counter++;
                }
            //create counter that increments for each negative integer
         if(current < 0){
             counter++;
        // if at least one integer is negative, itarate over the entire array and sum all integers and if negative, increment counter by 1
        int sumOfAllElements = Arrays.stream(array).sum();
        if(sumOfAllElements < 0){
            counter++;
        }
        }                
            if(sum < 0){
                counter ++;
            }
             
            }
            
            else{
                if(array[i] < 0){
                    counter++;
                }
           }
        }
        }
           System.out.println(counter);
        
    
    }
}
/**
https://www.hackerrank.com/challenges/java-negative-subarray/problem?isFullScreen=true
We define the following:

A subarray of an -element array is an array composed from a contiguous block of the original array's elements. For example, if , then the subarrays are , , , , , and . Something like  would not be a subarray as it's not a contiguous subsection of the original array.
The sum of an array is the total sum of its elements.
An array's sum is negative if the total sum of its elements is negative.
An array's sum is positive if the total sum of its elements is positive.
Given an array of  integers, find and print its number of negative subarrays on a new line.

Input Format

The first line contains a single integer, , denoting the length of array .
The second line contains  space-separated integers describing each respective element, , in array .

Constraints

Output Format

Print the number of subarrays of  having negative sums.
*/
