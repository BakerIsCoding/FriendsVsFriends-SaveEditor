/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.baker.firstInterface;

import com.baker.Requests.RequestGet;
import com.baker.Requests.RequestPost;
import com.baker.simpleExceptions.SimpleException;
import com.baker.utils.SaveEditorUtils;
import com.baker.utils.TypesChangers;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.JSONObject;

/**
 *
 * @author Baker
 */
public class AllPanels extends javax.swing.JPanel {

    /**
     * Creates new form UserInfoPanel
     *
     * @param allUserData
     * @param authToken
     * @throws com.baker.simpleExceptions.SimpleException
     */
    public AllPanels(String authToken) throws SimpleException {
        initComponents();
        newAuthToken = authToken;
        // Set size and location
        setSize(584, 578);
        setLocation(0, 0);

        userStatsPanel();

    }

    private JSONObject allData;
    private JSONObject userData;
    private JSONObject userStat;
    private String newAuthToken;

    private void userStatsPanel() throws SimpleException {
        userInfoWriteOnLabels();
    }

    private void userInfoWriteOnLabels() throws SimpleException {
        try {
            //Getting json data, and adding it to the variables
            RequestGet apiUser = new RequestGet();
            allData = apiUser.requestApiUser(newAuthToken);
            userData = allData.getJSONObject("user");
            userStat = userData.getJSONObject("stats");

            System.out.println(allData);
            //Calling writeOnLabels to write all the data on the labels lol

        } catch (org.json.JSONException e) {
            throw new SimpleException("Something went wrong while searching in the json request, \n" + e.getMessage());

        }
        TypesChangers utils = new TypesChangers();
        try {
            // All data in variables
            // Left Screen
            String userNickname = userData.getString("nickname");
            String money = utils.integerToString(userData.getInt("money"));
            String gems = utils.integerToString(userData.getInt("gems"));
            String level = utils.integerToString(userData.getInt("level"));
            String exp = utils.integerToString(userData.getInt("exp"));
            String creationDate = userData.getString("createdAt");
            String isCheater = utils.booleanToString(userData.getBoolean("cheater"));
            String isHardCheater = utils.booleanToString(userData.getBoolean("hardCheater"));
            String isUserBanned = (userData.getInt("banned") == 0) ? "No" : "Yes";
            String friendCode = userData.getString("friendCode");;
            String isDeveloper = utils.booleanToString(userData.getBoolean("isDeveloper"));

            // Right screen
            String packsOpened = utils.integerToString(userStat.getInt("lifetimePacksOpened"));
            String victories = utils.integerToString(userStat.getInt("lifetimeVictories"));
            String ties = utils.integerToString(userStat.getInt("lifetimeTies"));
            String winStreak = utils.integerToString(userStat.getInt("winStreak"));
            String packsBought = utils.integerToString(userStat.getInt("lifetimePacksBought"));
            String totalMatches = utils.integerToString(userStat.getInt("totalMatches"));
            String defeats = utils.integerToString(userStat.getInt("lifetimeDefeats"));

            // Writing the data into the placeholders
            // Left Screen
            UsernamePlaceHolder.setText(userNickname);
            MoneyPlaceholder.setText(money);
            GemsPlaceholder.setText(gems);
            LevelPlaceholder.setText(level);
            ExpPlaceHolder.setText(exp);
            AccouintCreationPlaceHolder.setText(creationDate.split("T")[0]);
            CheaterPlaceholder.setText(isCheater);
            UserBannedPlaceholder.setText(isUserBanned);
            FriendCodePlaceHolder.setText(friendCode);
            DeveloperPlaceHolder.setText(isDeveloper);

            //Right Screen
            Packsopenedplaceholder.setText(packsOpened);
            victoriesplaceholder.setText(victories);
            tiesplaceholder.setText(ties);
            winstreakplaceholder.setText(winStreak);
            Packsboughtplaceholder.setText(packsBought);
            totalMatchesPlaceholder.setText(totalMatches);
            defeatsplaceholder.setText(defeats);

            // Match Editor Panel
            TotalRoundsPlaceholder.setText("0");
        } catch (org.json.JSONException e) {
            throw new SimpleException("Error while extracting information about your account, contact the developer. \n" + e.getMessage());
        }

    }

