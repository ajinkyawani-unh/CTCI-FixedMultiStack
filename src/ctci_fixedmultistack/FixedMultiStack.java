/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctci_fixedmultistack;

/**
 *
 * @author ajinkyawani
 */
public class FixedMultiStack {
    private int numberOfStacks = 3;
    private int stackValues[];
    private int currentStackSizes[];
    private int stackCapacity;
    
    public FixedMultiStack(int stackCapacity){
        this.stackCapacity = stackCapacity;
        this.currentStackSizes = new int[this.numberOfStacks];
        this.stackValues = new int[this.numberOfStacks * this.stackCapacity];
    }
    
    public boolean isEmpty(int stackNum) {
        return this.currentStackSizes[stackNum] == 0;
    }
}
