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
public class LatticePath {
    
    public static double binomialCoefficientCalc(int n, int k){
        double nFactorial = 1;
        double kFactorial = 1;
        double nMinusK = 1;
        
        for(int i = 1; i<=n; i++){
            nFactorial *= i;
        }
        for(int i = 1; i<=k; i++){
            kFactorial *= i;
        }
        
        for(int i = 1; i<=(n-k); i++){
            nMinusK *= i;
        }
        return nFactorial / (kFactorial * nMinusK);
        
    }
    
    public static void main(String[] args){
        System.out.println(binomialCoefficientCalc(40, 20));
    }
}
