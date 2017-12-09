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

    public void pay() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Payment Amount :");
        payment = input.nextDouble();

        try {
            if (payment < 0) {
              ///  System.out.println("Negative Payment : " + payment);
                throw new NegativePaymentException(payment);
            }
        } catch (NegativePaymentException ex) {
            System.out.println(ex.toString()    );
        }

    }

}
