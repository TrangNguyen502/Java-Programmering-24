package Coding_playground.Coding_exercises;

import java.util.Scanner;

class Uppgift3 {
    public static void main(String[] args){
        System.out.println("Write a number:");
        Scanner sc = new Scanner(System.in);
        double answer = sc.nextDouble();
    
            if (answer < 0 && answer <= 1){
                System.out.println("Number is negativ.");
                if (answer <= 1){
                    System.out.println("The number is small.");
                }
            }
            else if (answer > 0 ){
                System.out.println("Number is positiv");
                if (answer > 1000000){
                    System.out.println("The number is a big number.");
                }
            }
            else{
                System.out.println("The numver is 0");
            }
        }
    }
    
