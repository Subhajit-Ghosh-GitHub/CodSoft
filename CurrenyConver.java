
import java.util.*;

public class CurrenyConver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  INPUT, choice;
        double amount,indian, usd, UAED,AUD;

        System.out.println("Enter 1 for INDIAN RUPEES\nEnter 2 for UNITED STATES DOLLAR\nEnter 3 for United Arab Emirates dirham \nEnter 4 for Australian dollar\n ");
        System.out.println("enter your currency type\n");
        INPUT = sc.nextInt();
        switch (INPUT) {
            case 1:
                System.out.println("Enter your INDIAN RUPEES amount:- ");
                amount = sc.nextInt();
                System.out.println("Convert Currency into :-\n");
                System.out.println("Enter 1 for INDIAN RUPEES\nEnter 2 for UNITED STATES DOLLAR\nEnter 3 for United Arab Emirates dirham \nEnter 4 for Australian dollar\n");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        indian=amount;
                        System.out.println("Convert into INDIAN RUPEES:- ₹ " + indian);
                        break;
                    case 2:
                        usd = (1 / 83.93) * amount;
                        System.out.println("convert into UNITED STATES DOLLAR:- $ " + usd);
                        break;
                    case 3:
                        UAED = amount * 0.04375;
                        System.out.println("Convert into  United Arab Emirates dirhams:-  د.إ  " + UAED);
                        break;
                    case 4:
                        AUD = amount * 0.01813;
                        System.out.println("Convert into  Australian dollar:- A$ " + AUD);
                        break;  
                        
                    default:
                        System.out.println("invalid input");    

                }
                break;

            case 2:
                System.out.println("Enter your UNITED STATES DOLLAR amount:- ");
                amount = sc.nextInt();
                System.out.println("Convert Currency into :-\n");
                System.out.println("Enter 1 for INDIAN RUPEES\nEnter 2 for UNITED STATES DOLLAR\nEnter 3 for United Arab Emirates dirham\nEnter 4 for Australian dollar\n");

                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        indian = 83.93 * amount;
                        System.out.println("Converted into INDIAN RUPEE:- ₹ " + indian);
                        break;
                    case 2:
                        usd = amount;
                        System.out.println("Converted into UNITED STATES DOLLAR:- $ " + usd);
                        break;
                    case 3:
                        UAED = amount * 3.673;
                        System.out.println("Converted into United Arab Emirates dirham:-  د.إ  " + UAED);
                        break;
                    case 4:
                        AUD = amount * 1.52;
                        System.out.println("Convert into  Australian dollar:- A$ " + AUD);
                        break;   
                    default:
                        System.out.println("invalid input");       

                }
                break;
            case 3:
                System.out.println("Enter your United Arab Emirates dirham amount:- ");
                amount = sc.nextInt();
                System.out.println("Convert Currency into :-\n");
                System.out.println("Enter 1 for INDIAN RUPEES\nEnter 2 for UNITED STATES DOLLAR\nEnter 3 for United Arab Emirates dirham\nEnter 4 for Australian dollar\n");

                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        indian = 22.86 * amount;
                        System.out.println("Converted into INDIAN RUPEE:- ₹ " + indian);
                        break;
                    case 2:
                        usd = 0.2723  * amount;
                        System.out.println("Converted into UNITED STATES DOLLAR:- $ " + usd);
                        break;
                    case 3:

                        System.out.println(" Converted into United Arab Emirates dirham :- د.إ  "+ amount);
                        break;
                    case 4:
                        AUD = amount * 0.41;
                        System.out.println("Convert into  Australian dollar:- A$ " + AUD);
                        break;      
                    default:
                        System.out.println("invalid input");    

                }
                break;
                
            case 4:
                System.out.println("Enter your  Australian dollar amount :- ");
                amount = sc.nextInt();
                System.out.println("Convert Currency into :-\n");
                System.out.println("Enter 1 for INDIAN RUPEES\nEnter 2 for UNITED STATES DOLLAR\nEnter 3 for United Arab Emirates dirham\nEnter 4 for Australian dollar\n");

                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        indian = 55.17* amount;
                        System.out.println("Converted into INDIAN RUPEE:- ₹ " + indian);
                        break;
                    case 2:
                        usd = 0.66  * amount;
                        System.out.println("Converted into UNITED STATES DOLLAR:- $ " + usd);
                        break;
                    case 3:
                        AUD=2.41*amount;
                        System.out.println(" Converted into United Arab Emirates dirham :- د.إ  "+ AUD);
                        break;
                    case 4:
                      
                        System.out.println("Convert into  Australian dollar:- A$ " + amount);
                        break;      
                    default:
                        System.out.println("invalid input");    
                }
            break;
        default:
            System.out.println("invalid input");
        }
        
    }
}