/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog6112a1q2vuyogobast10456147;

/**
 *
 * @author lab_services_student
 */
public class Prog6112A1Q2VuyoGobast10456147 
{
    // Encapsulated fields (information hiding)
    private String name;// (Farrell, 2019)
    private double price;
    private int quantity;

    // Constructor
    public void Product(String name, double price, int quantity) // (Farrell, 2019)
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and setters (encapsulation)
    public String getName() // (Farrell, 2019)
    {
        return name;
    }

    public void setName(String name) // (Farrell, 2019)
    {
        this.name = name;
    }

    public double getPrice() // (Farrell, 2019)
    {
        return price;
    }

    public void setPrice(double price) // (Open AI, 2024)
    {
        this.price = price; // (Open AI, 2024)
    }

    public int getQuantity() // (Farrell, 2019) 
    {
        return quantity;
    }

    public void setQuantity(int quantity) // (Open AI, 2024)
    {
        this.quantity = quantity; // (Open AI, 2024)
    }

    // Method to display product information
    public void displayInfo() // (Farrell, 2019) 
    {
        System.out.println("Product Name: " + name); // (Farrell, 2019)
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
    }
    
    
    
    //Subclass
    public class Electronics extends Prog6112A1Q2VuyoGobast10456147 //(Open AI, 2024) 
    {
    // Additional field specific to Electronics
    private int warranty; // warranty in months

    // Constructor
    public Electronics(String name, double price, int quantity, int warranty) 
    {
        super(name, price, quantity); // (Open AI, 2024)
        this.warranty = warranty; // (Open AI, 2024)
    }

    // Getter and setter for warranty
    public int getWarranty() // (Farrell, 2019)
    {
        return warranty;
    }

    public void setWarranty(int warranty) // (Open AI, 2024)
    {
        this.warranty = warranty;
    }

    // Override displayInfo method to include warranty information
    @Override // (Open AI 2024)
    public void displayInfo() 
    {
        super.displayInfo(); //(Open AI, 2024)
        System.out.println("Warranty: " + warranty + " months");
    }
}
    
    //Subclass
    public class Groceries extends Prog6112A1Q2VuyoGobast10456147 //(Open AI, 2024)
    {
    // Additional field specific to Groceries
    private String expirationDate;

    // Constructor
    public Groceries(String name, double price, int quantity, String expirationDate) 
    {
        super(name, price, quantity); //(Open AI, 2024)
        this.expirationDate = expirationDate; //(Open AI, 2024)
    }

    // Getter and setter for expirationDate
    public String getExpirationDate() // (Farrell, 2019) 
    {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) 
    {
        this.expirationDate = expirationDate; //(Open AI, 2024)
    }

    // Override displayInfo method to include expiration date
    @Override //(Open AI, 2024)
    public void displayInfo() 
    {
        super.displayInfo(); // (Open AI, 2024)
        System.out.println("Expiration Date: " + expirationDate);
    }
}
    
    //Main Method
    public static void main(String[] args) 
    {
        // Create an array to store products
        Prog6112A1Q2VuyoGobast10456147[] inventory = new Prog6112A1Q2VuyoGobast10456147[4]; // (Open AI, 2024)

        // Add products to the inventory
        inventory[0] = new Electronics("Laptop", 1000.00, 5, 24); // (Open AI, 2024)
        inventory[1] = new Electronics("Smartphone", 700.00, 10, 12);
        inventory[2] = new Groceries("Milk", 2.50, 30, "2024-09-10");
        inventory[3] = new Groceries("Bread", 1.50, 50, "2024-09-05");

        // Loop through the inventory and display product information
        System.out.println("Inventory Details:");
        for (Prog6112A1Q2VuyoGobast10456147 product : inventory) // (Open AI, 2024) 
        {
            product.displayInfo();
            System.out.println("-------------------------");
        }

        // Example of updating product information
        inventory[0].setPrice(950.00); // Update the price of the laptop
        inventory[2].setQuantity(25); // Update the quantity of milk

        // Display updated inventory information
        System.out.println("Updated Inventory Details:");
        for (Prog6112A1Q2VuyoGobast10456147 product : inventory) //(Open AI, 2024) 
        {
            product.displayInfo();
            System.out.println("-------------------------");
        }
    
    }
    
}

//REFERENCE LIST:
//Farrell J. 2019. Java Programming. 9th ed. Boston: Cengage.
//Open AI. (2024). ChatGPT [Language model]. https://chatgpt.com/