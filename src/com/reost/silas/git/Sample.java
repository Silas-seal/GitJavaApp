/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reost.silas.git;

/**
 *
 * @author Silas
 */
public class Sample {
    
    public Sample() {
        
    }
    
    public void sayHello() {
        System.out.println("Hello World! Jesus is coming.");
    }
    
    /**
     * For adding all arguments
     * @param ints
     * @return 
     */
    public double add(double... ints) {
        
        double sum = 0;
        
        for(double a : ints) {
            sum+=a;
        }
        
        return sum;
        
    }
    
    /**
     * For multiplying arguments
     * @param ints
     * @return 
     */
    public double mult(double... ints) {
        
        double product = 1;
        
        for(double a : ints) {
            product *= a;
        }
        
        return product;
        
    }
    
    public String getName() {
        return "Jesus";
    }
    
}
