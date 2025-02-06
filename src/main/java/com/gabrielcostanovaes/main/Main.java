package com.gabrielcostanovaes.main;

import com.gabrielcostanovaes.http.ApiRequest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ApiRequest apiRequest = new ApiRequest();

        System.out.println("Digite o nome da comida: ");
        String input = sc.nextLine();
        apiRequest.getReceipt(input);

    }
}
