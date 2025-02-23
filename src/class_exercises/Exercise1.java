import java.io.*;
import java.util.*;
import java.math.BigInteger;

// Testing out BigInteger 
public class Exercise1 {

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    BigInteger a = null;
    BigInteger b = null;
   while(sc.hasNext()){
    String input = sc.nextLine();
 if(a == null){
    a = new BigInteger(input);}
    else {b = new BigInteger(input);}
    
   }
   System.out.println(a.add(b));
   System.out.println(a.multiply(b));
  }
}
