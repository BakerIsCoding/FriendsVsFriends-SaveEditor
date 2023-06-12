/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.baker.friendsvsfriendsinfogetter;

import com.baker.firstInterface.FirstScreen;
import com.baker.firstInterface.UserInfoPanel;

/**
 *
 * @author Baker
 */
public class FriendsVsFriendsInfoGetter {

    public static void main(String[] args) {
        try {
            FirstScreen initialScreen = new FirstScreen();
            initialScreen.sendApiInfo();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
    }
}
