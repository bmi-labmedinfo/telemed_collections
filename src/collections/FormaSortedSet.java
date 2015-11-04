/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author cristiana
 */
public class FormaSortedSet {

    public static void main(String[] args) {

        SortedSet<Forma> set = new TreeSet<Forma>();

        Collections.addAll(set, new Rettangolo(7, 3), new Rettangolo(2, 1), new Rettangolo(3, 1), new Rettangolo(3, 2), new Rettangolo(5, 3));

	//TreeSet implements SortedSet and does not need to be ordered
        for (Iterator<Forma> iterator = set.iterator(); iterator.hasNext();) {
            Forma forma = iterator.next();
            System.out.println(forma);

        }
    }
}
