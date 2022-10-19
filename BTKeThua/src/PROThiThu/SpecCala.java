/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROThiThu;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Administrator
 */
public class SpecCala extends ArrayList<Cala>{
    int color;

    public SpecCala() {
    }

    public SpecCala(int color, String owner, int price) {
        super();
        this.color = color;
    }

    @Override
    public String toString() {
        return "SpecCala{" + "color=" + color + '}';
    }

    
    
}
