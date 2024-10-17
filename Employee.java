/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collections;

public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;
    
    public Employee(int id, String name, int age, double salary){
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
        
    @Override
    public String toString(){
        return "Employee: " + name + "\n ID: " + id;
    }
    
}
