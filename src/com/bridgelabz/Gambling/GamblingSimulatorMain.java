package com.bridgelabz.Gambling;
import java.util.*;
class GamblingSimulatorMain {
    // Use case 1 - Declaration
    public static final int initialStake =100;
    public static final int betAmount =1;
    public static final int noOfDays =20;

    public static void main(String[] arg) {
        double random_number = Math.random();
        
        
        //Use Case 2 
        int remainingStake = initialStake;
        if (random_number>0.5){
            remainingStake += betAmount;
            System.out.println("The Gambler wins the bet and he has $"+remainingStake+ " with him after one bet.");
        }else{
            remainingStake -= betAmount;
            System.out.println("The Gambler loses the bet and he has $"+remainingStake+ " with him after one bet.");
        }

        // Use Case 3 
        double totalAmt = initialStake;
        while ((totalAmt < 150) && (totalAmt > 50)) {

            if (random_number > 0.5) {
                totalAmt += betAmount;
            } else {
                totalAmt -= betAmount;
            }
        }
        System.out.println("The gambler resigns for the day after he has $" + totalAmt + " with him.");

        // Use Case 4 
        double totalAmountForDay = 0;
        double dailyAmount = 0;
        for (int i = 1; i <= noOfDays; i++) {
            int numberOfBets = 0;
            while ((dailyAmount < 50) && (dailyAmount > -50) && (numberOfBets < initialStake)) {
                numberOfBets++;

                if (random_number > 0.5) {
                    dailyAmount += betAmount;
                } else {
                    dailyAmount -= betAmount;
                }
            }
            totalAmountForDay += dailyAmount;
        }
        
        if (totalAmountForDay > 0) {
            System.out.println("The total amount won in 20 days = " + totalAmountForDay);
        } else if (totalAmountForDay == 0) {
            System.out.println("There is no net gain in last 20 days");
        } else {
            System.out.println("The total amount lost in last 20 days = " + Math.abs(totalAmountForDay));
        }

        //Use Case 5  
        for(int j=1; j<=30;j++) {
            if (dailyAmount > 0) {
                System.out.println("The amount won on day " + j + " = $" + dailyAmount);
            } else if (dailyAmount == 0) {
                System.out.println("There is no net gain or loss on day " + j);
            } else {
                System.out.println("The amount lost on day " + j + " = $" + Math.abs(dailyAmount));
            }
        }
    }   
    }