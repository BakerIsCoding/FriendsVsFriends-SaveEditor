/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.baker.utils;

import com.baker.simpleExceptions.SimpleException;

/**
 *
 * @author Baker
 */
public class TypesChangers {

    public String integerToString(int userInteger) throws SimpleException {
        try {
            String finalString = String.valueOf(userInteger);
            return finalString;
        } catch (Exception e) {
            throw new SimpleException("Something went wrong trying to convert " + userInteger + " to String");
        }
    }
    
    public String booleanToString(Boolean userBool) throws SimpleException{
        if (userBool) {
            return "Yes";
        } else if (!userBool){
            return "No";
        } else{
            throw new SimpleException("Something went wrong trying to convert " + userBool + " to String");
        }
    }
}
