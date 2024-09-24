/**
 * Carlos Matos
 * Description: Create program that prompts the user
 * to enter length of the three edges of a triangle
 * program calculate the perimeter of the triangle if input vaild
 * otherwise print invaild
 *
 */






public class EdgeTriangle {

    public static void main(String[]arg){
        java.util.Scanner in=new java.util.Scanner(System.in);
        System.out.println("Enter one of the length of triangle: ");
        double a=in.nextInt();
        System.out.println("Enter another of the length of triangle: ");
        double b=in.nextInt();
        System.out.println("Enter last of the length of triangle: ");
        double c=in.nextInt();

        if (a + b > c &&  a + c > b && b+c > a && a+c >b){ //sum of every two pair greater then remainding edge.
            double perimeter=a+b+c;
            System.out.println("Perimeter of the triangle is: "+perimeter);
        }
        else{
            System.out.println("invalid input");
        }






    }
}
