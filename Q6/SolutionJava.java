/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.signup.codesignalquestions;

import java.util.Arrays;

/**
 *
 * @author hp
 */
public class Q3 {
    
    static int[] solution(int[] a) {
    char [] [] temp = new char [a.length][];
    int [] sol;
    
    for(int i=0;i<a.length;i++){
        char[] element = String.valueOf(a[i]).toCharArray(); 
        temp[i] = element;
    }
    
    int numOfAllElements=0;
    for(int i=0;i<a.length;i++){
        numOfAllElements += temp[i].length;
    }
    
    char[] newarr = new char[numOfAllElements];
    int r=0;
    for(int i=0;i<a.length;i++){
        for(int k=0;k<temp[i].length;k++){
           newarr[r] = temp[i][k];
           r++; 
        }
    }
    

    Arrays.sort(newarr);
    
    
    
    int numOfDiffNumbers = 0;
    for(int i=1;i<newarr.length;i++){
        if(newarr[i] != newarr[i-1]) numOfDiffNumbers++;
    }
    
    numOfDiffNumbers++;
    
    char [] diffChar = new char [numOfDiffNumbers];
    int [] howMany = new int [numOfDiffNumbers];
    
    diffChar [0] = newarr[0];
    howMany[0] = 1;
    int l = 0;
    
    for(int i=1;i< newarr.length ;i++){
        if(newarr[i] == newarr[i-1]){
            howMany[l]++;
        }
        else{
            System.out.println(l + "  " + i);
            l++;
            diffChar [l] = newarr[i];
            howMany[l] = 1;
        }
    }
    
    

    int max = howMany[0];
    for(int i=0;i<numOfDiffNumbers;i++){
        if(howMany[i] > max) max = howMany[i];
    }
    
    
    int numSol = 0;
    for(int i=0;i<numOfDiffNumbers;i++){
        if(howMany[i] == max) numSol++;
    }
    
    sol =  new int [numSol];
    int num = 0;
    for(int i=0;i<numOfDiffNumbers;i++){
        if(howMany[i] == max) {
            sol[num] = Integer.parseInt(new String(diffChar[i] + "")); 
            num++;
        }
    }
    
    
    
    return sol;
}
    
    public static void main(String [] args){
        int [] a = {25, 2, 3, 57, 38, 41};
        int [] sol = solution(a);
        
        for(int t: sol){
            System.out.println(t);
        }
        
        
        
    }
    
}
