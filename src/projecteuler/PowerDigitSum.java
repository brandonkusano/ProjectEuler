/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.math.BigDecimal;

/**
 *
 * @author BK
 */
public class PowerDigitSum {
    
    public static void main(String[] args){
        //System.out.println(Math.pow(2, 1000)/Math.pow(10, 290));
        
        //System.out.println(Math.pow(2, 3) * Math.pow(2, 1));
        //System.out.println(Math.pow(2,4));
        //1.0715086071862673  16 E301 - 16 = 285;
        BigDecimal big = new BigDecimal(2);
        BigDecimal big2 = big.pow(1000);
        System.out.println(big2);
        
        //System.out.println(big);
        String s = String.valueOf(big2);
        int holder = 0;
        for(int i = 0; i<s.length(); i++){
            holder += Integer.parseInt(s.substring(i, i+1));
            //System.out.println(s.substring(i, i+1));
        }
        System.out.println(holder);
    }
}
