//CS200
//Spring, 2020 
//Tien Nguyen
//Instructor: Y. Gutstein 
//HW#1: Conditions - If-Else
//Due: Feb 18th 
//File name: Conditions.jav

import java.util.Scanner;
public class Conditions
{
   public static void main(String[] args)
   {
      Scanner kbd = new Scanner(System.in);
      System.out.println("Hello, you have reached Java Coding Company.");
      System.out.println("Press 1 for Accounting.");
      System.out.println("Press 2 for HR.");
      System.out.println("Press 3 for IT.");
      System.out.println("Press 4 for Customer Service.");
      System.out.println("Press 5 to speak to the operator.");
      System.out.print("Your choice: ");
      int choice = kbd.nextInt();
      if (choice == 1){
      System.out.println("Good Day, you have reached the accounting department, and we are very busy crunching numbers, please leave a message.");
      }
      else if (choice == 2){
      System.out.println("Good Day, you have reached the HR department, and we are very busy crunching numbers, please leave a message.");
      }
      else if (choice == 3){
      System.out.println("Good Day, you have reached the IT department, and we are very busy crunching numbers, please leave a message.");
      }
      else if (choice == 4){
      System.out.println("Good Day, you have reached the customer service department, and we are very busy crunching numbers, please leave a message.");
      }
      else if (choice == 5){
      System.out.println("Good Day, you have reached the operator, and we are very busy crunching numbers, please leave a message.");
      }
      else {
      System.out.println("Please enter 1 to 5");
      }
   }
}
      
