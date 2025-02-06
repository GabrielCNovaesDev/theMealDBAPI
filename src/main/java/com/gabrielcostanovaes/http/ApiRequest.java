package com.gabrielcostanovaes.http;

import com.gabrielcostanovaes.apiServices.MealOBJ;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiRequest {

    public void getReceipt(String mealName){
        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://www.themealdb.com/api/json/v1/1/search.php?s=" + mealName))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.IDENTITY)
                    .create();

            MealResponse mealResponse = gson.fromJson(response.body(), MealResponse.class);
            if (mealResponse.getMeals() != null && !mealResponse.getMeals().isEmpty()){
                MealOBJ meal = mealResponse.getMeals().get(0);
                System.out.println(meal);
            }else {
                System.out.println("Nenhuma refeição encontrada para: " + mealName);

            }
        }catch (Exception e){
            System.out.println("Erro ao buscar refeição: "+e.getMessage());
        }
    }
}
