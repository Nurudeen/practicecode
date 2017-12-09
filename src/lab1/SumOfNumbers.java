/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Yusuf Nurudeen
 */
public class SumOfNumbers {
    
    
    public int getSumOfNumber(int n){
 
        int sum = 0 ;
        for(int i = 1 ; i <= n ; i++){
            
            sum = sum + i ;
           System.out.println("test" + sum);
        }
        
        System.out.println("===================");
  
        return sum ;
    }
    
}
