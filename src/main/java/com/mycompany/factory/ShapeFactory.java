/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factory;

/**
 *
 * @author victor
 */
public class ShapeFactory {
    
    public Shape getShape(String shapeStr) {
        if (shapeStr == null) {
            return null;
        }
        if (shapeStr.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeStr.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (shapeStr.equalsIgnoreCase("square")) {
            return new Square();
        }
        return null;
    }
    
}
