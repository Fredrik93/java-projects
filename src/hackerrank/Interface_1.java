import java.util.*;
interface AdvancedArithmetic{
  int divisor_sum(int n);
}



class MyCalculator implements AdvancedArithmetic {
    
    @Override
    public int divisor_sum(int n){
        int sumOfDivisors = 0;
        //iterate over all items. shift right ( +1 ) so we dont divide by zero
        for(int i=1; i<n+1; i++){
        //check if the are divisors. they would be if modulo is 0 i.e., no decimals
            if(n%i == 0){
                // sum divisors
                sumOfDivisors += i;
            }
        }
    return sumOfDivisors;    
    }
}

class Solution{
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
      	sc.close();
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}

