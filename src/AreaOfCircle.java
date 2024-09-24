/**
 * Carlos Matos
 * Description: Create a program that prompt to enter radius of a circle
 *  and calculate the area postively
 *(If number is negative. the program prints Invaild Entry)
 */




public class AreaOfCircle {
    public static void main(String[] args) {

        java.util.Scanner input= new java.util.Scanner(System.in);
        final double pi= 3.1416; //pi is a constant variable
        System.out.println("Enter an postive radius: ");
        double radius= input.nextDouble();
        System.out.println("the radius value entered by is " +radius);
        if (radius > 0){
            double area= pi * (radius * radius);
            System.out.println("The Calculated value of the circle area is  " +area);
        }
        else{
            System.out.println("Invalid Entry");
        }


    }
}
