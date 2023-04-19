/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factory;

/**
 *
 * @author victor
 */
public class Factory {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape =  factory.getShape("circle");
        System.out.println(shape);
    }
}
