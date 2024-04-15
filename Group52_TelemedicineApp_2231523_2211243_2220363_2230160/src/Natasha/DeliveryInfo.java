/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Natasha;

/**
 *
 * @author Orin
 */
public class DeliveryInfo {
    public static void main(String[] args) {
        // Define the delivery information in a 2D array
        String[][] deliveryInfo = {
                {"Customer Name", "Delivery Address", "Distance", "Duration"},
                {"Alice", "Dhaka", "100km", "1 hour"},
                {"Bob", "Dhaka", "150km", "2 hours"}
        };

        // Print the delivery information in a table format
        for (int i = 0; i < deliveryInfo.length; i++) {
            for (int j = 0; j < deliveryInfo[i].length; j++) {
                System.out.printf("%-15s", deliveryInfo[i][j]); // Adjust the width as needed
            }
            System.out.println();
        }
    }
}
