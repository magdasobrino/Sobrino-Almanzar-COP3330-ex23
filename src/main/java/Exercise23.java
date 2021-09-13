/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Magdalena Sobrino-Almanzar
 */
import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args){

        String answer;
        Scanner scnr = new Scanner(System.in);

        System.out.println("Is the car silent when you turn the key?");
        answer = scnr.next();

        if(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")){
            System.out.println("Are the battery terminals corroded?");
            answer = scnr.next();

            if(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")){
                System.out.println("\nClean terminals and try starting again.");
            }
            else{
                System.out.println("\nReplace cables and try again.");
            }
        }
        else{
            System.out.println("Does the car make a slicking noise?");
            answer = scnr.next();

            if(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")){
                System.out.println("\nReplace the battery.");
            }
            else{
                System.out.println("Does the car crank up but fail to start?");
                answer = scnr.next();

                if(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")){
                    System.out.println("\nCheck spark plug connections.");
                }
                else{
                    System.out.println("Does the engine start and then die?");
                    answer = scnr.next();

                    if(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")){
                        System.out.println("Does you car have fuel injection?");
                        answer = scnr.next();

                        if(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")){
                            System.out.println("\nGet it in for service.");
                        }
                        else{
                            System.out.println("\nCheck to ensure the choke is opening and closing.");
                        }
                    }
                    else{
                        System.out.println("\nThis should not be possible.");
                    }
                }
            }
        }

        System.exit(0);
    }//end of main

}//end of program




