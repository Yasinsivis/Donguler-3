package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 int number,i=1,j=1;
     Scanner input=new Scanner(System.in);

                System.out.print("Lütfen Sayı Giriniz:");
                number=input.nextInt();


               while (i<=number){
                 i*=4;
                System.out.println("4 ün Kuvvetleri: " + i);
                j=j*5;
                System.out.println("5 in Kuvvetleri :"+j);
                   System.out.println("--------");
               }

    }
}
