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
public class SaveEditorUtils {

    public String characterType(String userCharacter) throws SimpleException {
        if (userCharacter.equals("Moose Salto")) {
            return "MOOSE";
        } else if (userCharacter.equals("Donnie B.")) {
            return "DOBERMAN";
        } else if (userCharacter.equals("Sable Santana")) {
            return "TIGER";
        } else if (userCharacter.equals("Duck Anderson")) {
            return "DUCK";
        } else if (userCharacter.equals("Stevie Gull")) {
            return "SEAGULL";
        } else if (userCharacter.equals("Little lars")) {
            return "POLARBEAR";
        } else if (userCharacter.equals("DJ Newton")) {
            return "CROCODILE";
        } else if (userCharacter.equals("Spike Remington")) {
            return "CAT";
        } else if (userCharacter.equals("MYK Reaver")) {
            return "WOODPECKER";
        } else if (userCharacter.equals("Haru")) {
            return "HARE";
        } else{
            throw new SimpleException("Something went wrong trying to find " + userCharacter + ". \nIs this character existing?");
        }
    }
    
    public boolean isUserInputGood(String[] bodyThings){
        
        return false;
    }
}
