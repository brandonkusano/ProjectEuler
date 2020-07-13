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
public class FirstPrimeNumber {
    
    
    public static boolean isPrime(double n){
        if(n%2==0){
            return false;
        }
        
        for(int i = 2; i<=n-1; i++ ){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args){
        double counter = 0;
        double value = 0;
        while(counter<10001){
            value += 1;
            if(isPrime(value)){
                counter += 1;
            }
                    
        }
        System.out.println(value);
    }
}
