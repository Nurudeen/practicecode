/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Yusuf Nurudeen
 */
public class StudentDatabaseApp {
    
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student("Yusuf","123456789");
        
        System.out.println("Test"+student1);
    }
}
