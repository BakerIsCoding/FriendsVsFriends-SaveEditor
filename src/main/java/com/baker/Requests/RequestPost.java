/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.baker.Requests;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author Baker
 */
public class RequestPost {

    public void postGameSaveData() {
        try { // falta acabar

            // URL a la que enviar la solicitud POST
            URL url = new URL("https://prod-fvf-fra1.estafasyusura.com/api/game/addMatchPerformance");

            // Abrir la conexión HTTP
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Configurar la conexión para una solicitud POST
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);

            // Añadir headers a la solicitud
            connection.addRequestProperty("Content-Type", "application/json");
            connection.addRequestProperty("Authorization", "Bearer tu_token");

            // Datos a enviar en la solicitud POST
            String postData = "parametro1=valor1&parametro2=valor2";

            // Escribir los datos en el cuerpo de la solicitud
            OutputStream outputStream = connection.getOutputStream();
            outputStream.write(postData.getBytes("UTF-8"));
            outputStream.flush();
            outputStream.close();

            // Obtener la respuesta del servidor
            int responseCode = connection.getResponseCode();
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder response = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // Imprimir la respuesta del servidor
            System.out.println("Código de respuesta: " + responseCode);
            System.out.println("Respuesta del servidor: " + response.toString());

            // Cerrar la conexión
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
