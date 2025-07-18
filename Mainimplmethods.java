package interfaceimpl;
import interfaceM.interfacemodel;
import model.modelclass;

import java.util.*;
public class Mainimplmethods implements interfacemodel {
   Scanner sc=new Scanner(System.in);
   modelclass mm=new modelclass();

    @Override
    public void billgenerator() {
         {
            System.out.println("---HOTEL KRISHNA---");
            System.out.println("Enter the name of the dish");
            mm.setDishName(sc.next());
            System.out.println("Enter The Quantity of the dish");
            mm.setDishQuantity(sc.nextInt());
            System.out.println("Enter the price of the dish");
            mm.setDishPrice(sc.nextInt());
        }


    }

    @Override
    public void displaybill() {
        System.out.println("DISH NAME-->"+mm.getDishName());
        System.out.println("DISH QUANTITY--> "+mm.getDishQuantity());
        System.out.println("DISH PRICE--->"+mm.getDishPrice());
    }

    @Override
    public void Total() {
                System.out.print("Enter number of dishes: ");
                int numberOfDishes = sc.nextInt();

                double total = 0;
                for (int i = 1; i <= numberOfDishes; i++) {
                    System.out.print("Enter price of dish " + i + ": ");
                    double price = sc.nextDouble();
                    total += price;
                }

                System.out.println("Total Price of All Dishes: ₹" + total);
            }
        }




