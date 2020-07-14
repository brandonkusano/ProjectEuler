/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectEuler.src.projecteuler;

/**
 *
 * @author Brandon
 */
public class HighlyDivisibleTriangularNumber {
    
    public static int getMultiplesThatDivide(double n, double total){
        int counter = 1;
        while(n < (total/2)){
            n+=n;
            
            if(n%total==0){
                counter += 1;
            }
            
        }
        return counter;
    }
    
    public static int counter(double n){
        int counter = 0;
        for(int i = 1; i<= Math.floor(Math.sqrt(n)); i++){
            if(n%i == 0){
                counter += 1;
            }
        }
        return counter;
    }
    
    public static boolean divisors(double n){
        int counter = 1;
        for(int i = 1; i<= Math.floor(Math.sqrt(n)); i++){
            if(n%i == 0){
                counter += 1;
                counter += getMultiplesThatDivide(i, n);
            }
        }
        if(counter>500){
            return false;
        }else{
            return true;
        }
    }
    
    
    public static void main(String[] args){
        double n = 1;
        double total = n;
        int largestCounterTracker = 0;
        while(divisors(total)){
            if(counter(total)>largestCounterTracker){
                largestCounterTracker = counter(total);
                System.out.println(largestCounterTracker);
            }
            n += 1;
            System.out.println(n);
            total += n;
        }
        //System.out.println(Math.floor(28/2));
        System.out.println(total);
        
        
    }
    
}
