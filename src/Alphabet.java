/**
 * Carlos Matos
 * Description:Write a program that use switch statements
 * program classify an alphabet random generate( Characters A through z)
 * between and print wheather it is in the first four letters
 * and a vowel or a consonant
 * ot not an alphabet character.
*/
import java.util.Random;
public class Alphabet {

    public static void main(String[]arg){


        Random rand= new Random();

        char alphabet= (char)(rand.nextInt(26)+'A'); //Generate from A to z
        //https://stackoverflow.com/questions/2626835/is-there-functionality-to-generate-a-random-character-in-java
        //use this to find there a command in random package to generate random alphabet

        //System.out.println(alphabet); to test out random alphabet

        switch (alphabet){
            case 'A':
                System.out.println(" in the first four letters and a vowel"); break;
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
                System.out.println(" in the first four letters and a vowel"); break;
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            System.out.println("a vowel");
            break;
            case 'B':
            case 'C':
            case 'D':
            case 'b':
            case 'c':
            case 'd':
            System.out.println("in the first four letters");
            default:
                if((alphabet>= 'A' && alphabet<='Z') || (alphabet>= 'a' && alphabet<='z')){ //'A' and 'a' are different
                    System.out.println("a consonant");
                }
                else{
                    System.out.println("not an alphabet");
                }




        }








        }




    }


