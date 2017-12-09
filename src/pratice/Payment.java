/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratice;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
                throw new Exception();
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

    }

}
