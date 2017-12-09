/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratice;

import java.util.Scanner;

/**
 *
 * @author Yusuf Nurudeen
 */
public class Payment {

    double payment = 0;
    boolean isNegative = true;

    public void pay() {
        Scanner input = new Scanner(System.in);
        do {
            try {

                System.out.print("Enter Payment Amount :");
                payment = input.nextDouble();
                if (payment < 0) {
                    throw new NegativePaymentException(payment);
                } else {
                    isNegative = false;
                }
            } catch (NegativePaymentException ex) {
                System.out.println(ex.toString());
                 System.out.println("Please try again");
            }

        } while (isNegative);
        
        System.out.println("Thanks for making payment "+payment);

    }

}
