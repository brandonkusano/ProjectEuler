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
public class NumberLetterCounts {
    //The case where you should only get 100, 200, 300. There is no and in onehundred.
    //onehundred becareful of 100 getting the value "onehundredand"
    public static String numberToStringFirst(int n, String s){
        switch(n){
            case 1:
                s += "onehundredand";
                break;
                
            case 2:
                s += "twohundredand";
                break;
                
            case 3:
                s += "threehundredand";
                break;
                
            case 4:
                s += "fourhundredand";
                break;
                
            case 5:
                s += "fivehundredand";
                break;
                
            case 6:
                s += "sixhundredand";
                break;
                
            case 7:
                s += "sevenhundredand";
                break;
                
            case 8:
                s += "eighthundredand";
                break;
                
            case 9:
                s += "ninehundredand";
                break;
                
            case 10:
                s += "onethousand";
                break;
            default:
                System.out.println("This shouldnt happen");
                break;
        }
        
        return s;
    }
    
    //For numbers between 1 and 20;
    public static String numberToStringMiddle(int n, String s){
        switch(n){
            case 0:
                s += "";
                break;
            
            case 2:
                s += "twenty";
                break;
            
            case 3:
                s += "thirty";
                break;
            
            case 4:
                s += "forty";
                break;
                
            case 5:
                s += "fifty";
                break;
                
            case 6:
                s += "sixty";
                break;
                
            case 7:
                s += "seventy";
                break;
                
            case 8:
                s += "eighty";
                break;
                
            case 9:
                s += "ninety";
                break;
            
            default:
                System.out.println("This shouldnt happen tens");
                break;
        }
        return s;
    }
    
    
    public static String numberToStringLast(int n, String s){
        
        switch(n){
            
            case 0:
                s += "";
                break;
            
            case 1:
                s += "one";
                break;
                
            
            case 2:
                s+="two";
                break;
            
            case 3:
                s+="three";
                break;
            
            case 4:
                s+="four";
                break;
            
            case 5:
                s+="five";
                break;
            
            case 6:
                s+="six";
                break;
                
            
            case 7:
                s+="seven";
                break;
    
            case 8:
                s+="eight";
                break;               
             
            case 9:
                s+="nine";
                break;
                
            case 10:
                s+="ten";
                break;
                
            case 11:
                s+="eleven";
                break;
                
            case 12:
                s+="twelve";
                break;
                
            case 13:
                s+="thirteen";
                break;
                
            case 14:
                s+="fourteen";
                break;
                
            case 15:
                s+="fifteen";
                break;
                
            case 16:
                s+="sixteen";
                break;
                
            case 17:
                s+="seventeen";
                break;
                
            case 18:
                s+="eighteen";
                break;
                
            case 19:
                s+="nineteen";
                break;
                
            default:
                System.out.println("1 to 20");
                break;
        }
        return s;
    }
    
    public static void numberTest(){
        int counter = 0;
        String s = "";
        for(int i = 1000; i<= 1000; i++){
            if(i<20){
                System.out.println(i);
            }else if(i>=20 && i<100){
                System.out.println(i/10);
                System.out.println(i%10);
            }else{//Hundreds case
                //
                System.out.println(i/100);
                System.out.println(i%100);
                if(i%100/10>=2){
                    System.out.println(i/100);
                    System.out.println((i%100)/10 + " tens place starting at twenty");//
                    System.out.println(i%10);
                }else{
                    counter += numberToStringFirst(i/100, s).length();
                    counter += numberToStringLast(i%100, s).length();
                    System.out.println(i/100);
                    System.out.println(i%100);
                    System.out.println(counter + "counter");
                }
            }
        }
    }
    
    public static void main(String[] args){
        String s = "";
        int counter = 0;
        for(int i = 1; i<=1000; i++){
            if(i<20){
                //System.out.println(numberToStringLast(i,s).length());
                
                counter += numberToStringLast(i, s).length();
            }else if(i>=20 && i<100){
                //System.out.println(numberToStringMiddle(i/10, s));
                //System.out.println(numberToStringLast(i%10, s));
                //System.out.println(i/10);
                counter += numberToStringMiddle(i/10, s).length();
                counter += numberToStringLast(i%10, s).length();
            }else{
                //System.out.println(numberToStringFirst(i/100, s));
                counter += numberToStringFirst(i/100, s).length();
                if(i%100/10 >= 2){
                    //System.out.println(i%100/10);
                    //System.out.println(numberToStringMiddle((i%100)/10, s));
                    //System.out.println(numberToStringLast(i%10, s));
                    counter += numberToStringMiddle((i%100)/10, s).length();
                    counter += numberToStringLast(i%10, s).length();
                    //System.out.println("This happens");
                }else{
                    //System.out.println("This also happens");
                    //System.out.println(numberToStringLast(i%100, s));
                    counter += numberToStringLast(i%100, s).length();
                }
            }
        }
        System.out.println(s.length());
        System.out.println(counter);
        //numberTest();
    }
}
