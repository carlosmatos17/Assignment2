/**
 * Carlos Matos
 * Description:User input number to guess a number between 0 to 10
 *
 */

public class Random_Numbers {
    public static void main(String[]arg){

        java.util.Scanner input= new java.util.Scanner(System.in);

        System.out.println("Guess number between 0 and 10: ");
        int number= input.nextInt();

        int NumRand= (int)(Math.random()* 11); // select Data type then (Math.random() *11)
        //computer starts from 0 so you use 11 to do 0 to 10

        if (number == NumRand){
            System.out.println("Horrary you guessed the number.");
        }
        else{
            System.out.println("You Lost!!");
        }


    }
}
