/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.baker.Requests;

import com.baker.utils.TypesChangers;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

/**
 *
 * @author Baker
 */
public class RequestPost {

    public void postGameSaveData(String userAuthToken, String[] bodyThingsToSend) {
        try { // falta acabar
            //TypesChangers typeChange = TypesChangers();
            JSONObject finalRequest = new JSONObject("{\"character\":\"" + bodyThingsToSend[0] +"\",\"bots\":0,\"gamemode\":0,\"map\":0,\"result\":"+bodyThingsToSend[2]+",\"ragequit\":0,\"hits\":2,\"misses\":2,\"headshots\":1,\"levelDifference\":22,\"cardsUsedCount\":2,\"roundsWon\":2,\"perfectRounds\":0,\"cardsUsed\":{\"44\":1,\"90\":1},\"myTeamMmr\":[{\"mu\":25.4,\"sigma\":8.3333,\"rating\":0.0}],\"otherTeamMmr\":[{\"mu\":30.1608162,\"sigma\":3.72432184,\"rating\":0.0}],\"localPlayerIndex\":0,\"newCardsSeen\":[11,71],\"extraBonus\":[],\"roundsWithUsedCards\":1,\"rounds\":3,\"canGetFirstBlood\":false,\"kills\":"+bodyThingsToSend[1]+",\"deaths\":1,\"Accuracy\":0.6666667}");
            TypesChangers utils = new TypesChangers();
            
            String finalRequestString = utils.jsonObjectToString(finalRequest);
            // POST REQUEST
            URL url = new URL("https://prod-fvf-fra1.estafasyusura.com/api/game/addMatchPerformance");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);

            // Required headers
            connection.addRequestProperty("Content-Length", utils.integerToString(finalRequestString.length()));
            connection.addRequestProperty("User-Agent", "UnityPlayer/2021.3.23f1 (UnityWebRequest/1.0, libcurl/7.84.0-DEV)");
            connection.addRequestProperty("Accept", "*/*");
            connection.addRequestProperty("Accept-Encoding", "deflate, gzip");
            connection.addRequestProperty("content-type", "application/json");
            connection.addRequestProperty("auth-token", userAuthToken);
            connection.addRequestProperty("game-version", "1.0.5");
            connection.addRequestProperty("X-Unity-Version", "2021.3.23f1");
            
            // POST REQUEST BODY
            String postData = finalRequestString;
            OutputStream outputStream = connection.getOutputStream();
            outputStream.write(postData.getBytes("UTF-8"));
            outputStream.flush();
            outputStream.close();

            // Getting the response Code
            int responseCode = connection.getResponseCode();
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder response = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // Imprimir la respuesta del servidor
            //if (responseCode.equals(typeChange.integerToString(responseCode))) {
                
            //}
            System.out.println("Código de respuesta: " + responseCode);
            System.out.println("Respuesta del servidor: " + response.toString());
            
            // Closing the connection
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
