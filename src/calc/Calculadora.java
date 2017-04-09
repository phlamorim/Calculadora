/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

/**
 *
 * @author user
 */
public class Calculadora {
    double x, y;
    
    public Calculadora()
    {
        this.x = 0;
        this.y = 0;
    }
    
    public double getX()
    {
        return this.x;
    }
    
    public boolean setX(double x)
    {
        this.x = x;
        return (this.x == x) ? true : false;
    }
    public double getY()
    {
        return this.y;
    }
    
    public boolean setY(double y)
    {
        this.y = y;
        return (this.y == y) ? true : false;
    }
    
    double somar()
    {
        return (this.x + this.y);
    }
    double subtrair()
    {
        return (this.x - this.y);
    }
    double multiplicar()
    {
        return (this.x * this.y);
    }
    double dividir()
    {
        return (this.x / this.y);
    }
}