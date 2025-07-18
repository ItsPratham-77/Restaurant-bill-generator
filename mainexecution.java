package main;
import interfaceimpl.Mainimplmethods;

import java.util.Scanner;
public class mainexecution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Mainimplmethods imp=new Mainimplmethods();

        while (true) {
            System.out.println("1.TO GENERATE THE BILL");
            System.out.println("2.TO DISPLAY THE GENERATED BILL");
            System.out.println("3.TOTAL");
            System.out.println("4.Exit");

            int ch= sc.nextInt();

            switch (ch){
                case 1:
                    imp.billgenerator();
                    break;

                case 2:
                    imp.displaybill();
                    break;

                case 3:
                    imp.Total();
                    break;

                case 4:
                    return;


            }
        }
    }
}
