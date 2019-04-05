package main;

import java.util.Scanner;

public class Shop {
    IPlayer player;
    public Shop(IPlayer player) {
        this.player = player;
    }

    public void menuShop(){
        Scanner sc = new Scanner(System.in);
        char answer;
        do {
            System.out.println("******************");
            System.out.println("1. Attack amulet ( +5 strenght)  - 100 gold ");
            System.out.println("2. Defense amulet ( -2 toughness)  - 100 gold ");
            System.out.println("E. Exit");
            answer = sc.next().charAt(0);
            switch (answer) {
                case '1': {
                    if (player.getGold() >= 100){
                        player.setGold(player.getGold() - 100);
                        System.out.println("Now you have " + player.getGold() + " gold");
                        player.setStrength(player.getStrength()+5);
                        System.out.println(" You bought the Attack Amulet!");
                    } else {
                        System.out.println("Not enough money!");
                    }
                    break;
                }
                case '2': {
                    if (player.getGold() >= 100){
                        player.setGold(player.getGold() - 100);
                        System.out.println("Now you have " + player.getGold() + " gold");
                        player.setToughness(player.getToughness()+2);
                        System.out.println(" You bought the Defense Amulet!");
                    } else {
                        System.out.println("Not enough money!");
                    }
                    break;
                }
                case 'E': {
                    System.out.println("You are leaving the shop.");
                    break;
                }
                default: {
                    System.out.println("Bad value");
                    break;
                }
            }
        } while (answer != 'E');

    }

}
