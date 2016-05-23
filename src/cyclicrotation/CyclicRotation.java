/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cyclicrotation;

/**
 *
 * @author Ferid
 */
public class CyclicRotation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A [] = {3, 8, 9, 7, 6} ;
        int K = 4;
        
        Solution mySolution = new Solution();
        mySolution.solution(A, K);
    }
    
}
