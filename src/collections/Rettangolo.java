/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;


/**
 *
 * @author cristiana
 */
public class Rettangolo extends Forma{

    private double altezza;
     private double base;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    @Override
    public double getArea() {
        return base*altezza;
    }

    @Override
    public String toString() {
        return super.toString()+ " (altezza=" + altezza + ", base=" + base + ")\n";
    }
    
}
