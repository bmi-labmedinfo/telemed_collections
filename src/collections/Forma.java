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
public abstract class Forma implements Comparable<Forma> {

    abstract double getArea();

    @Override
    public int compareTo(Forma o) {
        if (this.getArea() < o.getArea()) {
            return -1;
        } else if (this.getArea() > o.getArea()) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        return this.getArea() == ((Forma) obj).getArea() ? true : false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " area=" + this.getArea();
    }

}
