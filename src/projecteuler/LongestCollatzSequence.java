/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

/**
 *
 * @author BK
 */
public class LongestCollatzSequence {
    
    public static int collatzCounter(double n){
        int counter = 0;
        while(n!=1){
            if(n%2==0){
                n = n/2;
            }else{
                n = 3*n + 1;
            }
            counter += 1;
            //System.out.println(n);
        }
        
        return counter;
    }
    //113382
    public static void main(String[] args){
        int holder = 0;
        int longestChainNumber = 0;
        for(int i = 1; i<1000000; i++){
            if(holder<collatzCounter(i)){
                longestChainNumber = i;
                holder = collatzCounter(i);
                System.out.println(i);
            }
        }
        System.out.println(longestChainNumber);
        
        
    }
}
