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
public class SmallestMultiple {
    
    public static boolean valueCheck(int n){
        
        for(int i = 1; i <= 20; i++){
            if(n%i!=0){
                return false;
            }
        }
        return true;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean loopExit = true;
        
        int counter = 20;
        while(loopExit){
            if(valueCheck(counter)){
                loopExit = false;
            }
        counter += 1;
        }
        
        System.out.println(counter);
    }
}
