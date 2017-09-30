package com.company;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bluecount = 0;
        int redcount = 0;
        int greencount = 0;
        String[] colors = {"blue", "green", "red"};

        System.out.println("What's up, welcome ! we are going on a little adventure today but \nfirst we must guess Mel (the grumpy ol' color troll) favorite color. That way she can let us over the bridge. \nTo start , you'll have to guess Mel's favorite color. \nShe is very picky and only likes certain colors.\nShe wants you to choose either RED, BLUE, or GREEN. Now pick before She get's angry!!!!!");
        String userInput = input.nextLine();
        switch (userInput) {
            case "blue":
                System.out.println("Do you like Yellow? Y or N");
                String userInput2 = input.nextLine();
                if (userInput2.toLowerCase().equals("y")) {
                    bluecount++;
                    System.out.println("You earned a point !");
                    System.out.println("Round 2. Type in 'red' backwards to unlock the next color level.");
                    String redinput = input.nextLine();
                    if (redinput.equals("der")){
                        System.out.println(" Looks like you are getting mel to warm up. She told you she DID NOT like RED or BLUE!");
                        System.out.println("what color you think is her favorite now !");
                        String answerinput = input.nextLine();
                        if(answerinput.toLowerCase().equals("green")){
                            System.out.println("You did it ! You guessed right! Mel's favorite color is green. \n now run and find some green things to keep her happy! ");
                        }
                    }

                } else {
                    System.out.println("you didn't earn a point but ,now you can choose again!");
                }
                break;

            case "red":
                System.out.println("Do you like purple? Y or N");
                String userInput3 = input.nextLine();
                if (userInput3.toLowerCase().equals("y")) {
                    System.out.println("pick a number from 0-6!");
                    int numInput = input.nextInt();
                    for (int i = 0; i <= numInput; i++) {
                        redcount += i;
                    }
                    System.out.println("You have now earned " + redcount + " points!");
                    String userInput7 = input.nextLine();
                    System.out.println("looks like you have "+ redcount + " points!. Would you like to buy a life line? Y or N");
                    String userInput6 = input.nextLine();
                    if(userInput6.toLowerCase().equals("y")){
                        System.out.println(" You've unlocked Mel's special code. Carefully , Type in 34321");
                        int numInput3 = input.nextInt();
                        System.out.println(" You did it ! you unlocked Mel's favorite color . It's " + colors[greencount]+ "!");
                    } else if(userInput6.toLowerCase().equals("n")){
                        System.out.println("You lost! Mel got tired of waiting and bite your head off.");
                    }

                } else {
                    System.out.println("Wrong answer!, run again.");

                }
                break;
            case "green":

                System.out.println("Do you like teal?");
                String userInput4 = input.nextLine();

                System.out.println("Now we have to guess what's Mel's favorite color.... what color do you think she'll like?");
                String userInput5 = input.nextLine();
                while (true) {

                    if (userInput5.equals("blue")) {
                        greencount+=2;
                        break;

                    } else if (userInput4.equals("n")) {
                        break;
                    }
                    System.out.println("pick pick pick pick pick another color!");
                    String userInput6 = input.nextLine();
                }
            default:
                System.out.println("mel's favorite color is " + colors[greencount] + " ! ");
        }


        // write your code here
    }
}
