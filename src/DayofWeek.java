/**
 * Carlos Matos
 * Description: Create a program prompts the user to enter day of the week
 * As a interger between 1 and 7 (Sunday through Saturday)
 * 1 through 5 inclusive for week day
 * 6 and 7 for weekend
 * else invaild week day
 */



public class DayofWeek {
    public static void main(String[]arg){

        java.util.Scanner in= new java.util.Scanner(System.in);
        System.out.println("Enter weekday through 1 to 7: ");
        int weekday=in.nextInt();
        switch (weekday){
            case 1:
                System.out.println("Weekday"); break;
            case 2:
                System.out.println("Weekday"); break;
            case 3:
                System.out.println("Weekday"); break;
            case 4:
                System.out.println("Weekday"); break;
            case 5:
                System.out.println("Weekday"); break;
            case 6:
                System.out.println("Weekend"); break;
            case 7:
                System.out.println("Weekend"); break;
                default:
                    System.out.println("Invalid week day");



        }


    }
}
