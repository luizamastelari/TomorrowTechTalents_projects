package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ex1 {

            private double celsius_temp;

            public void temps (double celsius_temp){
                double kelvin_temp = celsius_temp + 273.5;
                double fahrenheit_temp = (celsius_temp * 1.8) + 32;
                double rankine_temp = fahrenheit_temp + 459.67;
                double reamur_temp = celsius_temp * 0.8;

                System.out.println(kelvin_temp + "K");
                System.out.println(fahrenheit_temp + "F");
                System.out.println(rankine_temp + "Ra");
                System.out.println(reamur_temp + "Re");
            }
}

