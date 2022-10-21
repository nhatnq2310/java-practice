/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LamQuenVoiDe;

/**
 *
 * @author Administrator
 */
public class Desert {
    
    String name;
    int Step;

    public Desert() {
    }

    public Desert(String name, int Step) {
        this.name = name;
        this.Step = Step;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStep() {
        return Step;
    }

    public void setStep(int Step) {
        this.Step = Step;
    }

    @Override
    public String toString() {
        return "Desert{" + "name=" + name + ", Step=" + Step + '}';
    }

    
    
    
}
