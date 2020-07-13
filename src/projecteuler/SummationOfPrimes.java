/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;
import java.util.ArrayList;

/**
 *
 * @author BK
 */
public class SummationOfPrimes {
    
    public static boolean isPrime(double n, ArrayList<Integer> listOfPrimes){
        if(n==2){
            return true;
        }
        if(n==1){
            return false;
        }
        //First case 5 is prime.
        if(n%5==0){
            return false;
        }
        if(n%2==0){
            return false;
        }
        for(int i = 0; i<listOfPrimes.size(); i++){
            if(n%listOfPrimes.get(i)==0){
                return false;
            }
        }
        for(int i = 2; i<Math.floor(Math.sqrt(n)); i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args){
        double counter = 0;
        ArrayList<Integer> holder = new ArrayList<Integer>();
        for(int i = 1; i<=2000000; i++ ){
            if(isPrime(i, holder)){
                System.out.println(i);
                counter += i;
                holder.add(i);
            }
        }
        System.out.println(counter);
    }
}
