import java.io.*;
import java.util.*;

//exercise using HashSet https://www.hackerrank.com/challenges/java-hashset/problem
public class Solution {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Solution sol = new Solution();
       Set <Pair> pairSet = new HashSet<>();
       int co = 0;
       while(sc.hasNext()){
        String input = sc.nextLine();
       
         
        if(input.split(" ").length == 2){
            co ++;
        String firstName = input.split(" ")[0].trim();
        String secondName = input.split(" ")[1].trim();
      //  if(firstName.length() <= 5 && secondName.length() <= 5){
     //   if(firstName.matches("[a-z]+") && secondName.matches("[a-z]+")){
            
        Pair pair = sol.new Pair(firstName,secondName);
        
        if(!pairSet.contains(pair)){
        pairSet.add(pair);
        }
        System.out.println(pairSet.size());
        } 
        
      //  }
     //  }
       }
          
    }
   
   public class Pair {
     String firstName;
     String secondName;
     public Pair(String firstName, String secondName){
        this.firstName = firstName;
        this.secondName = secondName;
     }
  
 
    @Override
public int hashCode() {
    int result = 17; // Start with a non-zero constant
    result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
    result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
    return result;
}
     @Override
     public boolean equals(Object obj){
        if(this == obj){return true;}
          if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Pair that = (Pair) obj;
            return firstName.equals(that.firstName) && 
            secondName.equals(that.secondName);
     }
     @Override 
     public String toString(){
        return "| names: " + this.firstName + " | " + this.secondName + " and code: " + this.hashCode();
     }
     
     
   }
    
}
