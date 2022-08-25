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
public class meanValues {
    
    
    static int[][] solution(int[][] a) { 
    int [][] result; 
     
    double [] mean = new double [a.length]; 
     
    for(int i=0;i<a.length;i++){ 
        double sum = 0; 
        for(int k=0;k<a[i].length;k++){ 
            sum+=a[i][k]; 
        } 
        mean[i] = sum / a[i].length; 

    } 
     
    double temp [] = new double [a.length]; 
    for(int i=0;i<a.length;i++){ 
        temp[i] = mean[i]; 
        System.out.println(temp[i]);
    } 
     
    Arrays.sort(temp); 
    int rows = 1; 
    for(int i=1;i<temp.length;i++){ 
        if(temp[i] != temp[i-1]) rows++; 
    } 
     
    result = new int [rows][]; 
    int rr=0; 
     

     
    int [] mark = new int [temp.length]; 
    
   
    for(int i=0;i<mean.length;i++){ 
 
        double target = mean[i]; 
        if(mark[i] == 1) continue; 
         
        int cols = 1; 
        for(int k=i+1;k<mean.length;k++){ 
            if(target == mean[k]) cols++; 
        } 
        int [] arr = new int [cols]; 
        arr[0] = i; 
        int index = 0; 
        for(int r=i+1;r<mean.length;r++){ 
            if(target == mean[r]) { 
                arr[index+1] = r; 
                mark[r] = 1; 
                index++;
            } 
        } 
         
        result[rr] = arr; 
        rr++;  
    } 
     
 
    return result; 

}
    
    public static void main(String [] args){
      //  int arr [] [] = {{3,3,4,2},{4,4},{4,0,3,5},{3,3}};
//3.0
//4.0
//3.0
//3.0
//0  2  0  
//1 


/*const arr = [ 
        [1,2,3], 
        [3,2,1], 
        [2,3,4], 
        [3,4,2], 
        [4,5,6] 
    ] */
        //int arr [] [] = {{1,2,3},{3,2,1},{2,3,4},{3,4,2},{4,5,6}};
        //int arr [] [] = {{3, 3, 4, 2},{4,4},{4,0,3,3},{2, 3},{3,3,3}};
        int arr [] [] = {{-5, 2, 3},{0,0},{0},{-100,100}};
        
        
        int res [] [] = solution(arr);
        
        for(int i=0;i<res.length;i++){
            for(int k=0;k<res[i].length;k++){
                System.out.print(res[i][k] + "  ");
            }
            System.out.println();
        }
    }
    
}
