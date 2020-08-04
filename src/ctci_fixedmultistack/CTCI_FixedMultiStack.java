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
public class CTCI_FixedMultiStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FixedMultiStack stack = new FixedMultiStack(5);
        stack.push(1, 3);
        stack.push(1, 4);
        stack.push(1, 5);
        stack.push(1, 6);
        stack.push(1, 7);
        
        stack.push(2, 8);
        stack.push(2, 9);
        stack.push(2, 10);
        stack.push(2, 11);
        stack.push(2, 12);
        
        stack.push(3, 13);
        stack.push(3, 14);
        stack.push(3, 15);
        stack.push(3, 16);
        stack.push(3, 17);
       
        stack.printStack();
        
        int popValue;
        popValue = stack.pop(1);
        System.out.println("\nPopped value:" +popValue);
        popValue = stack.pop(1);
        System.out.println("\nPopped value:" +popValue);
        popValue = stack.pop(2);
        System.out.println("\nPopped value:" +popValue);
        popValue = stack.pop(2);
        System.out.println("\nPopped value:" +popValue);
        popValue = stack.pop(3);
        System.out.println("\nPopped value:" +popValue);
        popValue = stack.pop(3);
        System.out.println("\nPopped value:" +popValue);
        

        
        stack.printStack();
    }
    
}
