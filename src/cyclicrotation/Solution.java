/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cyclicrotation;

import java.util.Arrays;

/**
 *
 * @author Ferid
 */
public class Solution {
    public int[] solution(int[] A, int K){
        for (int i = 0;  i <K; i++){
            for(int j = A.length - 1; j > 0; j--){
                int temp = A[j];
                A[j] = A[j-1];
                A[j-1] = temp;
            }
        }
        System.out.println(Arrays.toString(A));
        return null;
    }
}
