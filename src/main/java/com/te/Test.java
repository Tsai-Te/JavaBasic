package com.te;

import javax.swing.*;

public class Test {

public static void main (String args[]) {
    final double purchaseFee = 5.93;
    final double deliveryRate = 0.02;
    int seatNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter your seat number"));
    double ticketPrice=0;

        if (seatNumber  < 1 || seatNumber > 306){
//            ticketPrice=99;
        JOptionPane.showMessageDialog(null, "Error: You entered an invalid seat number.");

        } else{
        if(seatNumber > 0 && seatNumber < 32){
        ticketPrice = 656.35;
        }
        else if(seatNumber > 31 && seatNumber < 68){
        ticketPrice = 391.29;
        }
        else if(seatNumber > 67 && seatNumber < 107){
        ticketPrice = 172.40;
        }
        else{
        ticketPrice = 89.15;
        }
        }
        JOptionPane.showMessageDialog(null, ticketPrice);
        }
}
