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
public class Student {
    
    private String name ;
    private String SSN ;
    private static String ID ;
    private String phone ;
    private String city ;
    private String state ;
    private String emailID ;
    
    public Student(){
        
    }
    
    public Student(String name , String SSN){
        this.name = name ;
        this.SSN = SSN ;
        
        this.emailID = name+"@yusuf.com";
    }
    
    
    public void enroll(){
        
    }
    public void pay(){
        
    }
    
    public String checkBalance(){
        
        
        return "";
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        
        return "["+name + " " + SSN + "]" ;
    }
        
    public void showCourses(){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public static String getID() {
        return ID;
    }

    public static void setID(String ID) {
        Student.ID = ID;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    
    
}
