/**
 * Carlos Matos
 * Description:Crate a program to read three integer from user input
 *then print the largest number
 *
 */



public class IntToLargeNum {
    public static void main(String[]arg){

        java.util.Scanner input= new java.util.Scanner(System.in);
        System.out.println("Enter the 1st integer: ");
        int FirstInt= input.nextInt();
        System.out.println("Enter the 2nd integer: ");
        int SecondInt= input.nextInt();
        System.out.println("Enter the 3rd integer: ");
        int ThirdInt= input.nextInt();

        if (FirstInt>SecondInt && FirstInt>ThirdInt){
            System.out.println(" the largest number is " +FirstInt);
        }
        else if (SecondInt>FirstInt && SecondInt>ThirdInt){
            System.out.println(" the largest number is " +SecondInt);
        }
        else if (ThirdInt>FirstInt && ThirdInt>SecondInt){
            System.out.println(" the largest number is " +ThirdInt);
        }
        else if (FirstInt==SecondInt || FirstInt==ThirdInt){ // Need to think about two of the same integer
            System.out.println("The largest number is " +FirstInt);
        }
        else if (SecondInt==ThirdInt || SecondInt==FirstInt){
            System.out.println("The largest number is " +SecondInt);
        }
        else if (ThirdInt==FirstInt || ThirdInt==SecondInt){
            System.out.println("The largest number is " +ThirdInt);
        }
        else{
            System.out.println("Number given was not an integer");
        }







    }

}
