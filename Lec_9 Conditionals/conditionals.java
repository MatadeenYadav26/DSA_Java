import java.util.Scanner;

public class Conditionals {

    static void main(String[] args) {
//        int xyz = 9;
//        if(xyz >= 10){
//            System.out.println("This is a conditional");
//        } else if (xyz == 9){
//            System.out.println("This is an if-else case");
//        } else{
//            System.out.println("This is not a conditional");
//        }

        // Nested if-else case:

//        boolean xyz = true;
//        int xzz = 220;
//
//        if (xyz == false){
//
//            if(xzz > 220){
//                System.out.println("Inside if block");
//            } else if (xzz<220) {
//                System.out.println("Inside else-if block");
//            }
//            else{
//                System.out.println("Inside else block");
//            }
//        }
//
//        else{
//            System.out.println("Run-Run-Run");
//        }


// Ternary Operator:
//        int xyz = 10;
//        String somevariable = (xyz >= 18)?"True value":"False value";
//        System.out.println(somevariable);
//        int outcome = (xyz>12)?18:8;
//        System.out.println(outcome);


// Switch-Case:

        System.out.println("Enter the value of Day: ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();


switch(day){
            case 1:
                System.out.println("This is Monday");
                break;
                case 2:
                System.out.println("This is Tuesday");
                break;
                case 3:
                System.out.println("This is Wednesday");
                break;
                case 4:
                System.out.println("This is Thursday");
                break;
                case 5:
                System.out.println("This is Friday");
                break;
                case 6:
                System.out.println("This is Saturday");
                break;
                case 7:
                System.out.println("This is Sunday");
                break;
            default:
                System.out.println("This is out of Weeks");
        }
        
    }

}
