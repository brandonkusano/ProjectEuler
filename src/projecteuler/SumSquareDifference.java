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
public class SumSquareDifference {
    
    public static double sumOfSquares(){
        double total = 0;
        for(int i = 1; i<= 100; i++){
            total += i*i;
        }
        return total;
    }
    
    public static double squareOfSum(){
        double total = 0;
        for(int i = 1; i <= 100; i++){
            total += i;
        }
        return total*total;
    }
    
    public static void main(String[] args){
        System.out.println(squareOfSum() - sumOfSquares());
        
    }
}
