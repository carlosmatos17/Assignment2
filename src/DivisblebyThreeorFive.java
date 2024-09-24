/**
 * Carlos Matos
 * Description: Write program that prompt user to enter a number
 * Checks if number is divisbly by 3 and 5, the program prints number is a multiple of 3 and a multiple of 5
 * Checks if a numbers is divisbleb by 3 or 5, the program only prints that number is a multiple of either 3 or 5
 * If the number is divisble by only one of the numbers
 * The program prints the number is divisble by either 3 or 5 but not both.
 */




public class DivisblebyThreeorFive {
    public static void main(String[]arg){

        java.util.Scanner in= new java.util.Scanner(System.in);
        System.out.println("Enter an number: ");
        int nums=in.nextInt();
        //int test= 15%3; Mod is 0
        //int test2= 15%5; Mod is 0
        //System.out.println(test);
        //System.out.println(test2);
        if(nums%3==0 && nums%5==0){
            System.out.println("The number is a multiple of 3 and a multiple of 5");
        }
        else if (nums%3==0 || nums%5==0){
            if (nums%3!=0 && nums%5==0){
                System.out.println("The number is divible by either 3 or 5 but not both");
            }
            if (nums%3==0 && nums%5!=0){
                System.out.println("The number is divible by either 3 or 5 but not both");
            }
            else{
                System.out.println("The number is a multiple of either 3 or 5");
            }

        }
        else{
            System.out.println("The Entry is invaild");
        }


    }
}
