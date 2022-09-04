package com.iure.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Random;

import java.util.Random;

public class home {

    public static void main(String[] args) {

       
        Random gerador = new Random();
        
        
        for (int i = 0; i < 6; i++) {
            System.out.println(gerador.nextInt(59));
        }
        
    }
   
}


