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
public class SpecialPythagoreanTriplet {
    
    public static int triplet(int a, int b){
        double c = Math.sqrt((a*a) + (b*b));
        if(c % 1 == 0){
            return (int) c;
        }else{
            return -1;
        }
    }
    
    public static void main(String[] args){
        int a = 1;
        int b = 2;
        int c = 3;
        while(b<500){
            if(b==499){
                a+=1;
                b=a+1;
            }
            c = triplet(a,b);
            if(a + b + c == 1000){
                System.out.println(a*b*c);
            }
            b += 1;
        }
    }
    
}
