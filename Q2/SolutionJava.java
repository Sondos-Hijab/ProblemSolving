/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.signup.codesignalquestions;

/**
 *
 * @author hp
 */
public class SolutionJava {
   static boolean check(int[] arr) {
    for (int i = 1; i < arr.length-1; i++) {
      if (arr[i] > arr[i - 1] && arr[i]<arr[i+1])  continue; else return false;
    }
    return true;
  }

   static boolean  solution(int[] numbers) { 
    if(check(numbers)) return true; 
    int [] newArr = new int [numbers.length];
    int [] resArr = new int [numbers.length];
    for(int i=0;i<numbers.length;i++){
       newArr[i] = numbers[i];
       resArr[i] = numbers[i];
    }
    
    //for loop for checking every number in the array 
    
    for(int i=0;i<numbers.length;i++){ 
                        int prevNumber = resArr[i];
                        char[] a = String.valueOf(resArr[i]).toCharArray(); 
                        for (int l = 0; l < a.length -1; l++) { 
                                        for(int k=l+1;k<a.length;k++){ 
                                            char tmp = a[l]; 
                                            a[l] = a[k]; 
                                            a[k] = tmp; 
                                            int number = Integer.parseInt(new String(a));                                                      
                                            resArr[i] = number; 
                                            if(check(resArr)) {
                                                for(int t : resArr) System.out.println(t);
                                                System.out.println("Worked");
                                                return true;
                                            } 
                                                                                else {
                                                                                    for(int t : resArr) System.out.println(t);
                                                                                
                                                                                    System.out.println("Didn't work/n");
                                                                                    
                                                                                    resArr[i] = prevNumber;
                                                                                    for(int t : resArr) System.out.println(t);
                                                                                    System.out.println("/n");
                                                                                    continue;
                                                                                } 
                                        } 
                        } 
            } 
       return false;
        }
            public static void main( String [] args){
                int [] arr = {68,105,131,396,438,754,744,817};
                System.out.println(solution(arr));
            }
}
