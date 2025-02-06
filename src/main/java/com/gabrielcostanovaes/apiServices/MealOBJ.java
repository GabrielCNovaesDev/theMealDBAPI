package com.gabrielcostanovaes.apiServices;

import com.google.gson.annotations.SerializedName;

public class MealOBJ {
    @SerializedName("strMeal")
    private String strMeal;
    @SerializedName("strInstructions")
    private String strInstructions;
    @SerializedName("idMeal")
    private String idMeal;
    @SerializedName("strCategory")
    private String strCategory;
    @SerializedName("strYoutube")
    private String strYoutube;

    public String getStrMeal() {
        return strMeal;
    }

    public String getStrInstructions() {
        return strInstructions;
    }

    public String getIdMeal() {
        return idMeal;
    }

    public String getStrCategory() {
        return strCategory;
    }

    public String getStrYoutube() {
        return strYoutube;
    }

    @Override
    public String toString() {
        return "Meal name ='" + strMeal + '\'' +
                ", Meal Description ='" + strInstructions + '\'' +
                ", Meal ID='" + idMeal + '\'' +
                ", Meal Category='" + strCategory + '\'' +
                ", Meal Youtube Link='" + strYoutube + '\''
                ;
    }
}
