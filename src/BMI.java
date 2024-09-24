/**
 * Carlos Matos
 * Description:Create program that computes and interpret BMI (Body Mass Index)
 * User enter his/her weight in pounds
 * User enter his/her height in inches
 *then program calculates bmi using Weight(kilograms)/height(meters^2)
 */




public class BMI {
    public static void main(String[]arg){
        java.util.Scanner in=new java.util.Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        double weight=in.nextDouble();
        System.out.println("Enter height in inches: ");
        double height=in.nextDouble();

        weight= weight*0.4536; //convert pounds to kilograms
        height= height*0.0254; //convert inhes to meters
        double BMI= weight/(height*height);

        if(BMI<18.5){
            System.out.println("You are Underweight");
        }
        else if (18.5 <= BMI && BMI <25.0){
            System.out.println("You are Normal");
        }
        else if (25.0 <= BMI && BMI < 30.0){
            System.out.println("You are Overweight");
        }
        else if (BMI >= 30.0){
            System.out.println("You are Obese");
        }

    }



}