    private void matchEditorSender() {
        // RESULT = 1 LOSE
        // RESULT = 0 WIN
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AllPanels = new com.baker.tabbed.MaterialTabbed();
        home = new javax.swing.JPanel();
        userInfoPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        UsernameText = new javax.swing.JLabel();
        UsernamePlaceHolder = new javax.swing.JLabel();
        AccountText = new javax.swing.JLabel();
        AccouintCreationPlaceHolder = new javax.swing.JLabel();
        UserBannedText = new javax.swing.JLabel();
        UserBannedPlaceholder = new javax.swing.JLabel();
        CheaterText = new javax.swing.JLabel();
        CheaterPlaceholder = new javax.swing.JLabel();
        GemsText = new javax.swing.JLabel();
        GemsPlaceholder = new javax.swing.JLabel();
        MoneyText = new javax.swing.JLabel();
        MoneyPlaceholder = new javax.swing.JLabel();
        LevelText = new javax.swing.JLabel();
        LevelPlaceholder = new javax.swing.JLabel();
        ExpText = new javax.swing.JLabel();
        ExpPlaceHolder = new javax.swing.JLabel();
        FriendCodeText = new javax.swing.JLabel();
        FriendCodePlaceHolder = new javax.swing.JLabel();
        DeveloperText = new javax.swing.JLabel();
        DeveloperPlaceHolder = new javax.swing.JLabel();
        OtherTitle = new javax.swing.JLabel();
        packsopenedtext = new javax.swing.JLabel();
        Packsopenedplaceholder = new javax.swing.JLabel();
        victoriestext = new javax.swing.JLabel();
        victoriesplaceholder = new javax.swing.JLabel();
        tiestext = new javax.swing.JLabel();
        tiesplaceholder = new javax.swing.JLabel();
        defeatsplaceholder = new javax.swing.JLabel();
        defeatstext = new javax.swing.JLabel();
        winstraktext = new javax.swing.JLabel();
        winstreakplaceholder = new javax.swing.JLabel();
        totalmatchestext = new javax.swing.JLabel();
        totalMatchesPlaceholder = new javax.swing.JLabel();
        packsboughttext = new javax.swing.JLabel();
        Packsboughtplaceholder = new javax.swing.JLabel();
        OtherTitle1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        matchEditor = new javax.swing.JPanel();
        MainTitle = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        CharacterText = new javax.swing.JLabel();
        characterComboBox = new javax.swing.JComboBox<>();
        KillsText = new javax.swing.JLabel();
        KillsCombo = new javax.swing.JComboBox<>();
        DeathsText = new javax.swing.JLabel();
        DeathsCombo = new javax.swing.JComboBox<>();
        RoundsWonText = new javax.swing.JLabel();
        RoundsWonCombo = new javax.swing.JComboBox<>();
        RoundsLostText = new javax.swing.JLabel();
        RoundsLostCombo = new javax.swing.JComboBox<>();
        TotalRoundsText = new javax.swing.JLabel();
        TotalRoundsPlaceholder = new javax.swing.JLabel();
        HitsText = new javax.swing.JLabel();
        HitsTextField = new javax.swing.JTextField();
        MissesText = new javax.swing.JLabel();
        MissesTextField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();

        AllPanels.setBackground(new java.awt.Color(62, 62, 62));
        AllPanels.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 499, Short.MAX_VALUE)
        );

        AllPanels.addTab("Home", home);

        jSeparator1.setForeground(new java.awt.Color(200, 155, 216));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        UsernameText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        UsernameText.setText("Username: ");

        UsernamePlaceHolder.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UsernamePlaceHolder.setForeground(new java.awt.Color(204, 147, 224));
        UsernamePlaceHolder.setText("placeholder");

        AccountText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AccountText.setText("Creation date:");

        AccouintCreationPlaceHolder.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AccouintCreationPlaceHolder.setForeground(new java.awt.Color(200, 155, 216));
        AccouintCreationPlaceHolder.setText("placeholder");

        UserBannedText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        UserBannedText.setText("User Banned: ");

        UserBannedPlaceholder.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UserBannedPlaceholder.setForeground(new java.awt.Color(200, 155, 216));
        UserBannedPlaceholder.setText("placeholder");

        CheaterText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CheaterText.setText("Cheater: ");

        CheaterPlaceholder.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CheaterPlaceholder.setForeground(new java.awt.Color(200, 155, 216));
        CheaterPlaceholder.setText("placeholder");

        GemsText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        GemsText.setText("Gems:");

        GemsPlaceholder.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        GemsPlaceholder.setForeground(new java.awt.Color(200, 155, 216));
        GemsPlaceholder.setText("placeholder");

        MoneyText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        MoneyText.setText("Money:");

        MoneyPlaceholder.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MoneyPlaceholder.setForeground(new java.awt.Color(200, 155, 216));
        MoneyPlaceholder.setText("placeholder");

        LevelText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LevelText.setText("Level:");

        LevelPlaceholder.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LevelPlaceholder.setForeground(new java.awt.Color(200, 155, 216));
        LevelPlaceholder.setText("placeholder");

        ExpText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ExpText.setText("Exp:");

        ExpPlaceHolder.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ExpPlaceHolder.setForeground(new java.awt.Color(200, 155, 216));
        ExpPlaceHolder.setText("placeholder");

        FriendCodeText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        FriendCodeText.setText("Friend Code:");

        FriendCodePlaceHolder.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        FriendCodePlaceHolder.setForeground(new java.awt.Color(200, 155, 216));
        FriendCodePlaceHolder.setText("placeholder");

        DeveloperText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DeveloperText.setText("Developer:");

        DeveloperPlaceHolder.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DeveloperPlaceHolder.setForeground(new java.awt.Color(200, 155, 216));
        DeveloperPlaceHolder.setText("placeholder");

        OtherTitle.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        OtherTitle.setText("Other");

        packsopenedtext.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        packsopenedtext.setText("Packs opened:");

        Packsopenedplaceholder.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Packsopenedplaceholder.setForeground(new java.awt.Color(200, 155, 216));
        Packsopenedplaceholder.setText("placeholder");

        victoriestext.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        victoriestext.setText("Victories:");

        victoriesplaceholder.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        victoriesplaceholder.setForeground(new java.awt.Color(200, 155, 216));
        victoriesplaceholder.setText("placeholder");

        tiestext.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tiestext.setText("Ties:");

        tiesplaceholder.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tiesplaceholder.setForeground(new java.awt.Color(200, 155, 216));
        tiesplaceholder.setText("placeholder");

        defeatsplaceholder.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        defeatsplaceholder.setForeground(new java.awt.Color(200, 155, 216));
        defeatsplaceholder.setText("placeholder");

        defeatstext.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        defeatstext.setText("Defeats:");

        winstraktext.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        winstraktext.setText("Winstreak:");

        winstreakplaceholder.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        winstreakplaceholder.setForeground(new java.awt.Color(200, 155, 216));
        winstreakplaceholder.setText("placeholder");

        totalmatchestext.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        totalmatchestext.setText("Total Matches:");

        totalMatchesPlaceholder.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        totalMatchesPlaceholder.setForeground(new java.awt.Color(200, 155, 216));
        totalMatchesPlaceholder.setText("placeholder");

        packsboughttext.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        packsboughttext.setText("Packs Bought:");

        Packsboughtplaceholder.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Packsboughtplaceholder.setForeground(new java.awt.Color(200, 155, 216));
        Packsboughtplaceholder.setText("placeholder");

        OtherTitle1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        OtherTitle1.setText("User Info");

        jButton1.setText("Reload Stats");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout userInfoPanelLayout = new javax.swing.GroupLayout(userInfoPanel);
        userInfoPanel.setLayout(userInfoPanelLayout);
        userInfoPanelLayout.setHorizontalGroup(
            userInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userInfoPanelLayout.createSequentialGroup()
                .addGroup(userInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userInfoPanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(userInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(userInfoPanelLayout.createSequentialGroup()
                                .addComponent(DeveloperText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DeveloperPlaceHolder))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userInfoPanelLayout.createSequentialGroup()
                                .addComponent(UserBannedText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(UserBannedPlaceholder))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userInfoPanelLayout.createSequentialGroup()
                                .addComponent(CheaterText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CheaterPlaceholder))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userInfoPanelLayout.createSequentialGroup()
                                .addComponent(AccountText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addComponent(AccouintCreationPlaceHolder))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userInfoPanelLayout.createSequentialGroup()
                                .addGroup(userInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ExpText)
                                    .addComponent(LevelText)
                                    .addComponent(UsernameText)
                                    .addComponent(MoneyText)
                                    .addComponent(GemsText)
                                    .addComponent(FriendCodeText))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(userInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(UsernamePlaceHolder)
                                    .addComponent(MoneyPlaceholder)
                                    .addComponent(GemsPlaceholder)
                                    .addComponent(LevelPlaceholder)
                                    .addComponent(ExpPlaceHolder)
                                    .addComponent(FriendCodePlaceHolder))))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userInfoPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(OtherTitle1)
                        .addGap(99, 99, 99)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(userInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userInfoPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(userInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(victoriestext)
                            .addComponent(tiestext)
                            .addComponent(packsopenedtext)
                            .addComponent(defeatstext)
                            .addComponent(totalmatchestext)
                            .addComponent(packsboughttext)
                            .addComponent(winstraktext))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addGroup(userInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Packsopenedplaceholder, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Packsboughtplaceholder, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(victoriesplaceholder, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tiesplaceholder, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(defeatsplaceholder, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(winstreakplaceholder, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(totalMatchesPlaceholder, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(28, 28, 28))
                    .addGroup(userInfoPanelLayout.createSequentialGroup()
                        .addGroup(userInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(userInfoPanelLayout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(OtherTitle))
                            .addGroup(userInfoPanelLayout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(jButton1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        userInfoPanelLayout.setVerticalGroup(
            userInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userInfoPanelLayout.createSequentialGroup()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(userInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userInfoPanelLayout.createSequentialGroup()
                        .addComponent(OtherTitle1)
                        .addGap(27, 27, 27)
                        .addGroup(userInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UsernameText)
                            .addComponent(UsernamePlaceHolder))
                        .addGap(18, 18, 18)
                        .addGroup(userInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FriendCodePlaceHolder)
                            .addComponent(FriendCodeText))
                        .addGap(18, 18, 18)
                        .addGroup(userInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MoneyText)
                            .addComponent(MoneyPlaceholder))
                        .addGap(18, 18, 18)
                        .addGroup(userInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GemsText)
                            .addComponent(GemsPlaceholder))
                        .addGap(18, 18, 18)
                        .addGroup(userInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LevelText)
                            .addComponent(LevelPlaceholder))
                        .addGap(18, 18, 18)
                        .addGroup(userInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ExpText)
                            .addComponent(ExpPlaceHolder))
                        .addGap(18, 18, 18)
                        .addGroup(userInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AccountText)
                            .addComponent(AccouintCreationPlaceHolder))
                        .addGap(18, 18, 18)
                        .addGroup(userInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CheaterText)
                            .addComponent(CheaterPlaceholder))
                        .addGap(18, 18, 18)
                        .addGroup(userInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UserBannedText)
                            .addComponent(UserBannedPlaceholder))
                        .addGap(18, 18, 18)
                        .addGroup(userInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DeveloperText)
                            .addComponent(DeveloperPlaceHolder)))
                    .addGroup(userInfoPanelLayout.createSequentialGroup()
                        .addComponent(OtherTitle)
                        .addGap(27, 27, 27)
                        .addGroup(userInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(packsboughttext)
                            .addComponent(Packsboughtplaceholder))
                        .addGap(18, 18, 18)
                        .addGroup(userInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(packsopenedtext)
                            .addComponent(Packsopenedplaceholder))
                        .addGap(18, 18, 18)
                        .addGroup(userInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(victoriestext)
                            .addComponent(victoriesplaceholder))
                        .addGap(18, 18, 18)
                        .addGroup(userInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tiestext)
                            .addComponent(tiesplaceholder))
                        .addGap(18, 18, 18)
                        .addGroup(userInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(defeatstext)
                            .addComponent(defeatsplaceholder))
                        .addGap(18, 18, 18)
                        .addGroup(userInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(winstraktext)
                            .addComponent(winstreakplaceholder))
                        .addGap(18, 18, 18)
                        .addGroup(userInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalmatchestext)
                            .addComponent(totalMatchesPlaceholder))
                        .addGap(32, 32, 32)
                        .addComponent(jButton1)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        AllPanels.addTab("User Stats", userInfoPanel);

        MainTitle.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        MainTitle.setText("Main");

        Title.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Title.setText("Accuracy");

        jButton2.setText("Send");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        CharacterText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CharacterText.setText("Character:");

        characterComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Moose Salto", "Donnie B.", "Sable Santana", "Duck Anderson", "Stevie Gull", "Little lars", "DJ Newton", "Spike Remington", "MYK Reaver", "Haru" }));
        characterComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                characterComboBoxActionPerformed(evt);
            }
        });

        KillsText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        KillsText.setText("Kills:");

        KillsCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        KillsCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KillsComboActionPerformed(evt);
            }
        });

        DeathsText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DeathsText.setText("Deaths:");

        DeathsCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));
        DeathsCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeathsComboActionPerformed(evt);
            }
        });

        RoundsWonText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        RoundsWonText.setText("Rounds Won:");

        RoundsWonCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3" }));
        RoundsWonCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RoundsWonComboItemStateChanged(evt);
            }
        });
        RoundsWonCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoundsWonComboActionPerformed(evt);
            }
        });

        RoundsLostText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        RoundsLostText.setText("Rounds Lost:");

        RoundsLostCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3" }));
        RoundsLostCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RoundsLostComboItemStateChanged(evt);
            }
        });
        RoundsLostCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoundsLostComboActionPerformed(evt);
            }
        });

        TotalRoundsText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TotalRoundsText.setText("Total Rounds:");

        TotalRoundsPlaceholder.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TotalRoundsPlaceholder.setText("placeholder");

        HitsText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        HitsText.setText("Hits:");

        HitsTextField.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                HitsTextFieldInputMethodTextChanged(evt);
            }
        });
        HitsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HitsTextFieldActionPerformed(evt);
            }
        });

        MissesText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        MissesText.setText("Misses:");

        MissesTextField.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                MissesTextFieldInputMethodTextChanged(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(200, 155, 216));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout matchEditorLayout = new javax.swing.GroupLayout(matchEditor);
        matchEditor.setLayout(matchEditorLayout);
        matchEditorLayout.setHorizontalGroup(
            matchEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(matchEditorLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(matchEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(matchEditorLayout.createSequentialGroup()
                        .addGroup(matchEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, matchEditorLayout.createSequentialGroup()
                                .addGroup(matchEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CharacterText)
                                    .addComponent(KillsText))
                                .addGap(52, 52, 52))
                            .addGroup(matchEditorLayout.createSequentialGroup()
                                .addComponent(DeathsText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(matchEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DeathsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KillsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(characterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(matchEditorLayout.createSequentialGroup()
                        .addGroup(matchEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, matchEditorLayout.createSequentialGroup()
                                .addGroup(matchEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RoundsWonText)
                                    .addComponent(RoundsLostText))
                                .addGap(22, 22, 22))
                            .addGroup(matchEditorLayout.createSequentialGroup()
                                .addComponent(TotalRoundsText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(matchEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TotalRoundsPlaceholder, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(matchEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(RoundsLostCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(RoundsWonCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(matchEditorLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(MainTitle)))
                .addGap(12, 12, 12)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(matchEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(matchEditorLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(matchEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HitsText)
                            .addComponent(MissesText))
                        .addGap(59, 59, 59)
                        .addGroup(matchEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MissesTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HitsTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42))
                    .addGroup(matchEditorLayout.createSequentialGroup()
                        .addGroup(matchEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(matchEditorLayout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(Title))
                            .addGroup(matchEditorLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        matchEditorLayout.setVerticalGroup(
            matchEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(matchEditorLayout.createSequentialGroup()
                .addGroup(matchEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(matchEditorLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(MainTitle))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, matchEditorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Title)))
                .addGap(18, 18, 18)
                .addGroup(matchEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(matchEditorLayout.createSequentialGroup()
                        .addGroup(matchEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CharacterText)
                            .addComponent(characterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(matchEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(KillsText)
                            .addComponent(KillsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(matchEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DeathsText)
                            .addComponent(DeathsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(matchEditorLayout.createSequentialGroup()
                        .addGroup(matchEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HitsText)
                            .addComponent(HitsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(matchEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MissesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MissesText))))
                .addGroup(matchEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(matchEditorLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(matchEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RoundsWonText)
                            .addComponent(RoundsWonCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(matchEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RoundsLostText)
                            .addComponent(RoundsLostCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(matchEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TotalRoundsText)
                            .addComponent(TotalRoundsPlaceholder)))
                    .addGroup(matchEditorLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(195, Short.MAX_VALUE))
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        AllPanels.addTab("Match Editor", matchEditor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AllPanels, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AllPanels, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        AllPanels.getAccessibleContext().setAccessibleName("userInfo");
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            userInfoWriteOnLabels();
        } catch (SimpleException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            RequestPost requestPost = new RequestPost();
            TypesChangers utils = new TypesChangers();
            SaveEditorUtils saveEditorUtil = new SaveEditorUtils();
            String[] bodyThings = new String[7];
            
            

            bodyThings[0] = saveEditorUtil.characterType(characterComboBox.getSelectedItem().toString()); //Character
            bodyThings[1] = KillsCombo.getSelectedItem().toString(); //Kills
            bodyThings[2] = DeathsCombo.getSelectedItem().toString(); //Deaths
            bodyThings[3] = RoundsWonCombo.getSelectedItem().toString(); //Rounds Won
            bodyThings[4] = RoundsWonCombo.getSelectedItem().toString() + RoundsLostCombo.getSelectedItem().toString(); //Total Rounds
            bodyThings[5] = HitsTextField.getText();
            bodyThings[6] = MissesTextField.getText();
            
            /*
            Integer hits = utils.StringToInteger(HitsTextField.getText());
            Integer misses = utils.StringToInteger(MissesTextField.getText());
            String accuracy = utils.integerToString(hits / misses);
            
            
            bodyThings[7] = accuracy;
            */

            requestPost.postGameSaveData(newAuthToken, bodyThings);

        } catch (SimpleException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void totalRoundPlaceholderChange() {
        try {
            TypesChangers utils = new TypesChangers();
            Integer total = utils.StringToInteger(RoundsWonCombo.getSelectedItem().toString()) + utils.StringToInteger(RoundsLostCombo.getSelectedItem().toString());
            TotalRoundsPlaceholder.setText(utils.integerToString(total));
        } catch (SimpleException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }



    private void characterComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_characterComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_characterComboBoxActionPerformed

    private void RoundsWonComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoundsWonComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoundsWonComboActionPerformed

    private void KillsComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KillsComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KillsComboActionPerformed

    private void DeathsComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeathsComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeathsComboActionPerformed

    private void RoundsLostComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoundsLostComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoundsLostComboActionPerformed

    private void RoundsWonComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RoundsWonComboItemStateChanged
        totalRoundPlaceholderChange();

    }//GEN-LAST:event_RoundsWonComboItemStateChanged

    private void RoundsLostComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RoundsLostComboItemStateChanged
        totalRoundPlaceholderChange();
    }//GEN-LAST:event_RoundsLostComboItemStateChanged

    private void HitsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitsTextFieldActionPerformed
        
    }//GEN-LAST:event_HitsTextFieldActionPerformed

    private void HitsTextFieldInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_HitsTextFieldInputMethodTextChanged

    }//GEN-LAST:event_HitsTextFieldInputMethodTextChanged

    private void MissesTextFieldInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_MissesTextFieldInputMethodTextChanged

    }//GEN-LAST:event_MissesTextFieldInputMethodTextChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccouintCreationPlaceHolder;
    private javax.swing.JLabel AccountText;
    private com.baker.tabbed.MaterialTabbed AllPanels;
    private javax.swing.JLabel CharacterText;
    private javax.swing.JLabel CheaterPlaceholder;
    private javax.swing.JLabel CheaterText;
    private javax.swing.JComboBox<String> DeathsCombo;
    private javax.swing.JLabel DeathsText;
    private javax.swing.JLabel DeveloperPlaceHolder;
    private javax.swing.JLabel DeveloperText;
    private javax.swing.JLabel ExpPlaceHolder;
    private javax.swing.JLabel ExpText;
    private javax.swing.JLabel FriendCodePlaceHolder;
    private javax.swing.JLabel FriendCodeText;
    private javax.swing.JLabel GemsPlaceholder;
    private javax.swing.JLabel GemsText;
    private javax.swing.JLabel HitsText;
    private javax.swing.JTextField HitsTextField;
    private javax.swing.JComboBox<String> KillsCombo;
    private javax.swing.JLabel KillsText;
    private javax.swing.JLabel LevelPlaceholder;
    private javax.swing.JLabel LevelText;
    private javax.swing.JLabel MainTitle;
    private javax.swing.JLabel MissesText;
    private javax.swing.JTextField MissesTextField;
    private javax.swing.JLabel MoneyPlaceholder;
    private javax.swing.JLabel MoneyText;
    private javax.swing.JLabel OtherTitle;
    private javax.swing.JLabel OtherTitle1;
    private javax.swing.JLabel Packsboughtplaceholder;
    private javax.swing.JLabel Packsopenedplaceholder;
    private javax.swing.JComboBox<String> RoundsLostCombo;
    private javax.swing.JLabel RoundsLostText;
    private javax.swing.JComboBox<String> RoundsWonCombo;
    private javax.swing.JLabel RoundsWonText;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel TotalRoundsPlaceholder;
    private javax.swing.JLabel TotalRoundsText;
    private javax.swing.JLabel UserBannedPlaceholder;
    private javax.swing.JLabel UserBannedText;
    private javax.swing.JLabel UsernamePlaceHolder;
    private javax.swing.JLabel UsernameText;
    private javax.swing.JComboBox<String> characterComboBox;
    private javax.swing.JLabel defeatsplaceholder;
    private javax.swing.JLabel defeatstext;
    private javax.swing.JPanel home;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel matchEditor;
    private javax.swing.JLabel packsboughttext;
    private javax.swing.JLabel packsopenedtext;
    private javax.swing.JLabel tiesplaceholder;
    private javax.swing.JLabel tiestext;
    private javax.swing.JLabel totalMatchesPlaceholder;
    private javax.swing.JLabel totalmatchestext;
    private javax.swing.JPanel userInfoPanel;
    private javax.swing.JLabel victoriesplaceholder;
    private javax.swing.JLabel victoriestext;
    private javax.swing.JLabel winstraktext;
    private javax.swing.JLabel winstreakplaceholder;
    // End of variables declaration//GEN-END:variables
}
