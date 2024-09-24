/**
 * Carlos Matos
 * Description:Create program to calculate cost of car insurance
 * based on the driver age and number of accidents
 *
 */






public class CarInsurance {

    public static void main(String[] args) {

        int base=300; //Base insurace cost is 300$

        java.util.Scanner in=new java.util.Scanner(System.in);
        System.out.println("Enter Driver Age: ");
        int age=in.nextInt();
        System.out.println("Enter number of accidents: ");
        int accident=in.nextInt();

        int cost; //declare in memory

        if (age<27){
            base +=100;
        }
        else{
            base=300;
        }
        switch (accident){
            case 1:
                cost=base+100; System.out.println("The car insurance is " +cost);
                break;
            case 2:
                cost=base+150;  System.out.println("The car insurance is " +cost);
                break;
            case 3:
                cost=base+250;  System.out.println("The car insurance is " +cost);
                break;
            default:
                if (accident>=4){
                    cost=base+1000;
                    System.out.println("The car insurance is " +cost);
                }
                break;

        }




    }





}
