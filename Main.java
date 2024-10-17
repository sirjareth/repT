/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collections;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        
        employees.add(new Employee(01, "Jareth", 24, 15000));
        employees.add(new Employee(02, "James", 25, 60000));  
        
        System.out.println(employees.get(0));
        System.out.println(employees.get(1));
    }
}
