/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratice;

/**
 *
 * @author Yusuf Nurudeen
 */
public class NegativePaymentException extends Exception {
    
    double payment ;
    public NegativePaymentException(double payment){
        this.payment = payment ;
    }
    
    @Override
    public String toString(){
        return "Error Negative Amount has been entered : " + payment ;
    }
    
}
