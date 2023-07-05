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
        System.out.println("Started!");

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
            
            //System.out.println(allData);
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
            String friendCode = userData.getString("friendCode");
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
        } catch (org.json.JSONException e) {
            throw new SimpleException("Error while extracting information about your account, contact the developer. \n" + e.getMessage());
        }

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
        reloadStatsButton = new javax.swing.JButton();
        matchEditor = new javax.swing.JPanel();
        MainTitle = new javax.swing.JLabel();
        CharacterText = new javax.swing.JLabel();
        characterComboBox = new javax.swing.JComboBox<>();
        KillsText = new javax.swing.JLabel();
        KillsCombo = new javax.swing.JComboBox<>();
        win1 = new javax.swing.JButton();
        win5 = new javax.swing.JButton();
        lose1 = new javax.swing.JButton();
        lose5 = new javax.swing.JButton();
        level1 = new javax.swing.JButton();
        level3 = new javax.swing.JButton();
        level5 = new javax.swing.JButton();
        level10 = new javax.swing.JButton();
        add1000money = new javax.swing.JButton();
        add5000money = new javax.swing.JButton();
        add10000money = new javax.swing.JButton();
        add20000money = new javax.swing.JButton();

        AllPanels.setBackground(new java.awt.Color(62, 62, 62));
        AllPanels.setForeground(new java.awt.Color(255, 255, 255));

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

        reloadStatsButton.setText("Reload Stats");
        reloadStatsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reloadStatsButtonActionPerformed(evt);
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
                        .addGroup(userInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(userInfoPanelLayout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(OtherTitle))
                            .addGroup(userInfoPanelLayout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(reloadStatsButton)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addGap(57, 57, 57)
                        .addGroup(userInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Packsopenedplaceholder, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Packsboughtplaceholder, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(victoriesplaceholder, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tiesplaceholder, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(defeatsplaceholder, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(winstreakplaceholder, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(totalMatchesPlaceholder, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(17, 17, 17))))
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
                        .addComponent(reloadStatsButton)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        AllPanels.addTab("User Stats", userInfoPanel);

        MainTitle.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        MainTitle.setText("Save Editor");

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

        win1.setText("Add 1 win");
        win1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                win1ActionPerformed(evt);
            }
        });

        win5.setText("Add 5 wins");
        win5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                win5ActionPerformed(evt);
            }
        });

        lose1.setText("Add 1 lose");
        lose1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lose1ActionPerformed(evt);
            }
        });

        lose5.setText("Add 5 loses");
        lose5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lose5ActionPerformed(evt);
            }
        });

        level1.setText("Add 1 level");
        level1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level1ActionPerformed(evt);
            }
        });

        level3.setText("Add 3 levels");
        level3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level3ActionPerformed(evt);
            }
        });

        level5.setText("Add 5 levels");
        level5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level5ActionPerformed(evt);
            }
        });

        level10.setText("Add 10 levels");
        level10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level10ActionPerformed(evt);
            }
        });

        add1000money.setText("Add 1000$");
        add1000money.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add1000moneyActionPerformed(evt);
            }
        });

        add5000money.setText("Add 5000$");
        add5000money.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add5000moneyActionPerformed(evt);
            }
        });

        add10000money.setText("Add 10000$");
        add10000money.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add10000moneyActionPerformed(evt);
            }
        });

        add20000money.setText("Add 20000$");
        add20000money.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add20000moneyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout matchEditorLayout = new javax.swing.GroupLayout(matchEditor);
        matchEditor.setLayout(matchEditorLayout);
        matchEditorLayout.setHorizontalGroup(
            matchEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(matchEditorLayout.createSequentialGroup()
                .addGroup(matchEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(matchEditorLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(CharacterText)
                        .addGap(52, 52, 52)
                        .addComponent(characterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(KillsText)
                        .addGap(52, 52, 52)
                        .addComponent(KillsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(matchEditorLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(matchEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(matchEditorLayout.createSequentialGroup()
                                .addComponent(lose5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(level10, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(matchEditorLayout.createSequentialGroup()
                                .addGroup(matchEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lose1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(win5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(win1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addGroup(matchEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(level1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(level3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(level5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(46, 46, 46)
                        .addGroup(matchEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(add20000money, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add1000money, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add5000money, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add10000money, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(53, 53, 53))
            .addGroup(matchEditorLayout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(MainTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        matchEditorLayout.setVerticalGroup(
            matchEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(matchEditorLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(MainTitle)
                .addGap(18, 18, 18)
                .addGroup(matchEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CharacterText)
                    .addComponent(characterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KillsText)
                    .addComponent(KillsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(matchEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(win1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(level1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add1000money, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(matchEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(win5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(level3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add5000money, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(matchEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lose1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(level5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add10000money, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(matchEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lose5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add20000money, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(level10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        AllPanels.addTab("Save Editor", matchEditor);

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

    private void reloadStatsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reloadStatsButtonActionPerformed
        try {
            //Reload Stats Function
            userInfoWriteOnLabels();
            JOptionPane.showMessageDialog(null, "Stats Reloaded!");
        } catch (SimpleException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_reloadStatsButtonActionPerformed

    private void sendApiFinal(String[] bodyThings) {
        RequestPost requestPost = new RequestPost();
        requestPost.postGameSaveData(newAuthToken, bodyThings);

    }

    private void addLevels(Integer levelQuantity) throws SimpleException {
        boolean isLevelWished = false;
        try {
            //Loading the user data again
            userInfoWriteOnLabels();
        } catch (SimpleException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }

        // Saving the level and the level to be reached
        userData = allData.getJSONObject("user");
        userStat = userData.getJSONObject("stats");
        Integer currentlevelUser = userData.getInt("level");
        Integer wishedLevelUser = currentlevelUser + levelQuantity;

        if (currentlevelUser >= 100) {
            throw new SimpleException("I can't add more levels \nYou reached de max level (100)");
        }

        while (!isLevelWished) {
            try {
                SaveEditorUtils saveEditorUtil = new SaveEditorUtils();
                String[] bodyThings = new String[3];
                //Saving character, kills, and win or lose
                bodyThings[0] = saveEditorUtil.characterType(characterComboBox.getSelectedItem().toString()); //Character
                bodyThings[1] = KillsCombo.getSelectedItem().toString(); //Kills
                bodyThings[2] = "2"; //tie

                //Sending to api
                sendApiFinal(bodyThings);

                // if the user current level is more or equals to the wished level stop the loop
                if (currentlevelUser >= wishedLevelUser) {
                    isLevelWished = true;
                }

                //Reloading the stats again
                userInfoWriteOnLabels();
                currentlevelUser = userData.getInt("level");

            } catch (SimpleException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(null, "Added " + String.valueOf(levelQuantity) + " levels to your account");

    }

    private void addMoney(Integer moneyQuantity) throws SimpleException {
        boolean isMoneyWished = false;
        try {
            userInfoWriteOnLabels();
        } catch (SimpleException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }

        //Getting the user Money
        userData = allData.getJSONObject("user");
        userStat = userData.getJSONObject("stats");
        Integer currentMoneyUser = userData.getInt("money");
        Integer wishedMoneyUser = currentMoneyUser + moneyQuantity;

        // If the current money user equals max, exception
        if (currentMoneyUser == 20000) {
            throw new SimpleException("I can't add more money \nYou have the max money in your account (20000$) \nWaste it in-game and try it again ");
        }
        // If the wished money is more than the max, ask for what the program should do
        if (wishedMoneyUser > 20000) {
            int option = JOptionPane.showConfirmDialog(null, "The money you want in your account will exceed the limit,\n I will put $20000, it's ok?", "Warning", JOptionPane.OK_CANCEL_OPTION);

            //option = ok max moeny 20 000 else cancel
            if (option == JOptionPane.OK_OPTION) {
                wishedMoneyUser = 20000;
            } else if (option == JOptionPane.CANCEL_OPTION || option == JOptionPane.CLOSED_OPTION) {
                throw new SimpleException("Canceled");

            }

        }
        //looping until moneyWished = true
        while (!isMoneyWished) {
            try {

                //Always losing when adding the money, trying to avoid ban lol, no one has been banned before btw
                SaveEditorUtils saveEditorUtil = new SaveEditorUtils();
                String[] bodyThings = new String[3];
                bodyThings[0] = saveEditorUtil.characterType(characterComboBox.getSelectedItem().toString()); //Character
                bodyThings[1] = KillsCombo.getSelectedItem().toString(); //Kills
                bodyThings[2] = "2"; //tie

                //Sending to api
                sendApiFinal(bodyThings);

                if (currentMoneyUser >= wishedMoneyUser) {
                    isMoneyWished = true;
                }

                //Reloading stats
                userInfoWriteOnLabels();
                currentMoneyUser = userData.getInt("money");

            } catch (SimpleException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(null, "Added " + String.valueOf(moneyQuantity) + "$ to your account");

    }

    private void win1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_win1ActionPerformed

        try {
            SaveEditorUtils saveEditorUtil = new SaveEditorUtils();
            String[] bodyThings = new String[3];
            bodyThings[0] = saveEditorUtil.characterType(characterComboBox.getSelectedItem().toString()); //Character
            bodyThings[1] = KillsCombo.getSelectedItem().toString(); //Kills
            bodyThings[2] = "0"; //win

            // 0 win
            // 1 lose
            sendApiFinal(bodyThings);

        } catch (SimpleException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }
        JOptionPane.showMessageDialog(null, "Added 1 win to " + characterComboBox.getSelectedItem().toString());
    }//GEN-LAST:event_win1ActionPerformed


    private void characterComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_characterComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_characterComboBoxActionPerformed

    private void KillsComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KillsComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KillsComboActionPerformed

    private void add20000moneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add20000moneyActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Press Ok, and wait 3 - 5 minutes", "Warning", JOptionPane.OK_CANCEL_OPTION);
        try {
            if (option == JOptionPane.OK_OPTION) {
                addMoney(20000);
            } else if (option == JOptionPane.CANCEL_OPTION || option == JOptionPane.CLOSED_OPTION) {
                JOptionPane.showMessageDialog(null, "Canceled");
            }
        } catch (SimpleException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_add20000moneyActionPerformed

    private void lose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lose1ActionPerformed
        try {
            SaveEditorUtils saveEditorUtil = new SaveEditorUtils();
            String[] bodyThings = new String[3];
            bodyThings[0] = saveEditorUtil.characterType(characterComboBox.getSelectedItem().toString()); //Character
            bodyThings[1] = KillsCombo.getSelectedItem().toString(); //Kills
            bodyThings[2] = "1"; //lose

            // 0 win
            // 1 lose
            sendApiFinal(bodyThings);

        } catch (SimpleException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }
        JOptionPane.showMessageDialog(null, "Added 1 lose to " + characterComboBox.getSelectedItem().toString());
    }//GEN-LAST:event_lose1ActionPerformed

    private void win5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_win5ActionPerformed
        for (int i = 0; i < 5; i++) {
            try {
                SaveEditorUtils saveEditorUtil = new SaveEditorUtils();
                String[] bodyThings = new String[3];
                bodyThings[0] = saveEditorUtil.characterType(characterComboBox.getSelectedItem().toString()); //Character
                bodyThings[1] = KillsCombo.getSelectedItem().toString(); //Kills
                bodyThings[2] = "0"; //win

                // 0 win
                // 1 lose
                sendApiFinal(bodyThings);

            } catch (SimpleException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(null, "Added 5 wins to " + characterComboBox.getSelectedItem().toString());

    }//GEN-LAST:event_win5ActionPerformed

    private void lose5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lose5ActionPerformed
        for (int i = 0; i < 5; i++) {
            try {
                SaveEditorUtils saveEditorUtil = new SaveEditorUtils();
                String[] bodyThings = new String[3];
                bodyThings[0] = saveEditorUtil.characterType(characterComboBox.getSelectedItem().toString()); //Character
                bodyThings[1] = KillsCombo.getSelectedItem().toString(); //Kills
                bodyThings[2] = "1"; //lose

                // 0 win
                // 1 lose
                sendApiFinal(bodyThings);

            } catch (SimpleException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(null, "Added 5 loses to " + characterComboBox.getSelectedItem().toString());

    }//GEN-LAST:event_lose5ActionPerformed


    private void level1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level1ActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Press Ok, and wait 10 - 40 seconds", "Warning", JOptionPane.OK_CANCEL_OPTION);
        try {
            if (option == JOptionPane.OK_OPTION) {
                addLevels(1);
            } else if (option == JOptionPane.CANCEL_OPTION || option == JOptionPane.CLOSED_OPTION) {
                JOptionPane.showMessageDialog(null, "Canceled");
            }
        } catch (SimpleException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_level1ActionPerformed

    private void level3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level3ActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Press Ok, and wait 30 - 60 seconds", "Warning", JOptionPane.OK_CANCEL_OPTION);

        try {
            if (option == JOptionPane.OK_OPTION) {
                addLevels(3);
            } else if (option == JOptionPane.CANCEL_OPTION || option == JOptionPane.CLOSED_OPTION) {
                JOptionPane.showMessageDialog(null, "Canceled");
            }
        } catch (SimpleException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_level3ActionPerformed

    private void level5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level5ActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Press Ok, and wait 1 - 2 minutes", "Warning", JOptionPane.OK_CANCEL_OPTION);

        try {
            if (option == JOptionPane.OK_OPTION) {
                addLevels(5);
            } else if (option == JOptionPane.CANCEL_OPTION || option == JOptionPane.CLOSED_OPTION) {
                JOptionPane.showMessageDialog(null, "Canceled");
            }
        } catch (SimpleException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_level5ActionPerformed

    private void level10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level10ActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Press Ok, and wait 3 - 5 minutes", "Warning", JOptionPane.OK_CANCEL_OPTION);

        try {
            if (option == JOptionPane.OK_OPTION) {
                addLevels(10);
            } else if (option == JOptionPane.CANCEL_OPTION || option == JOptionPane.CLOSED_OPTION) {
                JOptionPane.showMessageDialog(null, "Canceled");
            }
        } catch (SimpleException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_level10ActionPerformed

    private void add1000moneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add1000moneyActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Press Ok, and wait 10 - 40 seconds", "Warning", JOptionPane.OK_CANCEL_OPTION);

        try {
            if (option == JOptionPane.OK_OPTION) {
                addMoney(1000);
            } else if (option == JOptionPane.CANCEL_OPTION || option == JOptionPane.CLOSED_OPTION) {
                JOptionPane.showMessageDialog(null, "Canceled");
            }

        } catch (SimpleException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_add1000moneyActionPerformed

    private void add5000moneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add5000moneyActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Press Ok, and wait 30 - 60 seconds", "Warning", JOptionPane.OK_CANCEL_OPTION);
        try {
            if (option == JOptionPane.OK_OPTION) {
                addMoney(5000);
            } else if (option == JOptionPane.CANCEL_OPTION || option == JOptionPane.CLOSED_OPTION) {
                JOptionPane.showMessageDialog(null, "Canceled");
            }

        } catch (SimpleException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_add5000moneyActionPerformed

    private void add10000moneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add10000moneyActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Press Ok, and wait 1 - 2 minutes", "Warning", JOptionPane.OK_CANCEL_OPTION);
        try {
            addMoney(10000);
        } catch (SimpleException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_add10000moneyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccouintCreationPlaceHolder;
    private javax.swing.JLabel AccountText;
    private com.baker.tabbed.MaterialTabbed AllPanels;
    private javax.swing.JLabel CharacterText;
    private javax.swing.JLabel CheaterPlaceholder;
    private javax.swing.JLabel CheaterText;
    private javax.swing.JLabel DeveloperPlaceHolder;
    private javax.swing.JLabel DeveloperText;
    private javax.swing.JLabel ExpPlaceHolder;
    private javax.swing.JLabel ExpText;
    private javax.swing.JLabel FriendCodePlaceHolder;
    private javax.swing.JLabel FriendCodeText;
    private javax.swing.JLabel GemsPlaceholder;
    private javax.swing.JLabel GemsText;
    private javax.swing.JComboBox<String> KillsCombo;
    private javax.swing.JLabel KillsText;
    private javax.swing.JLabel LevelPlaceholder;
    private javax.swing.JLabel LevelText;
    private javax.swing.JLabel MainTitle;
    private javax.swing.JLabel MoneyPlaceholder;
    private javax.swing.JLabel MoneyText;
    private javax.swing.JLabel OtherTitle;
    private javax.swing.JLabel OtherTitle1;
    private javax.swing.JLabel Packsboughtplaceholder;
    private javax.swing.JLabel Packsopenedplaceholder;
    private javax.swing.JLabel UserBannedPlaceholder;
    private javax.swing.JLabel UserBannedText;
    private javax.swing.JLabel UsernamePlaceHolder;
    private javax.swing.JLabel UsernameText;
    private javax.swing.JButton add10000money;
    private javax.swing.JButton add1000money;
    private javax.swing.JButton add20000money;
    private javax.swing.JButton add5000money;
    private javax.swing.JComboBox<String> characterComboBox;
    private javax.swing.JLabel defeatsplaceholder;
    private javax.swing.JLabel defeatstext;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton level1;
    private javax.swing.JButton level10;
    private javax.swing.JButton level3;
    private javax.swing.JButton level5;
    private javax.swing.JButton lose1;
    private javax.swing.JButton lose5;
    private javax.swing.JPanel matchEditor;
    private javax.swing.JLabel packsboughttext;
    private javax.swing.JLabel packsopenedtext;
    private javax.swing.JButton reloadStatsButton;
    private javax.swing.JLabel tiesplaceholder;
    private javax.swing.JLabel tiestext;
    private javax.swing.JLabel totalMatchesPlaceholder;
    private javax.swing.JLabel totalmatchestext;
    private javax.swing.JPanel userInfoPanel;
    private javax.swing.JLabel victoriesplaceholder;
    private javax.swing.JLabel victoriestext;
    private javax.swing.JButton win1;
    private javax.swing.JButton win5;
    private javax.swing.JLabel winstraktext;
    private javax.swing.JLabel winstreakplaceholder;
    // End of variables declaration//GEN-END:variables
}
