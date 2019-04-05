package main;


import monsters.*;

import java.util.Scanner;

public class Game {
     IPlayer player;
     Shop shop;

    public void playGame(){
        greeting();
        menu();
    }


    public void greeting(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Welcome to the game!");
        System.out.print("Enter your name:");
        String name = sc.nextLine();
        player = new Player(name);
        shop = new Shop(player);
    }
    public void promtEnterKey(){
        System.out.println("[Press ENTER to continue...]");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
    }


    public void battle(IMonster monster){
        while (!player.isDead() || !monster.isDead()){
            int powerPlayer = player.attack();
            System.out.println("You hit the monster dealing " + powerPlayer + " damage." );
            monster.takeDamage(powerPlayer);
            System.out.println("Uuoooahh! Uuoooahhh! Uuoooahh!");
            if (monster.isDead()){
                System.out.println("You killed the monster gaining " + monster.getExp() + " experiense and " + monster.getGold() + " gold" );
                player.giveExp(monster.getExp());
                if (player.getExp() >= player.expMax){
                    player.levelUp();
                }
                player.giveGold(monster.getGold());
                System.out.println("You are level " + player.getLevel() + " and have " + player.getHp() + " hp, "+ player.getExp() + " experience and " + player.getGold() + " gold. ");
                break;
            }
            monster.attack();
            player.takeDamage(monster.getAttackPower());
            System.out.println("The monster hit you dealing " + monster.getAttackPower() + " damage" );
            if (player.isDead()){
                System.out.println("The monster killed you!");
                System.out.println("Game over!");
                System.exit(1);

            }
            System.out.println(player.getName() + ": " + player.getHp() + " hp");
            System.out.println(monster.getName() + ": " +monster.getHp() + " hp");
            promtEnterKey();

        }

    }

    public void goAventur(){
        if (RandomHelper.getBigchance()){
            IMonster nextmonster = generate();
            System.out.println("Ohohhooh! You meet a scary " + nextmonster.getName() + " monster! It will be battle now!!!");
            battle(nextmonster);
        } else {
            System.out.println("You see nothing but grass and trees! All monsters are sleeping!");
        }

    }

    public void menu(){
        Scanner sc = new Scanner(System.in);
        char answer;
        do {

            System.out.println("1. Go adventuring");
            System.out.println("2. Show details about character");
            System.out.println("3. Go to shop");
            System.out.println("E. Exit game");
            answer = sc.next().charAt(0);
            switch (answer) {
                case '1': {
                    goAventur();
                    break;
                }
                case '2': {
                    player.printPlayer();
                    break;
                }
                case '3': {

                    System.out.println("Welcome! What do you want to bye?");
                    System.out.println("You have " + player.getGold() + " gold.");
                    shop.menuShop();
                    break;
                }
                case 'E': {
                    System.out.println("Bye!!");
                    System.exit(1);
                }
                default: {
                    System.out.println("Bad value");
                    break;
                }
            }
        } while (answer != 'E');
    }

    public IMonster generate(){

        int index = RandomHelper.getInt(1,IMonster.monsterTypeNumber);
        IMonster monster;
        switch (index){
            case 1:{
                monster = new GiantWurm();
                break;
            }
            case 2: {
                monster = new Dragon();
                break;
            }
            case 3: {
                monster = new Chupacabra();
                break;
            }
            default: {
                monster = new Chupacabra();
            }
        }
        return monster;
    }





}
