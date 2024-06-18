package CalculatorTest2;

import Calculator2.Calculator2;

public class CalculatorTest2 {
    public static void main(String[] args) { 
        double person1 = 10;
        System.out.println(Calculator2.findTotal(person1));
        
        double person2 = 12;
        System.out.printf("%.1f%n", Calculator2.findTotal(person2));
        
        double person3 = 9;
        System.out.printf("%.1f%n", Calculator2.findTotal(person3));
        
        double person4 = 8;
        System.out.printf("%.1f%n", Calculator2.findTotal(person4));
        
        double person5 = 7;
        System.out.printf("%.1f%n", Calculator2.findTotal(person5));
        
        double person6 = 15;
        System.out.printf("%.1f%n", Calculator2.findTotal(person6));
        
        double person7 = 11;
        System.out.printf("%.1f%n", Calculator2.findTotal(person7));
        
        double person8 = 30;
        System.out.printf("%.1f%n", Calculator2.findTotal(person8));
    }
}
