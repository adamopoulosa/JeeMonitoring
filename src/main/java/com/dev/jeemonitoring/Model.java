/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.jeemonitoring;

/**
 *
 * @author root
 */
public class Model {
   
    String propertyOne ;
    String propertyTwo ;

    public Model(String propertyOne, String propertyTwo) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
    }

    public String getPropertyOne() {
        return propertyOne;
    }

    public void setPropertyOne(String propertyOne) {
        this.propertyOne = propertyOne;
    }

    public String getPropertyTwo() {
        return propertyTwo;
    }

    public void setPropertyTwo(String propertyTwo) {
        this.propertyTwo = propertyTwo;
    }

    @Override
    public String toString() {
        return "Model{" + "propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + '}';
    }
    
    
    
    
}
