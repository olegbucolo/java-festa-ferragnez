package com.ferragnez.party;

import java.util.Arrays;
import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        String[] guestNames ={"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entra il tuo nome");
        String currName = scanner.nextLine();

        boolean found = Arrays.stream(guestNames).anyMatch(name -> name.equalsIgnoreCase(currName));
        if(found){
            System.out.println("Entra pure, sei in lista");
        }else{
            System.out.println("Non puoi entrare, pero' puoi scavalcare se la security non guardaj");
        }
    }
}
