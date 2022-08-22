/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.signup.codesignalquestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 *
 * @author hp
 */
public class HashmapQuestion {
    
    static long hashMap(String[] queryType, int[][] query) {
        long sum = 0;
        Integer currKey = 0;
        Integer currValue = 0; 
        
        Map <Integer, Integer> values = new HashMap <>();
        
        for(int i=0;i<queryType.length;i++){
            String currQuery = queryType[i];
            
            switch (currQuery){
                case "insert":
                    HashMap <Integer,Integer> copy = new HashMap<>();
                    
                    if(currKey!=0 || currValue!=0){
                        Set <Integer> keys = values.keySet();
                        for(Integer key: keys){
                            copy.put(key + currKey, values.get(key) + currValue);
                        }
                        values.clear();
                        values.putAll(copy);
                        currValue = 0;
                        currKey = 0;
                    }
                    
                    values.put(query[i][0], query[i][1]);
                    break;
                    
                case "addToValue":
                    currValue += values.isEmpty()? 0 : query[i][0];
                    break;
                    
                case "addToKey":
                    currKey += values.isEmpty()? 0: query[i][0];
                    break;
                    
                case "get":
                    copy = new HashMap<>();
                    if(currValue != 0 || currKey!=0){
                        Set <Integer> keys = values.keySet();
                        
                        for(Integer key: keys){
                            copy.put(key + currKey, values.get(key)+currValue);
                        }
                        
                        values.clear();
                        values.putAll(copy);
                        currValue =0;
                        currKey = 0;
                        
                    }
                    
                    sum += values.get(query[i][0]);
            }
        }
        
        
        
        return sum;
    }
    public static void main(String [] args){
        String [] queryType = {"insert", "addToValue", "get", "insert", "addToKey", "addToValue", "get"};
        int [] [] query = {{1, 2}, {2}, {1}, {2, 3}, {1}, {-1}, {3}};
        
        System.out.println(hashMap(queryType,query));
    }
    
}
