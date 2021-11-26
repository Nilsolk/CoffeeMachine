package machine;
import java.util.*;

public class CoffeeMachine {
    static Scanner sc = new Scanner(System.in);
    static int  water = 400;
    static int milk = 540;
    static int beans = 120;
    static int  cups = 9;
    static int money = 550;
    public static void remaining(){
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(beans + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$" + money + " of money");
    }
    public static void espresso(){
        water = water - 250;
        beans = beans - 16;
        cups = cups - 1;
        money = money + 4;
    }
    public static void latte(){
        water = water - 350;
        milk = milk - 75;
        beans = beans - 20;
        cups = cups - 1;
        money = money + 7;


    }
   public static void cappuccino(){
        water = water - 200;
        milk = milk - 100;
        beans = beans - 12;
        cups = cups - 1;
        money = money + 6;


    }
    public static void buy(){
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
        switch (sc.next()){
            case "1":
                if(water >= 250 && beans >= 16 && cups >= 1 ){
                    espresso();
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                }

                break;
            case "2":
                if(water >= 350 && beans >= 20 && cups >= 1 && milk >= 75 ){
                    latte();
                } else{
                    System.out.println("I have enough resources, making you a coffee!");
                }
                break;
            case "3":
                if(water >= 200 && beans >= 12 && cups >= 1 && milk >= 100 ) {
                    cappuccino();
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                }
                break;
            case "back":

        }
    }
    public static void fill(){
        System.out.println("Write how many ml of water you want to add: ");
        water += sc.nextInt();
        System.out.println("Write how many ml of milk you want to add: ");
        milk += sc.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add: ");
        beans += sc.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add: ");
        cups += sc.nextInt();

    }
    public static void take(){
        System.out.println("I gave you $"+money);
        money = 0;

    }



    public static void main(String[] args) {
        boolean flag = true;

        while (flag){
        System.out.println("Write action (buy, fill, take):");
        switch (sc.nextLine()){
            case "buy":
                buy();
                break;
            case "fill":
                fill();
                break;
            case "take":
                take();
                break;
            case "remaining":
                remaining();
                break;
            case "exit":
                flag = false;
                break;

        }


    }
    }
}