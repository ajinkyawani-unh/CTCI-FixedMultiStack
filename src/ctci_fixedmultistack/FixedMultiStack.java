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
    
    public void push(int stackNum, int value) {
        int stackIndex;
        if (! this.isFull(stackNum)){
        stackIndex = this.getStackIndex(stackNum);
        this.stackValues[stackIndex] = value;
        this.currentStackSizes[stackNum - 1]++;
        }
        else
            System.out.println("\n Stack: " +stackNum+ " is full");
    }
    
    public int pop(int stackNum){
        if(! this.isEmpty(stackNum)){
            int offset;
            if (stackNum == 1)
                offset = 0;
            else if (stackNum == 2)
                offset = 5;
            else
                offset = 10;
        
            int size = this.currentStackSizes[stackNum - 1];
            this.currentStackSizes[stackNum - 1]--;
            int topLocation = 5 - size;
            int value = this.stackValues[offset + topLocation];
            this.stackValues[offset + topLocation] = 0;
            return value;
        }
        else
            return 0;
    }
    
    public void printStack() {
        for(int i = 0; i < (this.numberOfStacks * this.stackCapacity); i++) {
            System.out.println("\n" +this.stackValues[i]);
        }
    }
    
    private int getStackIndex(int stackNum){
        //int offset = stackNum * this.stackCapacity;
        int offset;
        if (stackNum == 1)
            offset = 4;
        else if (stackNum == 2)
            offset = 9;
        else
            offset = 14;
                   
        int size = this.currentStackSizes[stackNum - 1];
      
        return offset - size;
    }
    
    private boolean isFull(int stackNum){
        return this.currentStackSizes[stackNum - 1] == 5;
    }
    
    private boolean isEmpty(int stackNum) {
        return this.currentStackSizes[stackNum - 1] == 0;
    }
}
